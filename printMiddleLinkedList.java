import java.util.LinkedList;
import java.util.Stack;

public class printMiddleLinkedList {
    public static String printMiddle(LinkedList<String> linkedList){
        Stack<String> reverse = new Stack<>();
        int listnum = 0;
        while (!linkedList.isEmpty()){
            //get every single element in linked list and store to a stack
            reverse.add(linkedList.getFirst());
            linkedList.removeFirst();
            listnum ++;
        }
        for (int i = 0; i < listnum / 2; i++){
            reverse.pop();
        }
        return reverse.lastElement();
    }
    public static void main (String[] args){
        LinkedList<String> initial = new LinkedList<>();
        String result = "";
        initial.add("A");
        initial.add("B");
        initial.add("C");
        initial.add("E");
        initial.add("F");
        initial.add("H");
        result = printMiddle(initial);
        System.out.println(result);
    }
}
