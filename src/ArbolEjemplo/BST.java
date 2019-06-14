package ArbolEjemplo;

public class BST {

    Node root;

    public BST() {
        this.root = null;
    }

    public Node getRoot() {
        return this.root;
    }

    public void add(Node node) {
        if (root != null) {
            add(root, node);
        }else {
            root = node;
        }
    }

    // Insertar recursivo
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

    // Pendiente de modificación
    public Node search(int id) {
        Node actual = root;
        while (actual.getId() != id) {
            if (id < actual.getId())
                actual = actual.getLeft();
            else
                actual = actual.getRight();
            if (actual == null)
                return null;
        }
        return actual;
    }

    // Mostrar en Inorden
    public void inorder(Node localRoot) {
        if (localRoot != null) {
            inorder(localRoot.getLeft());
            localRoot.show();
            inorder(localRoot.getRight());
        }
    }

    // Mostrar en Preorden
    public void preorder(Node localRoot) {
        if (localRoot != null) {
            localRoot.show();
            preorder(localRoot.getLeft());
            preorder(localRoot.getRight());
        }
    }

    // Mostrar en Postorden
    public void postorder(Node localRoot) {
        if (localRoot != null) {
            postorder(localRoot.getLeft());
            postorder(localRoot.getRight());
            localRoot.show();
        }
    }

}