package LinkedList.Basic;

public class FindNdivideKtheNodeInLinkedList {

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
        fifth.next = sixth;

        Node.TransverseNode(head);

        int res = nknode(head,2);
        System.out.println(res);
    }

    public static int nknode(Node head, int k)
    {
        int count=0;
        Node pointer = head;
        while(pointer!=null){
            pointer = pointer.next;count++;
        }
        int ceil = (int)Math.ceil(count/k);
        Node temp = head;int i=1;
        while(temp!=null){
            if(i==ceil)
                return temp.data;

            temp=temp.next;
            i++;
        }
        return -1;
    }

}
