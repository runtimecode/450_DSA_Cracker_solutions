package leetcode.beans;

import java.util.Random;

public class BinaryTree {
    Node root;

    public BinaryTree() {
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRandomBinaryTree(int size){
        Random random = new Random();
        if(root==null) root= new Node(random.nextInt(100));
        int i=3;

        Node curr = root;

        while(i>0){
            setElementsInNode(curr,random.nextInt(100),random.nextInt(100));
            setElementsInNode(curr.getLeft(),random.nextInt(100),random.nextInt(100));
            setElementsInNode(curr.getRight(),random.nextInt(100),random.nextInt(100));
            i--;
        }
        return root;
    }

    static void setElementsInNode(Node root, int leftVal, int rightVal){
        root.setLeft(new Node(leftVal));
        root.setRight(new Node(rightVal));
    }

}
