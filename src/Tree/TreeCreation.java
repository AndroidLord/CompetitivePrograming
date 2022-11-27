package Tree;

import java.util.ArrayList;

public class TreeCreation {

    static ArrayList<Integer> list = new ArrayList<>();

    public static Node createNode(int data){

        Node node = new Node(data);

        return node;
    }

    public static void main(String[] args) {

        Node root = createNode(50);
        Node first = createNode(30);
        Node second = createNode(60);
        Node third = createNode(20);
        Node fourth = createNode(55);

        root.left = first;
        root.right = second;
        first.left = third;
        second.left = fourth;


        inOrder(root,list);
        System.out.println(list);

    }


    // PerOrder Main func() to call
    static ArrayList<Integer> preorder1(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        preorder1(root,list);


        return list;
    }

    // Preorder func() that do recursion
    static void preorder1(Node root, ArrayList<Integer> list){

        list.add(root.data);

        if(root.left!=null)
            preorder1(root.left,list);

        if(root.right!=null)
            preorder1(root.right,list);


    }

    // Inorder Main func()
    static void inOrder(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
    }

    public static ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list) {

        if(root.left!=null)
        inOrder(root.left,list);

        list.add(root.data);

        if(root.right!=null)
        inOrder(root.right,list);


        return list;
    }



}
