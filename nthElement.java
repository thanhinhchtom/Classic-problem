import java.util.LinkedList;
import java.util.Stack;

public class nthElement {
    public String nthElement(LinkedList<String> linkedList, int n){
        Stack<String> reverse = new Stack<>();
        while (!linkedList.isEmpty()){
            //get every single element in linked list and store to a stack
            reverse.add(linkedList.getFirst());
            linkedList.removeFirst();
        }
        for (int i = 0; i < n; i++){
            reverse.pop();
        }
        return reverse.lastElement();
    }
}
