/**
 * MESUT BUNALDI
 * 111044077
 * DATA STRUCTURES AND ALGORITHMS
 * HOMEWORK 05
 */

package Q3;

import java.util.LinkedList;
import java.util.Random;

/**
 * Class : MergeSort with DoubleLinkedList
 */
public class MergeSortWithDLL  {
    /**
     * test mergeSort
     * @param args
     */
    public static void main(String args[]){
        LinkedList<Integer> myList=new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            Random rand=new Random();
            int  n = rand.nextInt(50) + 1;
            myList.add(n);
        }
        System.out.println("Unsorted list :" + myList.toString());
        sort(myList);
        System.out.println("Sorted list : "+ myList.toString());

    }

    /**
     * recursive merge function
     * @param outputSequence output parameter
     * @param leftSequence   2nd parameter
     * @param rightSequence  3rd parameter
     * @param <T> comperable object
     */
    private static <T extends Comparable<T>> void merge(LinkedList<T> outputSequence, LinkedList<T> leftSequence, LinkedList<T> rightSequence){
        int i=0;
        int j=0;
        int k=0;

        while(i<leftSequence.size() && j<rightSequence.size()){
            if(leftSequence.get(i).compareTo(rightSequence.get(j))<0){
                outputSequence.set(k++,leftSequence.get(i++));
            }else {
                outputSequence.set(k++,rightSequence.get(j++));
            }
        }

        while(i<leftSequence.size()){
            outputSequence.set(k++,leftSequence.get(i++));
        }

        while(j<rightSequence.size()){
            outputSequence.set(k++,rightSequence.get(j++));
        }
    }

    /**
     *
     * @param mylist parameter of sort function
     * @param <T>    comarable object
     */
    public static  <T extends Comparable<T>> void sort(LinkedList<T> mylist) {
        if (mylist.size() > 1) {


            int leftSize = mylist.size() / 2;
            int rightSize = mylist.size() - leftSize;

            LinkedList<T> leftList = new LinkedList<>();
            LinkedList<T> rightList = new LinkedList<>();

            for (int i = 0; i < leftSize; i++) {
                leftList.add(mylist.get(i));
            }
            for (int i = leftSize; i < mylist.size(); i++) {
                rightList.add(mylist.get(i));
            }

            sort(leftList);
            sort(rightList);
            merge(mylist, leftList, rightList);
        }
    }
}
