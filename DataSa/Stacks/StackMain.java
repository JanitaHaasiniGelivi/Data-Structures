package Stacks;
public class StackMain {
    public static void main(String[] args) {

        Stack st = new Stack(8);

        st.push(90);
        st.push(89);
        st.push(67);
        st.push(99);
        st.push(59);
        st.push(79);
        st.push(94);

        try {
            System.out.println("Top element: " + st.peek());
            System.out.println("Popped: " + st.pop());
            System.out.println("Popped: " + st.pop());
            System.out.println("Top element after popping: " + st.peek());

        } catch (StackException e) {
            System.out.println(e.getMessage());
        }
    }
}