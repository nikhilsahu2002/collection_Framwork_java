// import java.util.Iterator;
import java.util.Stack;

public class Stack_java {
    public static void main(String[] args) {
        String [] data = {"to","be","or","not","to","be"};
        Stack <String> stack = new Stack<>();
        for (String string : data) {
            stack.push(string);
        }
        
        // Iterator<String> iterator = stack.iterator();
        // while(iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }

        System.out.println("Stack : " + stack);
        System.out.println("Size : " + stack.size());
        System.out.println("Peek : " + stack.peek()); // return a value at the top of the stack  without removing it 
        
        // removing element from stack

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    } 
}
