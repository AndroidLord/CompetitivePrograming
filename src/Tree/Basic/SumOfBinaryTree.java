package Tree.Basic;

public class SumOfBinaryTree {

    // Method 1
    static int sumBT(minValue.Node head){

        if(head==null){
            return 0;
        }

        return sumBT(head.left) + sumBT(head.right) + head.data;

    }

}
