package test.Q2; 

import Q2.RecursiveHashSet;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** 
* RecursiveHashSet Tester. 
* 
* @author <Authors name> 
* @since <pre>May 7, 2018</pre> 
* @version 1.0 
*/ 
public class RecursiveHashSetTest {

    RecursiveHashSet<Integer> tmpHashSet = new RecursiveHashSet<>();


    /**
     * Method: size()
     */
    @Test
    public void testSize() throws Exception {

        tmpHashSet.add(10);
        tmpHashSet.add(101);
        tmpHashSet.add(103);
        tmpHashSet.add(3);
        assertEquals(tmpHashSet.size(), 4);
    }

    /**
     * Method: isEmpty()
     */
    @Test
    public void testIsEmpty() throws Exception {
//TODO: Test goes here...

        assertEquals(tmpHashSet.isEmpty(), true);
    }

    /**
     * Method: contains(Object element)
     */
    @Test
    public void testContains() throws Exception {
//TODO: Test goes here...
        tmpHashSet.add(10);
        tmpHashSet.add(101);
        assertEquals(tmpHashSet.contains(10), true);
        assertEquals(tmpHashSet.contains(140), false);
    }


    /**
     * Method: add(E e)
     */
    @Test
    public void testAdd() throws Exception {
        assertEquals(tmpHashSet.add(10), true);
    }

    /**
     * Method: remove(Object o)
     */
    @Test
    public void testRemove() throws Exception {
//TODO: Test goes here...

        tmpHashSet.add(10);
        tmpHashSet.add(101);
        assertEquals(tmpHashSet.remove(10), true);
        assertEquals(tmpHashSet.remove(90), false);
    }


}
