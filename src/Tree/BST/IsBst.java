package Tree.BST;

import Tree.Node;
import Tree.TreeCreation;

import java.util.ArrayList;

public class IsBst {

    public static boolean checkForBST(ArrayList<Integer> list)
    {
        int size = list.size();
        for(int i=0;i<size-1;i++){
            if(list.get(i)>list.get(i+1))
                return false;
        }


        return true;
    }

    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>();

        Node root = TreeCreation.createNode(50);
        Node first = TreeCreation.createNode(30);
        Node second = TreeCreation.createNode(60);
        Node third = TreeCreation.createNode(20);
        Node fourth = TreeCreation.createNode(55);

        root.left = first;
        root.right = second;
        first.left = third;
        second.left = fourth;


        TreeCreation.inOrder(root,list);
        System.out.println("BST is created...");
        System.out.println(list);

        System.out.println("Checking if the given Binary Tree is BST or Not");
        System.out.println();

        boolean isBST = checkForBST(list);
        if(!isBST)
            System.out.println("The Given Tree is not BST");
        else
            System.out.println("The Given Tree is a BST");
    }


}
