package Stacks;
import java.util.*;
public class inBuiltExamples {
  public static void main(String[] args) {
    // Stack<Integer> stack= new Stack<>();
    // stack.push(34);
    // stack.push(45);
    // stack.push(99);
    // stack.push(88);
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop()); 
    // System.out.println(stack.pop());
    // //FILO LIFO
    
    // // queues 
    // Queue <Integer> q=new LinkedList<>();
    // q.add(89);
    // q.add(77);
    // System.out.println(q.remove());
    // //FIFO LILO
    Deque <Integer> dq = new ArrayDeque<>();
    dq.add(89);
    dq.addLast(45);
    dq.removeFirst();


  }
    
  
}
