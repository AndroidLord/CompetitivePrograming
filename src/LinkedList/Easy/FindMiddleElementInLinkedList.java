package LinkedList.Easy;

import LinkedList.Basic.Node;

public class FindMiddleElementInLinkedList {

    public static void main(String[] args) {

        Node head = new Node(92);
        Node second = new Node(28);
        Node third = new Node(66);
        Node fourth = new Node(60);
        Node fifth = new Node(37);
        Node sixth = new Node(52);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        //fifth.next = sixth;

        Node.TransverseNode(head);

        int res = getMiddle(head);
        System.out.println(res);

    }

    public static int getMiddle(Node head)
    {
        int TotalCount = 0;
        Node temp = head;

        while(temp!=null){
            temp = temp.next;
            TotalCount++;
        }
        int count = (TotalCount)/2;


        Node t2 = head;
        for(int i=0;i<count;i++){
            t2 = t2.next;
        }
        return t2.data;
    }

}
