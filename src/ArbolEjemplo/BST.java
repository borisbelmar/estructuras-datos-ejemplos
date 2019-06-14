package ArbolEjemplo;

public class BST {

    Node root;

    public BST() {
        this.root = null;
    }

    public Node getRoot() {
        return this.root;
    }

    // Insertar recursivo (Método público)
    public void add(Node node) {
        if (root != null) {
            add(root, node);
        }else {
            root = node;
        }
    }

    // Insertar recursivo (Método privado)
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


    // Método buscar recursivo (Public)
    public boolean lookup(int id) {
        if (root == null) {
            return false;
        }else {
            return this.lookup(root, id);
        }
    }

    // Método buscar recursivo (Private)
    private boolean lookup(Node base, int id) {
        if (id == base.getId()) {
            return true;
        }
        if (id < base.getId()) {
            if (base.getLeft() != null) {
                return lookup(base.getLeft(), id);
            }else {
                return false;
            }
        } else {
            if (base.getRight() != null) {
                return lookup(base.getRight(), id);
            }else {
                return false;
            }
        }
    }

    // Método buscar clásico
    public boolean search(int id) {
        Node actual = root;
        while (actual.getId() != id) {
            if (id < actual.getId()) {
                actual = actual.getLeft();
            } else {
                actual = actual.getRight();
            }
            if (actual == null) {
                return false;
            }
        }
        return true;
    }
    // Pendiente de modificación

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