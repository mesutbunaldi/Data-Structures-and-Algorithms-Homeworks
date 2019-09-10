


package Q1;

public class main
{
    public static void main(String[] args){

       RedBlackTree<Integer> redBlackTree=new RedBlackTree<>();
        for (int i = 0; i <14 ; i++) {
            redBlackTree.add(i);
        }
        System.out.println(redBlackTree.toString());
    }
}
