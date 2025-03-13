package Learning.DSA.DS.Stack;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        /*
        stack = LIFO data structure. Last-In First-Out
        stores objects into a sort of "vertical tower"
        push() to add to the top
        pop() to remove from the top
         */

        Stack<String> stack = new Stack<>();

        System.out.println("1. " + stack.empty());

        stack.push("Clash of Clans");
        System.out.println("2. " + stack.empty());
        stack.push("Minecraft");
        stack.push("Free Fire");
        stack.push("Mobile");

        System.out.println("3. " + stack);
        String name = stack.pop();
        stack.pop();

        System.out.println("4. " + stack.peek());
        System.out.println("5. " + stack);
        System.out.println("6. " + name);
        System.out.println("7. " + stack.search("Minecraft"));
        System.out.println("8. " + stack.search("Hay"));

        /*
        uses of stacks?
        1. undo/redo features in text editors
        2. moving back/forward though browser history
        3. backtracking algorithms (maze, file directories)
        4. calling functions (call stack)
         */

    }
}
