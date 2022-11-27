package LinkedList.Easy;

import LinkedList.Basic.Node;

public class NthNodeFromTheEndOfLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int result = getNthFromLast(head,1);
        System.out.println(result);


    }

    static int getNthFromLast(Node head, int n)
    {
        Node temp = head;
        int count = 1;

        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int pos = 1;
        while(temp!=null){
            if(count-n==pos)
            {
                return temp.data;
            }
            pos++;
            temp = temp.next;
        }
        return -1;
    }

}
