package LinkedList.medium;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumber {

    public static void main(String[] args) {

        // Create linked list 1: 2 -> 4 -> 3
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next.next.next = new ListNode(9);

        // Create linked list 2: 5 -> 6 -> 4
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);


        ListNode head = addTwoNumbers(l1,l2);


        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1==null) return l2;
        else if(l2==null) return l1;

        ListNode head=null,temp=null;
        int carry = 0;

        while(l1!=null && l2!=null){

            ListNode node= new ListNode();

            int data = l1.val + l2.val + carry;

            carry=0;

            node.val = data%10==0?0:data%10;

            if(data>9) {

                carry = 1;

            }

            if(head == null){

                head = node;
                temp = head;

            }
            else{

                temp.next = node;
                temp = temp.next;

            }

            l1 = l1.next;
            l2 = l2.next;

        }

        while(l1!=null){

            ListNode node= new ListNode();

            int data = l1.val + carry;

            carry=0;

            node.val = data%10==0?0:data%10;

            if(data>9) {

                carry = 1;

            }

            temp.next = node;
            temp = temp.next;

            l1=l1.next;

        }

        while(l2!=null){

            ListNode node= new ListNode();

            int data =  l2.val + carry;

            carry=0;

            node.val = data%10==0?0:data%10;

            if(data>9) {

                carry = 1;

            }


            assert temp != null;
            temp.next = node;
            temp = temp.next;

            l2=l2.next;

        }

        if(carry==1) temp.next = new ListNode(1);

        return head;

    }



}
