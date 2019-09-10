


/**
 * MESUT BUNALDI
 * 111044077
 * DATA STRUCTURES AND ALGORITHMS
 * HOMEWORK 05
 */


package Q2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 *  Recursive HashSet Implementation
 * @param <E> Generic Class
 */
public class RecursiveHashSet<E> implements Set<E> {
    /**
     * Test Recursive HashSet Class
     * @param args
     */
    public static void main(String args[]){
    RecursiveHashSet<Integer> tmp=new RecursiveHashSet<>();
    int e=3;
    System.out.println("Ekleme işlemi : "+tmp.add(9));
    System.out.println("Ekleme işlemi : "+tmp.add(e));
    System.out.println("Aynı elemanı ekleme işlemi : "+tmp.add(e));
    System.out.println("IsEmpty =  " + tmp.isEmpty());
    System.out.println("Ekleme işlemi : "+tmp.add(9));
    System.out.println("IsEmpty =  " + tmp.isEmpty());
    System.out.println("Contains = "+tmp.contains(1));
    System.out.println("Contains = "+tmp.contains(9));
}

    /**
     * Inner Class
     * @param <E> Generic
     */
    private static class   EntryClass<E> {
        /**
         *Data Fields
         */
        private E val;
        private EntryClass<E>[] next;

        /**
         * Constructor
         * @param val Generic Parameter
         */
        private EntryClass(E val) {
            next=null;
            this.val=val;
        }

        /**
         * Constructor
         */
        private EntryClass() {
            next=null;
            this.val=null;
        }

        /**
         * Getter
         * @return Generic Value
         */
        private E getVal() {
            return val;
        }

        /**
         * Setter
         * @param val Generic Value
         */
        private void setVal(E val) {
            this.val = val;
        }

        /**
         * Getter
         * @return Generic EntryClass Array
         */
        private EntryClass<E>[] getNext() {
            return next;
        }

        /**
         * Setter
         * @param next Generic EntryClass Array
         */
        public void setNext(EntryClass<E>[] next) {
            this.next = next;
        }
    }

    /**
     * Data Fields
     */
    private EntryClass<E>[] mainArr;
    private int size;
    private int deletedSize;
    private int capacity;
    private final int initialCapacity=23;
    private final EntryClass DELETED=new EntryClass("DELETED_ITEM");

    /**
     * Constructor
     */
   public  RecursiveHashSet(){
       size=0;
       deletedSize=0;
       capacity=initialCapacity;
       mainArr= new EntryClass[capacity];

   }

    /**
     * Getter
     * @return Size Of Set
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Empty Checker
     * @return True or False
     */
    @Override
    public boolean isEmpty() {
        return (size==deletedSize);
    }

    /**
     * Check Contains Element
     * @param element parameter for searching
     * @return true or false
     */
    @Override
    public boolean contains(Object element) {
        int index = element.hashCode() % mainArr.length;
        if (mainArr[index] == null || mainArr[index].getVal()!=element ) {
            return false;
        }else if(mainArr[index].getVal()==element){
            return true;
        }else {
            return contains(element);
        }

    }

    /**
     * Iterator
     * @return
     */
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     *
     * @param a
     * @param <T>
     * @return
     */
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     *
     * @param e add element parameter
     * @return true or false
     */
    @Override
    public boolean add(E e) {

      return   add2(mainArr,e);
    }

    /**
     * Sub function for add()
     * @param table hashTable
     * @param element element for adding
     * @return true or false
     */
    private boolean add2(EntryClass[] table,E element) {
        int index = element.hashCode() % table.length;
        if (table[index] == null) {
            table[index] = new EntryClass<>(element);
            size++;
            return true;
        } else if (table[index] != null && table[index].getVal()!=element) {
            table[index].next = new EntryClass[capacity];
            add2(table[index].next, element);
            return true;
        }
        return false;
    }

    /**
     * Remove element from HashTable
     * @param o element for removing
     * @return true or false
     */
    @Override
    public boolean remove(Object o) {
        return remove2(mainArr,(E)o);
    }

    /**
     * Sub function for remove
     * @param table hashTable
     * @param element element for removing
     * @return true or false
     */
    private boolean remove2(EntryClass[] table,E element){
        int index = element.hashCode() % table.length;
        if (table[index] == null || table[index].getVal()!=element ) {
          return false;
        }else if(table[index].getVal()==element){
            table[index].setVal(DELETED);
            deletedSize++;
            return true;
        }else {
            return remove2(table[index].next,element);
        }
    }

    /**
     *
     * @param c
     * @return
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    /**
     *
     * @param c
     * @return
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    /**
     *
     * @param c
     * @return
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    /**
     *
     * @param c
     * @return
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    /**
     *
     */
    @Override
    public void clear() {

    }




}
