package LinkedList.Basic;

public class DeleteAlternateNodes {



    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        // Node sixth = new Node(6);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // fifth.next = sixth;

        Node.TransverseNode(head);

        deleteAlternate(head);

        Node.TransverseNode(head);

    }

    public static void deleteAlternate (Node head){

        Node pointer = head;

        while(pointer!=null){

            if(pointer.next==null)
                break;

           if(pointer.next.next!=null){
               pointer.next = pointer.next.next;
               pointer = pointer.next;
           }
           else {
               pointer.next = null;
               pointer = null;
           }
            }

        }

    }


