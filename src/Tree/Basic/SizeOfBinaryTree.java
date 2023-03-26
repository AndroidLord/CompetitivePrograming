package Tree.Basic;
//https://practice.geeksforgeeks.org/problems/size-of-binary-tree/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Tree&sortBy=submissions
public class SizeOfBinaryTree {

    // Method 1
    public static int getSize(minValue.Node root)
    {

        if(root==null){
            return 0;
        }

        int count = 0;

        return countnodes(root,count);

    }

    // Used in Method 1
    static int countnodes(minValue.Node node, int count){

        if(node.left!=null){
            count = countnodes(node.left,count);
        }
        if(node.right!=null)
            count = countnodes(node.right,count);

        count++;
        return count;

    }

    // Method 2
    public static int getSize2(minValue.Node root)
    {

        if(root==null){
            return 0;
        }


        return 1+getSize(root.left)+getSize(root.right);

    }

}
