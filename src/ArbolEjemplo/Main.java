package ArbolEjemplo;

public class Main {

    private static void exists(BST bst, int id) {
        if (bst.lookup(id)) {
            System.out.println(id + " existe");
        } else {
            System.out.println(id + " no existe");
        }
    }

    public static void main(String[] args) {

        BST tree = new BST();

        tree.add(new Node(20));
        tree.add(new Node(35));
        tree.add(new Node(23));
        tree.add(new Node(15));
        tree.add(new Node(12));

        exists(tree,30);
        System.out.println("");
        exists(tree,23);
        System.out.println("");
        exists(tree,15);

        System.out.println("");

        tree.preorder(tree.getRoot());
        System.out.println("");
        tree.inorder(tree.getRoot());
        System.out.println("");
        tree.postorder(tree.getRoot());

    }
}
