/**
 * MESUT BUNALDI
 * 111044077
 * DATA STRUCTURES AND ALGORITHMS
 * HOMEWORK 05
 */


package Q1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 *
 * @param <K> KEY
 * @param <V> VALUE
 */
public class MyMap<K,V> implements Map<K,V>{
    /**
     *test MyMap class
     * @param args arguments
     */
    public static void main(String args[]){
        MyMap<Integer,String> myMap=new MyMap<>();

        myMap.put(0,"Mesut");
        myMap.put(1,"Efkan");
        myMap.put(2,"Efkan2");
        myMap.put(4,"Ali");
        myMap.put(5,"Veli");
        myMap.put(6,"Mehmet");
        myMap.put(7,"Yasin");
        myMap.put(8,"Şeyma");
        myMap.put(9,"Lale");
        myMap.put(10,"Emel");
        myMap.put(11,"Pelin");
        myMap.put(12,"Lerzan");
        myMap.put(13,"Jale");
        System.out.println(myMap.toString());

        System.out.println(myMap.remove(4));

        System.out.println(myMap.toString());
        System.out.println("Size : "+myMap.size());

        System.out.println(myMap.isEmpty());



    }

    /**
     *data fields
     */
    private Entry<K, V>[] table;
    private static final int START_CAPACITY = 13;
    private double LOAD_THRESHOLD = 0.75;
    private Integer PRIME=11;
    private int numKeys;
    private int numDeletes;
    private final EntryClass<K, V> DELETED =new EntryClass<>(null, null);
    // Constructor

    /**
     *constructor
     */
    public MyMap() {
        table = new Entry[START_CAPACITY];
    }

    /**
     * inner class
     *
     * @param <K> key
     * @param <V> value
     */
    private static class   EntryClass<K ,V> implements Entry<K,V> {
        /**
         *data fields
         */
        private final   K key;
        private V val;

        /**
         *constructor
         * @param key
         * @param val
         */
        private EntryClass(K key,V val) {
            this.key=key;
            this.val=val;
        }

        /**
         * getter
         * @return key
         */
        @Override
        public K getKey() {
            return key;
        }

        /**
         * getter
         * @return value
         */
        @Override
        public V getValue() {
            return val;
        }

        /**
         * setter
         * @param value
         * @return oldVal
         */
        @Override
        public V setValue(V value) {
            V tmpV=val;
            val=value;
            return tmpV;
        }
    }

    /**
     * toString
     * @return string
     */
    @Override
    public String toString() {
        StringBuilder myBuild=new StringBuilder();
       myBuild.append("{ ");
        for (int i=0;i<table.length;i++){
           if (table[i]!=null && table[i]!=DELETED) {
               String str = table[i].getKey() + "=" + table[i].getValue() + " ,";
               myBuild.append(str);
           }
        }
        myBuild.deleteCharAt(myBuild.lastIndexOf(","));
        myBuild.append("}");
        return myBuild.toString();
    }

    /**
     * hashing
     * @param key
     * @return index
     */
    private int has2(Object key){
       int index=PRIME- (key.hashCode()-PRIME);
        while (index<0){
            index+=table.length;
        }
        return index;
    }

    /**
     * find element
     * @param key
     * @return index of element
     */
    private int find(Object key){
        // Calculate the starting index.
        int index = key.hashCode() % table.length;
        int i=1;
        if (index < 0)
            index += table.length;
        while ((table[index] != null)
                && (!key.equals(table[index].getKey()))) {

            index=(key.hashCode()+i*has2(key))%table.length;

            while (index<0){
                index+=table.length;
            }
            if (index >= table.length)
                index = 0;
        }
        return index;

    }

    /**
     * get size
     * @return size
     */
    @Override
    public int size() {
        return numKeys;
    }

    /**
     * statmenet of object
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return (numKeys==0);
    }

    /**
     *
     * @param key
     * @return boolean
     */
    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    /**
     *
     * @param value
     * @return boolean
     */
    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    /**
     *
     * @param key
     * @return Value
     */
    @Override
    public V get(Object key) {
        int index = find(key);
        if (table[index] != null)
            return table[index].getValue();
        else
            return null; // key not found.
    }

    /**
     *
     * @param key
     * @param value
     * @return Value
     */
    @Override
    public V put(K key, V value) {
        int index = find(key);

        if (table[index] == null) {
            table[index] = new EntryClass<>(key, value);
            numKeys++;
            double loadFactor =
                    (double) (numKeys + numDeletes) / table.length;
            if (loadFactor > LOAD_THRESHOLD)
                rehash();
            return null;
        }
        V oldVal = table[index].getValue();
        table[index].setValue(value);
        return oldVal;
    }

    /**
     * repeat hashing for collision
     */
    private void rehash() {
        System.out.println("burası rehash");
        Entry<K, V>[] oldTable = table;
        table = new Entry[2 * oldTable.length + 1];
        numKeys = 0;
        numDeletes = 0;
        for (int i = 0; i < oldTable.length; i++) {
            if ((oldTable[i] != null) && (oldTable[i] != DELETED)) {
                put(oldTable[i].getKey(), oldTable[i].getValue());
            }
        }
    }

    /**
     *
     * @param key
     * @return value
     */
    @Override
    public V remove(Object key) {
        int index = find(key);
        if (table[index] == null)
            return null;
        V oldValue = table[index].getValue();
        table[index] = DELETED;
        numKeys--;
        return oldValue;
    }

    /**
     *
     * @param m
     */
    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    /**
     *
     */
    @Override
    public void clear() {

    }

    /**
     *
     * @return
     */
    @Override
    public Set<K> keySet() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public Collection<V> values() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
