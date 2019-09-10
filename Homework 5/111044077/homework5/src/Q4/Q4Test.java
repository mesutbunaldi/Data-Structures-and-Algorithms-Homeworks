
/**
 * MESUT BUNALDI
 * 111044077
 * DATA STRUCTURES AND ALGORITHMS
 * HOMEWORK 05
 */


package Q4;

import Q3.MergeSortWithDLL;
import Q5.HeapSort;
import Q5.InsertionSort;
import Q5.MergeSort;
import Q5.QuickSort;

import java.util.LinkedList;
import java.util.Random;

/**
 * Test Avarage Time Sorting Algorithms
 */
public class Q4Test {
    /**
     * Data field
     */
    private static int constantVal=3000;

    /**
     * main test function
     * @param args arguments
     */
    public static void main(String args[]){
        insertionSortTest();
        heapSortTest();
        quickSortTest();
        mergeSortTest();
        mergeSortDLLTest();
    }

    /**
     *
     * @param size size of random Integer array
     * @return random array
     */
    private static Integer[] generateRandomArr(int size) {

        Integer[] mergeArr = new Integer[size];
        for (int i = 0; i < size; i++) {
            Random rand = new Random();

            int n = rand.nextInt(size) + 1;

            mergeArr[i] = n;
        }
        return mergeArr;
    }

    /**
     *
     * @param size size of random doubleLinkedList
     * @return doubleLinkedList
     */
    private static LinkedList<Integer> generateRandomLL(int size) {

        LinkedList<Integer> mergeLL = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Random rand = new Random();

            int n = rand.nextInt(size) + 1;

            mergeLL.add(n);
        }
        return mergeLL;
    }

    /**
     *Test InsertionSort
     */
    public static void insertionSortTest(){ //10 farklı size için 10 deneme yapıp time ortalamasını alacağız ve avarage time
        Integer[] tmpArr ,arr;
        long time1,time2,resultTime = 0;
        for (int i = 1; i <11 ; i++) {
            arr=generateRandomArr(constantVal*i);
            tmpArr=arr.clone();
            for (int j = 1; j <11 ; j++) {
                time1= System.nanoTime();
                InsertionSort.sort(arr);
                time2 = System.nanoTime();
                resultTime+=(time2-time1);
                arr=tmpArr.clone();
            }
            System.out.println("Avarage Run Time For InsertionSort : "+resultTime/10);
            resultTime=0;
        }


    }

    /**
     *Test heapSort
     */
    public static void heapSortTest(){ //10 farklı size için deneme yapıp time ortalamasını alacağız ve avarage time
        Integer[] tmpArr ,arr;
        long time1,time2,resultTime = 0;
        for (int i = 1; i <11 ; i++) {
            arr=generateRandomArr(constantVal*i);
            tmpArr=arr.clone();
            for (int j = 1; j <11 ; j++) {
                time1= System.nanoTime();
                HeapSort.sort(arr);
                time2 = System.nanoTime();
                resultTime+=(time2-time1);
                arr=tmpArr.clone();
            }
            System.out.println("Avarage Run Time For HeapSort : "+resultTime/10);
            resultTime=0;
        }

    }

    /**
     *Test quickSort
     */
    public static void quickSortTest(){ //10 farklı size için deneme yapıp time ortalamasını alacağız ve avarage time
        Integer[] tmpArr ,arr;
        long time1,time2,resultTime = 0;
        for (int i = 1; i <11 ; i++) {
            arr=generateRandomArr(constantVal*i);
            tmpArr=arr.clone();
            for (int j = 1; j <11 ; j++) {
                time1= System.nanoTime();
                QuickSort.sort(arr);
                time2 = System.nanoTime();
                resultTime+=(time2-time1);
                arr=tmpArr.clone();
            }
        System.out.println("Avarage Run Time For QuickSort : "+resultTime/10);
            resultTime=0;
        }
    }

    /**
     *Test mergeSort
     */
    public static void mergeSortTest(){ //10 farklı size için deneme yapıp time ortalamasını alacağız ve avarage time
        Integer[] tmpArr ,arr;
        long time1,time2,resultTime = 0;
        for (int i = 1; i <11 ; i++) {
            arr=generateRandomArr(constantVal*i);
            tmpArr=arr.clone();
            for (int j = 1; j <11 ; j++) {
                time1= System.nanoTime();
                MergeSort.sort(arr);
                time2 = System.nanoTime();
                resultTime+=(time2-time1);
                arr=tmpArr.clone();
            }
        System.out.println("Avarage Run Time For MergeSort : "+resultTime/10);
            resultTime=0;
        }
    }


    /**
     *Test mergeSortDLL
     */
    public static void mergeSortDLLTest(){ //10 farklı size için deneme yapıp time ortalamasını alacağız ve avarage time
        LinkedList<Integer> tmpArr,arr;
        long time1,time2,resultTime = 0;
        for (int i = 1; i <11 ; i++) {
            arr=generateRandomLL(constantVal*i);
            tmpArr=arr;
            for (int j = 1; j <11 ; j++) {
                time1= System.nanoTime();
                MergeSortWithDLL.sort(arr);
                time2 = System.nanoTime();
                resultTime+=(time2-time1);
                arr=tmpArr;

            }
        System.out.println("Avarage Run Time For MergeDLLSort : "+resultTime/10);
            resultTime=0;
        }
    }
}
