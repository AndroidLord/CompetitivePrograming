package Tree.BST;

import Tree.Node;
import Tree.TreeCreation;

import java.util.ArrayList;

public class SearchingInBST {

    static boolean found= false;
    public static boolean search(Node root,int key){

        if(root.data == key)
            found = true;

        else if(root.data>key && root.left!=null)
            search(root.left,key);

        else if(root.data<key && root.right!=null)
            search(root.right,key);
        else
            found = false;

        return found;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Node root = TreeCreation.createNode(50);
        Node first = TreeCreation.createNode(30);
        Node second = TreeCreation.createNode(60);
        Node third = TreeCreation.createNode(20);
        Node fourth = TreeCreation.createNode(55);
//
//          50
//         /  \
//       30     60
//      /  \   /  \
//     20   N 55   N


        root.left = first; // 50->30(root->left)
        root.right = second;// 50->60(root->Right)
        first.left = third;// 30->20(left->left)
        second.left = fourth;// 60->55(left->left)


        TreeCreation.inOrder(root,list);
        System.out.println("BST is created...");
        System.out.println(list);



        for(int i=0;i<5;i++){
            int key;
            if(i==0)
                key = 450;
            else if(i==1)
                key = 30;
            else if(i==2)
                key = 20;
            else if(i==3)
                key = 50;
            else
                key = 500;
            System.out.println();
            System.out.println("Now, Searching The Key in BST");
            boolean found = search(root,key);
            if(found)
                System.out.println("The Given Key "+key+" has been found");
            else
                System.out.println("The Given Key "+key+" is not the Given BST");

        }

    }


}
