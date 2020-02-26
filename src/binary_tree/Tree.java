package binary_tree;

public class Tree {
    
    public Node root;
    
    public Tree(){
        this.root = null;
    }
    
    public void insert(int value) {
        Node newNode = new Node(value);

        if (this.root == null)
            this.root = newNode;
        else
            this.insertNode(this.root, newNode);
    }

    private void insertNode(Node node, Node newNode) {
        if (node.value > newNode.value) {
            if (node.left == null)
                node.left = newNode;
            else
                this.insertNode(node.left, newNode);
        } else {
            if (node.right == null)
                node.right = newNode;
            else
                this.insertNode(node.right, newNode);
        }
    }
    
    public Node search(Node node, int value) {
        if (node == null)
            return null;

        if (node.value == value)
            return node;

        Node r1 = this.search(node.left, value);
        if (r1 != null) return r1;

        Node r2 = this.search(node.right, value);

        return r2;
    }
}
