package Tree.Basic;

public class CountNonLeafInTree {

    // Method 1
    int countNonLeafNodes(minValue.Node root) {

        if(root==null)
            return 0;

        return countNLN(root,0);
    }

    // used In Method-1
    int countNLN(minValue.Node root, int count){

        if(root.left!=null){
            count = countNLN(root.left,count);

        }

        if(root.right!=null){
            count = countNLN(root.right,count);
        }

        if(root.right!=null || root.left!=null)
            count++;

        return count;

    }


}
