package mesutbunaldi;
/**

 * Homework 04
 * Mesut BUNALDI
 * 111044077
 *
 */
public class Main {

    public static void main(String[] args) {
        try {


            GeneralTree<Integer> test1 = new GeneralTree<>();
            test1.test_1();
            test1 = new GeneralTree<>();
            test1.test_2();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
