package LinkedList.Easy;

import LinkedList.Basic.Node;

public class OccuranceOfAnIntegerInLinkedList {

    // https://practice.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
    // working, mine
    public static int count(Node head, int search_for)
    {
        Node temp = head;
        int count =0;
        while(temp!=null){

            if(temp.data==search_for)
                count++;

            temp = temp.next;
        }
        return count;
    }

}
