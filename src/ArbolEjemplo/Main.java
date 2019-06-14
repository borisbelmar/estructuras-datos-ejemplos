package ArbolEjemplo;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(20);
        Node node2 = new Node(35);
        Node node3 = new Node(23);
        Node node4 = new Node(15);
        Node node5 = new Node(12);

        BST tree = new BST();

        tree.add(node1);
        tree.add(node2);
        tree.add(node3);
        tree.add(node4);
        tree.add(node5);

        int search1 = 12;
        int search2 = 39;

        if (tree.lookup(search1)) {
            System.out.println(search1 + " existe");
        } else {
            System.out.println(search2 + " no existe");
        }
        System.out.println("");
        if (tree.lookup(search2)) {
            System.out.println(search1 + " existe");
        } else {
            System.out.println(search2 + " no existe");
        }
        System.out.println("");

        tree.preorder(tree.getRoot());
        System.out.println("");
        tree.inorder(tree.getRoot());
        System.out.println("");
        tree.postorder(tree.getRoot());

    }
}
