package UnderstandingTree;

// A Java program to introduce Binary Tree
public class BinaryTree {

    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key)
    {
        root = new Node(key);
    }

    BinaryTree(){
        root=null;
    }

    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();

        tree.root=new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

    }

}
