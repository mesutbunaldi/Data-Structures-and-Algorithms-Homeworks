package Q3;


import Q1.BinaryTree;


public class main {

    public static void main(String[] args){
        BinaryTree<Integer> tree=new BinaryTree<>();
        tree.root=new BinaryTree.Node<>(1);
        tree.root.right = new BinaryTree.Node(3);
        tree.root.left = new BinaryTree.Node(4);
        tree.root.left.right = new BinaryTree.Node(5);
        tree.root.left.left = new BinaryTree.Node(8);


        AVLTree<Integer> avlTree=new AVLTree<>(tree);

        tree.root.left.left.right = new BinaryTree.Node(84);


        AVLTree<Integer> avlTree2=new AVLTree<>(tree);

        avlTree.add(2);
        avlTree.add(3);
        avlTree.add(4);
        avlTree.add(1);

        System.out.println(avlTree.toString());
        avlTree.delete(1);

        System.out.println(avlTree.toString());


    }
}
