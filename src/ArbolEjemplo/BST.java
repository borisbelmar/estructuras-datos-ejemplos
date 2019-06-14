package ArbolEjemplo;

public class BST {

    Node root;

    public BST() {
        root = null;
    }

    public void add(Node node) {
        if (root != null) {
            add(root, node);
        }else {
            root = node;
        }
    }

    private void add(Node base, Node node) {
        if (node.getId() < base.getId()) {
            if (base.getLeft() != null) {
                add(base.getLeft(), node);
            }else {
                base.setLeft(node);
            }
        }else {
            if (base.getRight() != null) {
                add(base.getRight(), node);
            }else {
                base.setRight(node);
            }
        }
    }

}