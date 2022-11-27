package LinkedList.Basic;

public class ModularNode {

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

        int res = moduarNode(head,35);
        System.out.println(res);
    }

    public static int moduarNode(Node head, int k)
    {
        int div = -1;
        Node pointer = head;

        while(pointer!=null){
            int tres = pointer.data%k;
            if(tres==0)
                if(pointer.data>div)
                    div = pointer.data;
            pointer = pointer.next;
        }
        return div;
    }

}
