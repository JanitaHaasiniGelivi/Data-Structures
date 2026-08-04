package Stacks;
public class DynamicMain {
    public static void main(String[] args) {
        DynamicStack ds = new DynamicStack(5);
        ds.push(90);
        ds.push(80);
        ds.push(70);
        ds.push(60);
        ds.push(50);
        // Stack is full here
        ds.push(40); // Array size automatically doubles
        System.out.println("Element pushed successfully!");
        
    }
}