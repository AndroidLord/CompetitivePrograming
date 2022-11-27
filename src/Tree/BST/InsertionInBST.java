package Tree.BST;

import Tree.Node;
import Tree.TreeCreation;

import java.util.ArrayList;

public class InsertionInBST {

    static Node insert(Node root, int key) {

     /* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        else if (key < root.data)
            root.left = insert(root.left, key);

        else if (key > root.data)
            root.right = insert(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
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

        int key = 70;
        insert(root,key);

        ArrayList<Integer> list2 = new ArrayList<>();
        TreeCreation.inOrder(root,list2);
        System.out.println("List after Insertion: ");
        System.out.println(list2);
    }

}
