package LinkedList.Basic;

import LinkedList.DoublyNode;

import java.util.function.DoubleBinaryOperator;

public class DeleteNodeInDoublyLinkedList {

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(1);
        DoublyNode second = new DoublyNode(3);
        DoublyNode third = new DoublyNode(4);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;


       DoublyNode.TransverseNode(head);

       deleteNode(head,1);

        DoublyNode.TransverseNode(head);

    }



    static DoublyNode deleteNode(DoublyNode head,int x)
    {

        if(x==1){
            head = head.next;
            head.prev = null;
            return head;
        }

        DoublyNode temp = head;
        int count=0;
        while(count!=x-1){
            temp = temp.next;
            count++;
        }

            DoublyNode previous = temp.prev;
            previous.next = temp.next;

        return head;
    }

}
