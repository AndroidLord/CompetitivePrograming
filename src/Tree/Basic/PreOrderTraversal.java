package Tree.Basic;

import Tree.Node;

import java.util.ArrayList;

public class PreOrderTraversal {

    static ArrayList<Integer> list = new ArrayList<>();

    //Function to return a list containing the preorder traversal of the tree.

    public static ArrayList<Integer> preorderTransversal(Node root)
    {

        list.add(root.data);
        if(root.left != null)
        preorderTransversal(root.left);
        if(root.right != null)
        preorderTransversal(root.right);

         return list;
    }



 }


