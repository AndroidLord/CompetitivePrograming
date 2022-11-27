package LinkedList.Easy;

import LinkedList.Basic.Node;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseALinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);



        Node newHead = reverseList2(head);

        // print the reversed linked list
        while(newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }

    // working, mine
    static Node reverseList(Node head)
    {
        ArrayList<Node> list = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            list.add(temp);
            temp = temp.next;
        }

        if(list.size()==1)
        return head;

        Collections.reverse(list);
        for(int i=0;i<list.size()-1;i++){
            list.get(i).next = list.get(i+1);
        }
        list.get(list.size()-1).next = null;
        head = list.get(0);
        return head;
    }

    static Node newn = null;
    static Node reverseList2(Node head)
    {
        Node temp = head;
        if(temp.next.next!=null){
            reverseList2(temp.next);
        }
        else
            newn = temp.next;

            temp.next = temp;


        return newn;
    }
}
