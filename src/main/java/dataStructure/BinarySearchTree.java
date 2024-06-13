package dataStructure;

public class BinarySearchTree {

    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;

        public Node (int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
    }

    private void insert(final Node root, int value) {
        if (root == null) return;
        if (value == root.value) return; // NÃO ADICIONAR ITENS QUE JÁ EXISTEM

        if (value > root.value) {
            if (root.right == null) root.right = new Node(value);
            else insert(root.right, value);
        } else {
            if (root.left == null) root.left = new Node(value);
            else insert(root.left, value);
        }
    }

    private void inOrder() {
        inOrder(root);
    }
    private void inOrder(final Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    // Checar se o item existe na árvore
    public boolean contains(int value) {
        return contains(root, value);
    }
    private boolean contains(final Node root, final int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        if (value > root.value) return contains(root.right, value);
        else return contains(root.left, value);
    }

    // Retorna o menor valor
    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    // Romover um item e manter a árvore
    public void deleteNode(int value) {
        root = deleteNode(root, value);
    }
    private Node deleteNode(final Node root, final int value) {
        if (root == null) return null;
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if ((root.left == null && (root.right == null))) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int minValue = minValue(root.right);
                root.value = minValue;
                root.right = deleteNode(root.right, minValue);
            }
        }
        return root;
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(78);
        bst.insert(25);
        bst.insert(9);
        bst.insert(16);
        bst.insert(51);
        bst.insert(7);
        bst.insert(32);

        System.out.println(bst.contains(9));

        bst.deleteNode(78);

        bst.inOrder();
    }
}
