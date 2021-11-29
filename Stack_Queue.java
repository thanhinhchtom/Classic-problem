import java.util.LinkedList;
import java.util.Queue;

public class Stack_Queue {
    public static class Stack {
        //2 queues
        Queue<String> q1 = new LinkedList<String>();
        Queue<String> q2 = new LinkedList<String>();

        public int curr_size;

        Stack()
        {
            curr_size = 0;
        }

        void push(String x)
        {
            curr_size++;

            // Push x first in empty q2
            q2.add(x);

            // Push all q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }

            Queue<String> q = q1;
            q1 = q2;            //copy all q2 to q1
            q2 = q;             //empty q2
        }

        public void pop()
        {
            // if no elements are there in q1
            if (q1.isEmpty()) {
                return;
            }
            q1.remove();
            curr_size--;
        }

        public String lastElement()
        {
            if (q1.isEmpty()){
                return "Empty";
            }
            return q1.peek();
        }

        public int size()
        {
            return curr_size;
        }
    }
}
