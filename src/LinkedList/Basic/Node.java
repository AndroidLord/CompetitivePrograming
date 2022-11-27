package LinkedList.Basic;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
}

    public static void TransverseNode(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }

}
