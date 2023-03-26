package Tree.Easy;

import Tree.Basic.minValue;

public class MirrorTree {

    public class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        void mirror(Node node) {


            change(node);

        }

        void change(Node node) {

            if (node.left != null || node.right != null) {
                Node temp = node.left;
                node.left = node.right;
                node.right = temp;
            }
            if (node.left != null) {
                change(node.left);
            }
            if (node.right != null) {
                change(node.right);
            }

        }
    }
}
