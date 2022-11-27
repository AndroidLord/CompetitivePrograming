package LinkedList.Easy;

public class MergeTwoSortedLinkedList {



        public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next)
            {
                this.val = val;
                this.next = next;
            }
  }


        // working, mine but very bad, but it was first try
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            if(list1== null){
                if(list2==null) return list2;
                else return list2;
            }

            if(list2== null){
                if(list1==null) return list1;
                else return list1;
            }

            ListNode head = new ListNode();
            ListNode temp = head;

            ListNode temp1 = list1;
            ListNode temp2 = list2;

            while(temp1!=null && temp2!=null){
                if(temp1.val>temp2.val){
                    temp.val = temp2.val;
                    temp2 = temp2.next;
                    temp.next = new ListNode();
                    temp = temp.next;
                }
                else{
                    temp.val = temp1.val;
                    temp1 = temp1.next;
                    temp.next = new ListNode();
                    temp = temp.next;
                }
            }

            if(temp1!=null){
                while(temp1!=null){
                    temp.val = temp1.val;
                    temp1 = temp1.next;
                    if(temp1!=null){
                        temp.next = new ListNode();
                        temp = temp.next;
                    }
                }
            }
            else if(temp2!=null){
                while(temp2!=null){
                    temp.val = temp2.val;
                    temp2 = temp2.next;
                    if(temp2!=null){
                        temp.next = new ListNode();
                        temp = temp.next;
                    }
                }
            }

            return head;
        }

        // method 2, not mine but I understand this.. pretty good sol
        public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
                ListNode dummyHead = new ListNode(-1);
                ListNode curr = dummyHead;

                while (list1 != null && list2 != null) {
                    if (list1.val <= list2.val) {
                        curr.next = list1;
                        list1 = list1.next;
                    } else {
                        curr.next = list2;
                        list2 = list2.next;
                    }

                    curr = curr.next;
                }

                if (list1 == null) {
                    curr.next = list2;
                } else {
                    curr.next = list1;
                }

                return dummyHead.next;
            }

        // method 3, not mine but uses recursive approach for this question
        public ListNode mergeTwoLists3(ListNode list1, ListNode list2) {

            if (list1 == null)
                return list2;

            if (list2 == null)
                return list1;

            if (list1.val <= list2.val) {
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            }
            else {
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
    }





