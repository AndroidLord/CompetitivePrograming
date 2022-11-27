package LinkedList;

import LinkedList.Basic.DeleteNodeInDoublyLinkedList;
import LinkedList.Basic.Node;

public class DoublyNode {


        public int data;
        public DoublyNode next;
        public DoublyNode prev;
        public DoublyNode(int d)
        {
            data = d;
            next = prev = null;
        }

    public static void TransverseNode(DoublyNode head){

        DoublyNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp = temp.next;
        }
        System.out.println();
    }

}
