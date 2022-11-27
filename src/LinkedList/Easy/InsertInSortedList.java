package LinkedList.Easy;

import LinkedList.Basic.Node;

public class InsertInSortedList {

    Node sortedInsert(Node head, int keyNo) {

        Node key = new Node(keyNo);

        Node temp = head;
        while(temp!=null){
            if(keyNo>temp.data)
            {
                if(temp.next==null)
                {
                    temp.next = key;
                    break;
                }

                temp = temp.next;
                continue;
            }
            key.data = temp.data;
            key.next = temp.next;
            temp.next = key;
            temp.data = keyNo;
            break;
        }
        if(head.data>temp.data)
            return temp;
        return head;

    }

}
