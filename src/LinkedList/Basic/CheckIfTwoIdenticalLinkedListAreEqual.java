package LinkedList.Basic;

public class CheckIfTwoIdenticalLinkedListAreEqual {

        // Solution 1-> Done by yourstruely
        public boolean isIdentical1(Node head1, Node head2) {
            Node temp1 = head1, temp2 = head2;


            while (temp1 != null && temp2 != null) {
                if (temp1.data == temp2.data) {
                    if (temp1.next == null & temp2.next == null)
                        return true;

                    temp1 = temp1.next;
                    temp2 = temp2.next;

                } else
                    return false;

            }

            return false;
        }

        //Solution 2-> Good Solution(Alternative, Not done by me~)
     public boolean isIdentical2(Node head1, Node head2){
         Node cur1 = head1;

         Node cur2 = head2;

         while(cur1.data == cur2.data){

             cur1 = cur1.next;

             cur2 = cur2.next;

             if(cur1== null && cur2== null)

                 return true;

             if(cur1== null || cur2== null)

                 return false;

         }



         return false;
     }




    }

