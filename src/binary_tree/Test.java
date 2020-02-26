package binary_tree;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        tree.insert(5);
        tree.insert(1);
        tree.insert(10);
        
        Node result = tree.search(tree.root, 10);
        
        if (result != null) 
            System.out.println("Found: " + result.value);
        else
            System.out.println("Not found!");
    }
}
