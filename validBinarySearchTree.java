public class validBinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int item){
            data = item;
            left = null;
            right = null;
        }
    }

    boolean validateBST (Node node){
        if (node == null){
            return true;
        }

        if (node.left != null && node.left.data > node.data){
            return false;
        }

        if (node.right != null && node.data > node.right.data){
            return false;
        }

        if (!validateBST(node.left) || !validateBST(node.right)){
            return false;
        }

        return true;
    }
}
