package Tree.Basic;

public class CountLeavesInBinaryTree {

    int countLeaves(minValue.Node node)
    {
        if(node==null){
            return 1;
        }

        int count = 0;


        return leaveCount(node,count);

    }

    int leaveCount(minValue.Node node, int count){

        if(node.left!=null){
            count = leaveCount(node.left,count);
        }
        if(node.right!=null){
            count = leaveCount(node.right,count);
        }
        if(node.left==null && node.right==null){
            count++;
        }
        return count;
    }


}
