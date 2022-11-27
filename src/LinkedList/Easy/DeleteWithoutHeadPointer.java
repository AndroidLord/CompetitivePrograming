package LinkedList.Easy;

import LinkedList.Basic.Node;

public class DeleteWithoutHeadPointer {

    // https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&difficulty[]=1&difficulty[]=2&status[]=solved&status[]=unsolved&status[]=attempted&status[]=bookmarked&category[]=Linked%20List&curated[]=1&curated[]=8&curated[]=7&curated[]=2&curated[]=6&sortBy=submissions
    void deleteNode(Node del)
    {
        //Node temp = del;

        if(del.next!=null)
        {
            del.data = del.next.data;
            if(del.next.next!=null)
            {
                del.next = del.next.next;
            }
            else
            {
                del.next = null;
            }
        }

        else
            del = null;



    }

}
