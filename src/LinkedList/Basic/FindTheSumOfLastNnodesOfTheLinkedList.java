package LinkedList.Basic;

public class FindTheSumOfLastNnodesOfTheLinkedList {

    public static void main(String[] args) {

        Node head = new Node(5);
        Node second = new Node(9);
        Node third = new Node(6);
        Node fourth = new Node(3);
        Node fifth = new Node(4);
        Node sixth = new Node(10);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        Node.TransverseNode(head);

        int res = sumOfLastKTimes(head,3);

        System.out.println(res);



    }

    public static int sumOfLastKTimes(Node head, int k){

        Node pointer = head;
        Node temp = head;

        int count = 0;
        while(pointer!=null){
            pointer = pointer.next;
            count++;
        }
        int i=1,sum=0;
        while(temp!=null){
            if(i>count-k){sum+=temp.data;}
            temp = temp.next;i++;
        }
        return sum;
    }

}
