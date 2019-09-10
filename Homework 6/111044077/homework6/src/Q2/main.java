package Q2;



public class main {

        public static void main(String[] args){

            BTree<Integer> bTree=new BTree<>(3);
            bTree.add(123);
            bTree.add(11);
            bTree.add(2);
            bTree.add(3);
            bTree.add(4);
            bTree.add(1);
            System.out.println(bTree.toString());

            BTree<Integer> bTree2=new BTree<>(6);

            bTree2.add(1);
            bTree2.add(12);
            bTree2.add(2);
            bTree2.add(342);
            bTree2.add(112);
            bTree2.add(1121);
            bTree2.add(1122);
            bTree2.add(1123);
            bTree2.add(1124);

            System.out.println(bTree2.toString());
    }

}
