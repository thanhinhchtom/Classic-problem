public class BinaryTreeReconstruct {
    class Node {
        int data;
        Node left, right;

        Node(int item){
            data = item;
            left = right = null;
        }
    }

    class Tree {
        Node root;
        int preOrderIndex = 0;

        Node buildTree(int inOrder[], int preOrder[], int start, int end){
            if (start > end)
                return null;

        //get the first element in pre order to know the root
            Node tNode = new Node(preOrder[preOrderIndex++]);

            //no more number between start and end ->
            if (start == end){
                return tNode;
            }
            //if there are some elements between start and end, recursive with those elements

            int inOrderIndex = search(inOrder, start, end, tNode.data);


        //reconstruct tree from those indexes
            tNode.left = buildTree(inOrder, preOrder, start, inOrderIndex - 1);
            tNode.right = buildTree(inOrder, preOrder, inOrderIndex + 1, end);

            return tNode;
        }

        int search(int[] arr, int strt, int end, int value){
            int i;
            for (i = strt; i <= end; i++) {
                if (arr[i] == value)
                    return i;
            }
            return i;
        }
    }
}
