package LinkedList.Easy;

import LinkedList.Basic.Node;

//https:practice.geeksforgeeks.org/problems/compare-two-linked-lists/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Linked%20List&sortBy=submissions
public class CompareTwoLinkedList {

    // working, mine
    int compare(Node node1, Node node2)
    {
        Node temp1 = node1,temp2=node2;

        while(temp1!=null && temp2!=null){
            if(temp1.data==temp2.data)
            {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1.data>temp2.data)
                return 1;
            else if(temp1.data<temp2.data)
                return -1;
        }

        if(temp1!= null && temp2==null)
            return 1;
        else if(temp1== null && temp2!=null)
            return -1;

        return 0;
    }

}
