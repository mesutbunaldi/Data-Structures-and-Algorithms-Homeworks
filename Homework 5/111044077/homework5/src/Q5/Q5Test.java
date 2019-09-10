
/**
 * MESUT BUNALDI
 * 111044077
 * DATA STRUCTURES AND ALGORITHMS
 * HOMEWORK 05
 */

package Q5;


import Q3.MergeSortWithDLL;
import java.util.LinkedList;
import java.util.Random;

/**
 * Test Time Complexity for Sorting Algorithms
 */
public class Q5Test {
    /**
     * Main Test Function
     * @param args arguments
     */
    public static void main(String args[]) {


        insertionSortTest();
        //quickSortTest();//quicksort kitaptan alınmış source code vm üzerinde hata veriyor. kendi bilgilsayarımda çalıştırdım.
        mergeSortTest();
        heapSortTest();
        mergeSortDLLTest();


    }

    /**
     * Test InsertionSort Algorithm
     */
    private static void insertionSortTest() {
        System.out.println("---------------------Insertion Sort Test---------------------------------");

        Integer[] arr = generateRandomArr(100);
        reverseSort(arr);
        long time1 = System.nanoTime();
        InsertionSort.sort(arr);
        long time2 = System.nanoTime();
        System.out.println("For 100 :        " + (time2 - time1));


        arr = generateRandomArr(1000);
        reverseSort(arr);
        time1 = System.nanoTime();
        InsertionSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 1000 :        " + (time2 - time1));

        arr = generateRandomArr(5000);
        reverseSort(arr);
        time1 = System.nanoTime();
        InsertionSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 5000 :        " + (time2 - time1));

        arr = generateRandomArr(10000);
        reverseSort(arr);
        time1 = System.nanoTime();
        InsertionSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 10000 :        " + (time2 - time1));

    }

    /**
     * Test HeapSort Algorithm
     */
    private static void heapSortTest() {
        System.out.println("---------------------Heap Sort Test---------------------------------");

        Integer[] arr = generateRandomArr(100);
        reverseSort(arr);
        long time1 = System.nanoTime();
        HeapSort.sort(arr);
        long time2 = System.nanoTime();
        System.out.println("For 100 :        " + (time2 - time1));


        arr = generateRandomArr(1000);
        reverseSort(arr);
        time1 = System.nanoTime();
        HeapSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 1000 :        " + (time2 - time1));

        arr = generateRandomArr(5000);
        reverseSort(arr);
        time1 = System.nanoTime();
        HeapSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 5000 :        " + (time2 - time1));

        arr = generateRandomArr(10000);
        reverseSort(arr);
        time1 = System.nanoTime();
        HeapSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 10000 :        " + (time2 - time1));

    }

    /**
     * Test QuickSort Algorithm
     */
    private static void quickSortTest() {
        System.out.println("---------------------Quick Sort Test---------------------------------");

        Integer[] arr = generateRandomArr(100);
        reverseSort(arr);
        long time1 = System.nanoTime();
        QuickSort.sort(arr);
        long time2 = System.nanoTime();
        System.out.println("For 100 :        " + (time2 - time1));


        arr = generateRandomArr(1000);
        reverseSort(arr);
        time1 = System.nanoTime();
        QuickSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 1000 :        " + (time2 - time1));

        arr = generateRandomArr(5000);
        reverseSort(arr);
        time1 = System.nanoTime();
        QuickSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 5000 :        " + (time2 - time1));

        arr = generateRandomArr(10000);
        reverseSort(arr);
        time1 = System.nanoTime();
        QuickSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 10000 :        " + (time2 - time1));

    }

    /**
     * Test MergeSort Algorithm
     */
    private static void mergeSortTest() {
        System.out.println("---------------------Merge Sort Test---------------------------------");

        Integer[] arr = generateRandomArr(100);
        reverseSort(arr);
        long time1 = System.nanoTime();
        MergeSort.sort(arr);
        long time2 = System.nanoTime();
        System.out.println("For 100 :        " + (time2 - time1));


        arr = generateRandomArr(1000);
        reverseSort(arr);
        time1 = System.nanoTime();
        MergeSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 1000 :        " + (time2 - time1));

        arr = generateRandomArr(5000);
        reverseSort(arr);
        time1 = System.nanoTime();
        MergeSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 5000 :        " + (time2 - time1));

        arr = generateRandomArr(10000);
        reverseSort(arr);
        time1 = System.nanoTime();
        MergeSort.sort(arr);
        time2 = System.nanoTime();
        System.out.println("For 10000 :        " + (time2 - time1));

    }

    /**
     * Test MergeDLLSort  Algorithm
     */
    private static void mergeSortDLLTest() {
        System.out.println("---------------------Merge Sort with DoubleLinkedList Test------------------------");
        LinkedList<Integer> list = generateRandomLL(100);
        reverseSort(list);
        long time1 = System.nanoTime();
        MergeSortWithDLL.sort(list);
        long time2 = System.nanoTime();
        System.out.println("For 100 :        " + (time2 - time1));

        list = generateRandomLL(1000);
        reverseSort(list);
        time1 = System.nanoTime();
        MergeSortWithDLL.sort(list);
        time2 = System.nanoTime();
        System.out.println("For 1000 :       " + (time2 - time1));

        list = generateRandomLL(5000);
        reverseSort(list);
        time1 = System.nanoTime();
        MergeSortWithDLL.sort(list);
        time2 = System.nanoTime();
        System.out.println("For 5000 :      " + (time2 - time1));


        list = generateRandomLL(10000);
        reverseSort(list);
        time1 = System.nanoTime();
        MergeSortWithDLL.sort(list);
        time2 = System.nanoTime();
        System.out.println("For 10000 :     " + (time2 - time1));
    }

    /**
     * Reverse sort List function for worst-case testing
     * @param mylist List Object
     */
    private static void reverseSort(LinkedList<Integer> mylist) {
        if (mylist.size() > 1) {


            int leftSize = mylist.size() / 2;
            int rightSize = mylist.size() - leftSize;

            LinkedList<Integer> leftList = new LinkedList<>();
            LinkedList<Integer> rightList = new LinkedList<>();

            for (int i = 0; i < leftSize; i++) {
                leftList.add(mylist.get(i));
            }
            for (int i = leftSize; i < mylist.size(); i++) {
                rightList.add(mylist.get(i));
            }

            reverseSort(leftList);
            reverseSort(rightList);
            merge(mylist, leftList, rightList);
        }
    }

    /**
     * Reverse sort Array function for worst-case testing
     * @param mylist Array Object
     */
    private static void reverseSort(Integer[] mylist) {
        if (mylist.length > 1) {


            int leftSize = mylist.length / 2;
            int rightSize = mylist.length - leftSize;

            Integer[] leftList = new Integer[leftSize];
            Integer[] rightList = new Integer[rightSize];

            for (int i = 0; i < leftSize; i++) {
                leftList[i] = mylist[i];
            }
            int j = 0;
            for (int i = leftSize; i < mylist.length; i++) {
                rightList[j++] = mylist[i];
            }

            reverseSort(leftList);
            reverseSort(rightList);
            merge(mylist, leftList, rightList);
        }
    }

    /**
     * Merge function for Array
     * @param outputSequence 1st array parameter
     * @param leftSequence   2nd array parameter
     * @param rightSequence  3rd array parameter
     */
    private static void merge(Integer[] outputSequence,
                              Integer[] leftSequence,
                              Integer[] rightSequence) {
        int i = 0; // Index into the left input sequence.
        int j = 0; // Index into the right input sequence.
        int k = 0; // Index into the output sequence.

        // While there is data in both input sequences
        while (i < leftSequence.length && j < rightSequence.length) {
            // Find the smaller and
            // insert it into the output sequence.
            if (leftSequence[i].compareTo(rightSequence[j]) > 0) {
                outputSequence[k++] = leftSequence[i++];
            } else {
                outputSequence[k++] = rightSequence[j++];
            }
        }
        // assert: one of the sequences has more items to copy.
        // Copy remaining input from left sequence into the output.
        while (i < leftSequence.length) {
            outputSequence[k++] = leftSequence[i++];
        }
        // Copy remaining input from right sequence into output.
        while (j < rightSequence.length) {
            outputSequence[k++] = rightSequence[j++];
        }
    }

    /**
     * Merge Function for LinkedList
     @param outputSequence 1st array parameter
      * @param leftSequence   2nd array parameter
     * @param rightSequence  3rd array parameter
     *
     **/
    private static void merge(LinkedList<Integer> outputSequence, LinkedList<Integer> leftSequence, LinkedList<Integer> rightSequence) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSequence.size() && j < rightSequence.size()) {
            if (leftSequence.get(i).compareTo(rightSequence.get(j)) > 0) {
                outputSequence.set(k++, leftSequence.get(i++));
            } else {
                outputSequence.set(k++, rightSequence.get(j++));
            }
        }

        while (i < leftSequence.size()) {
            outputSequence.set(k++, leftSequence.get(i++));
        }

        while (j < rightSequence.size()) {
            outputSequence.set(k++, rightSequence.get(j++));
        }
    }

    /**
     * Random LinkedList<Integer> Generator
     * @param size size Of LinkedList
     * @return LinkedList Object
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
     *  Random Integer Array Generator
     * @param size size of Array
     * @return Array Object
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
}
