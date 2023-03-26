package Tree.Basic;

public class minValue {

    public class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    int minValue(Node node) {

        if(node==null)
            return -1;

        Node temp = node;

        while(temp.left!=null){
            temp = temp.left;
        }
        return temp.data;
    }

}
}
