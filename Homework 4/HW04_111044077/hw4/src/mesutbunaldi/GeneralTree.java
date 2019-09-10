package mesutbunaldi;

/**
 *
 *
 * Homework 04
 * Mesut BUNALDI
 * 111044077
 *
 *
 *
 *
 * @param <E> Generic Class
 */
public class GeneralTree<E> extends BinaryTree<E> {

    public   Node<E> found=new Node<>(null);

    /**
     * add new Node to General Tree
     * @param parentItem Parent
     * @param childItem  Child
     * @return if add successful than true else false
     */
    public boolean add(E parentItem,E childItem){
        if(root==null){
            root=new Node<>(parentItem);
            Node<E> child=new Node<>(childItem);
            root.left=child;
            return true;
        }else{
                    Node<E> check=null;

                       check= levelOrderSearch(root,childItem);

                if (check!=null) {
                    System.out.println("eklemeye çalıştığın şey zaten var");

                }else {
                    Node<E> current = postOrderSearch(root, parentItem);
                    if (current != null) {
                        if (current.left == null) {
                            current.left = new Node<>(childItem);
                            return true;
                        } else if (current.left != null) {
                            current = current.left;
                            while (current.right != null) {
                                current = current.right;
                            }
                            current.right = new Node<>(childItem);
                            return true;
                        }
                    }
                }
        }
        return false;
    }

    /**
     *
     * @param root Node<E> for check
     * @param data Node data
     * @return if found data than return its Node else null
     */
    protected Node<E> levelOrderSearch(Node<E> root,E data) {
        Node<E> current=root,current2;
        if (current.data==data){
           return current;
        }
        while (current.left!=null){
            current=current.left;
            if (current.data==data)
                return current;
            current2=current;
            while (current2.right!=null){
                current2=current2.right;
                if (current2.data==data)
                    return current2;
            }
        }
        return null;
    }

    /**
     * This function print levelOrder
     */
   public  void print() {
        Node<E> current,current2;

        current=root;
        System.out.print(current.data);
        while (current.left!=null){
            current=current.left;
            System.out.print(" "+current.data);
            current2=current;
            while (current2.right!=null){
                current2=current2.right;
                System.out.print(" "+current2.data);

            }
        }

    }

    /**
     *
     * @param root Node<E> for check
     * @param data Node data
     * @return if found data than return its Node else null
     */
    protected Node<E> postOrderSearch(Node<E> root,E data) {
        if (root.left != null)
            postOrderSearch(root.left, data);
        if (root.data == data)
            found = root;
        else if (root.right != null)
            postOrderSearch(root.right, data);
        if (found != null)
            return found;
        else
            return null;
    }

    /**
     * for testing
     * @param data for search Node<E>
     * @return return levelOrderSearchs Node
     */
    public Node<E> wrapperLevelOrder(E data) {
        return levelOrderSearch(root,data);
    }

    /**
     * for testing
     * @param data for search Node<E>
     * @return return postOrderSearchs Node
     */
    public Node<E> wrapperPostOrder(E data) {
        return postOrderSearch(root,data);
    }
    /**
     *
     * @param node The local root
     * @param depth The depth
     * @param sb The string buffer to save the output
     */
    @Override
    protected void preOrderTraverse(Node<E> node, int depth, StringBuilder sb) {
        for (int i = 1; i < depth; i++) {
            sb.append("  ");
        }
        if (node == null) {
            sb.append("null\n");
        } else {
            sb.append(node.toString());
            sb.append("\n");
            preOrderTraverse(node.right, depth + 1, sb);
            preOrderTraverse(node.left, depth + 1, sb);
        }
    }

    /**
     * Test function1 for GeneralTree<E> with Integer
     */
    public void test_1(){
        GeneralTree<Integer> myGTree = new GeneralTree<Integer>();
        myGTree.add(1, 2);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(1, 3);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(1, 2);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(3, 7);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(3, 14);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(7, 994);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(99, 101);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(14, 912);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(7, 9933);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(3, 144);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(1, -3);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(2, -11);
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add(3, 753);
        System.out.println("\n------------\n"+myGTree.toString());
    }

    /**
     * Test function for GeneralTree<E> with String
     */
    public void test_2(){
        GeneralTree<String> myGTree = new GeneralTree<String >();
        myGTree.add("Ali", "Ayşe");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Ali", "Ayşe");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Ali", "Hamza");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Ayşe", "Hamza");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Ayşe", "Ayşe");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Ayşe", "Mükremin");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Hamza", "Talat");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Talat", "Leyla");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Leyla", "Bulut");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Ali", "Hakkı");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Ali", "Zeynep");
        System.out.println("\n------------\n"+myGTree.toString());
        myGTree.add("Ali", "Pervin");
        System.out.println("\n------------\n"+myGTree.toString());
    }



}
