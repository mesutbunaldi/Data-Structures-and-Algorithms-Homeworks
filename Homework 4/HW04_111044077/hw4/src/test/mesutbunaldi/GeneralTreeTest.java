package test.mesutbunaldi; 

import mesutbunaldi.GeneralTree;
import org.junit.Test;


import static org.junit.Assert.*;
/**
 *
 *
 *
 *
 * Homework 04
 * Mesut BUNALDI
 * 111044077
* GeneralTree Tester.
 *
 *
 *
* 
* @author <Authors name> 
* @since <pre>Apr 16, 2018</pre> 
* @version 1.0 
*/ 
public class GeneralTreeTest extends GeneralTree{


@Test
public void testAdd() throws Exception {
    GeneralTree<Integer> gt=new GeneralTree<>();
    boolean statement=gt.add(1,2);
    System.out.println(statement+" statement");
    assertEquals(true,statement);
} 

/** 
* 
* Method: levelOrderSearch(Node<E> root, E data) 
* 
*/ 
@Test
public void testLevelOrderSearch() throws Exception { 

    GeneralTree<Integer> gt=new GeneralTree<>();
    gt.add(1,2);
    gt.add(1,4);
    gt.add(1,7);
    gt.add(2,3);
    gt.add(2,6);
    gt.add(3,5);

    int testResult=gt.wrapperLevelOrder(5).data;
    assertEquals(5,testResult);
    testResult=gt.wrapperLevelOrder(6).data;
    assertEquals(6,testResult);

} 



/** 
* 
* Method: postOrderSearch(Node<E> root, E data) 
* 
*/ 
@Test
public void testPostOrderSearch() throws Exception {
    GeneralTree<Integer> gt=new GeneralTree<>();
    gt.add(1,2);
    gt.add(1,4);
    gt.add(1,7);
    gt.add(2,3);
    gt.add(2,6);
    gt.add(3,5);

    int testResult=gt.wrapperPostOrder(5).data;
    assertEquals(5,testResult);
    testResult=gt.wrapperPostOrder(6).data;
    assertEquals(6,testResult);
} 



} 
