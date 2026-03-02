// Write a Java program to implement Stack
import java.util.Stack;

public class impstack {
    public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> s = new Stack<>();

        // Push elements in stack
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        // Print the stack
        System.out.println("Stack s : " + s);
        
        // Pop elements from stack
        s.pop();
        System.out.println("Stack s after pop : " + s);

        // Peek the top element
        System.out.println("Top element of stack s : " + s.peek());

        // Check if stack is empty
        System.out.println("Is stack s empty? : " + s.empty());

        // Print the size of stack
        System.out.println("Size of stack s : " + s.size());
        
        // Print the stack elements
        System.out.println("Stack s : " + s);
        

    }
    
}
