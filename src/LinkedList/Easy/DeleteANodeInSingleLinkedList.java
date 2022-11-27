package LinkedList.Easy;

import LinkedList.Basic.Node;
// https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&difficulty[]=2&status[]=solved&status[]=unsolved&status[]=attempted&status[]=bookmarked&category[]=Linked%20List&curated[]=1&curated[]=8&curated[]=7&curated[]=2&curated[]=6&sortBy=submissions
public class DeleteANodeInSingleLinkedList {

    Node deleteNode(Node head, int x)
    {
        if(x==1){
            if(head.next!=null)
            {head = head.next;
            }
            else
                head = null;
            return head;
        }
        int count = 1;
        Node temp = head;
        while(count!=x-1){

            temp = temp.next;

            count++;
        }
        if(temp.next!=null)
        {
            if(temp.next.next==null)
                temp.next = null;
            else
                temp.next = temp.next.next;
        }
        return head;
    }

}
