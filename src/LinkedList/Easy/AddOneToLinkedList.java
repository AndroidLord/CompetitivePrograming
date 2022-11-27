package LinkedList.Easy;

import LinkedList.Basic.Node;
//https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions
public class AddOneToLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node.TransverseNode(head);
        Node temp = addOne(head);
        Node.TransverseNode(temp);
    }

        // working, mine
        public static Node addOne(Node head) {
            if (head == null) {
                return null;
            }
            int carry = one(head);
            if (carry == 1) {
                Node pre = new Node(1);
                pre.next = head;
                head = pre;
            }
            return head;
        }

        static int one(Node temp) {
            if (temp.next == null) {
                temp.data += 1;
                if (temp.data > 9) {
                    temp.data = 0;
                    return 1;
                }
                return 0;
            }
            int carry = one(temp.next);
            temp.data += carry;
            if (temp.data > 9) {
                temp.data = 0;
                return 1;
            }
            return 0;
        }



    // Doesn't work for all case and approach is good but not good enough
    public static Node addOne2(Node head)
    {
        Node temp = head;
        int no = 0;
        int zeroth = 1;
        while(temp!=null){
            if(head!=temp)
            no = no * 10;
            no = no + temp.data;

            temp = temp.next;
        }
        head.data = no+1;
        head.next = null;
        return head;
    }

}
