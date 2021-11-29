import java.util.Stack;

public class Queue_Stack {
    public static class Queue {
        //2 stacks
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();

        public int curr_size;

        Queue()
        {
            curr_size = 0;
        }

        void add(String x)
        {
            curr_size++;

            // Push all q1 to q2
            while (!s1.isEmpty()) {
                s2.push(s1.lastElement());
                s1.pop();
            }
            s1.push(x);
            while (!s2.isEmpty()) {
                s1.push(s2.lastElement());
                s2.pop();
            }
        }

        public void remove()
        {
            if (s1.isEmpty()) {
                return;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.lastElement());
                s1.pop();
            }
            s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.lastElement());
                s2.pop();
            }
            // if no elements are there in q1
            curr_size--;
        }

        public String peek()
        {
            String result;
            if (s1.isEmpty()) {
                return "Empty";
            }
            while (!s1.isEmpty()) {
                s2.push(s1.lastElement());
                s1.pop();
            }

            result = s2.lastElement();

            while (!s2.isEmpty()) {
                s1.push(s2.lastElement());
                s2.pop();
            }
            return result;
        }

        public int size()
        {
            return curr_size;
        }
    }
}
