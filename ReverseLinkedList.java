import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {
    public LinkedList<String> reverseLinkedList(LinkedList<String> linkedList){
        Stack<String> reverse = new Stack<>();
        while (!linkedList.isEmpty()){
            //get every single element in linked list and store to a stack
            reverse.add(linkedList.getFirst());
            linkedList.removeFirst();
        }
        while (!reverse.isEmpty()){
            //get element from last of stack to add to an empty linked list
            linkedList.add(reverse.lastElement());
            reverse.pop();
        }
        return linkedList;
    }

}
