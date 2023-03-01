package LinkedList.Easy;

import LinkedList.Basic.Node;

import java.util.HashSet;
//https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions
public class DetectLoopInLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next.next;

        boolean loop = detectLoop(head);
        System.out.println(loop);
    }

    // working, mine
    public static boolean detectLoop(Node head){

        if(head==null || head.next==null)
            return false;


        Node temp = head;
        HashSet<Node> set = new HashSet();
        while(temp!=null){
            set.add(temp);
            if(set.contains(temp.next)){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

}
