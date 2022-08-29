package leetcode.problems.binaryTree;

import leetcode.beans.BinaryTree;
import leetcode.beans.Node;

import java.util.Random;

public class Traverasal {

    public static void main(String[] args) {
//        Random random = new Random();
//
//        Node root = new Node(2);
//        int i=3;
//
//        Node curr = root;
//
//        while(i>0){
//            setElementsInNode(curr,random.nextInt(100),random.nextInt(100));
//            setElementsInNode(curr.getLeft(),random.nextInt(100),random.nextInt(100));
//            setElementsInNode(curr.getRight(),random.nextInt(100),random.nextInt(100));
//            i--;
//        }

        BinaryTree bt = new BinaryTree();
        Node test = bt.getRandomBinaryTree(3);

        System.out.println("Awesome");
        inOrder(test);
        System.out.println("Awesome");
    }


    static void setElementsInNode(Node root, int leftVal, int rightVal){
        root.setLeft(new Node(leftVal));
        root.setRight(new Node(rightVal));
    }

    static void inOrder(Node root){
        if(root==null) return;

        inOrder(root.getLeft());
        System.out.println(root.getData());
        inOrder(root.getRight());
    }
}
