package test.Q3; 

import Q3.MergeSortWithDLL;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.LinkedList;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** 
* MergeSortWithDLL Tester. 
* 
* @author <Authors name> 
* @since <pre>May 7, 2018</pre> 
* @version 1.0 
*/ 
public class MergeSortWithDLLTest { 

/** 
* 
* Method: sort(LinkedList<T> mylist) 
* 
*/ 
@Test
public void testSort() throws Exception { 
//TODO: Test goes here...
    LinkedList<Integer> myList=new LinkedList<>();

    for (int i = 0; i < 20; i++) {
        Random rand=new Random();
        int  n = rand.nextInt(50) + 1;
        myList.add(n);
    }
    System.out.println(myList.toString());
    MergeSortWithDLL.sort(myList);
    System.out.println(myList.toString());
    assertTrue(myList.get(0)<=myList.get(1));


} 




} 
