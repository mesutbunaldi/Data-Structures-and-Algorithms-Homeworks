package test.Q1; 

import Q1.MyMap;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* MyMap Tester. 
* 
* @author <Authors name> 
* @since <pre>May 7, 2018</pre> 
* @version 1.0 
*/ 
public class MyMapTest {


    /**
     * Method: size()
     */
    @Test
    public void testSize() throws Exception {
//TODO: Test goes here...
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(0, "Mesut");
        assertEquals(myMap.size(), 1);
    }

    /**
     * Method: isEmpty()
     */
    @Test
    public void testIsEmpty() throws Exception {
//TODO: Test goes here...
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(0, "Mesut");
        assertEquals(myMap.isEmpty(), false);
    }


    /**
     * Method: get(Object key)
     */
    @Test
    public void testGet() throws Exception {
//TODO: Test goes here...
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(0, "Mesut");
        assertEquals(myMap.get(0), "Mesut");
    }

    /**
     * Method: put(K key, V value)
     */
    @Test
    public void testPut() throws Exception {
//TODO: Test goes here...
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(0, "Mesut");
        assertEquals(myMap.put(0, "hale"), "Mesut");
    }

    /**
     * Method: remove(Object key)
     */
    @Test
    public void testRemove() throws Exception {
//TODO: Test goes here... 
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(0, "Mesut");
        assertEquals(myMap.remove(0), "Mesut");
    }


    /**
     * Method: find(Object key)
     */
    @Test
    public void testFind() throws Exception {
//TODO: Test goes here... 
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(0, "Mesut");
        assertEquals(myMap.get(0).toString(), "Mesut");
    }


}
