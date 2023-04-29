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

    // Working
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        pre(root,list);

        return list;
    }

    static void pre(Node root, ArrayList<Integer> list){

        if(root==null)
        {

            return;
        }
        else
        list.add(root.data);


        if(root.left!=null){

            pre(root.left,list);
        }
        if(root.right!=null){

            pre(root.right,list);
        }



    }

 }


