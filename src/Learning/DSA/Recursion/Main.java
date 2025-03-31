package Learning.DSA.Recursion;

public class Main {
    /*
    recursion = When a thing is defined in terms of itself. - Wikipedia
                Apply the result of a procedure, to a procedure.
                A recursive method calls itself. Can be a substitute for iteration.
                Divide a problem into sub-problems of the same type as the original.
                Commonly used with advanced sorting, algorithms and navigation trees

                Advantages
                -------------------
                easier to read/write
                easier to debug

                Disadvantages
                -------------------
                sometimes slower
                user more memory
     */
    public static void main(String[] args){
        walk(5);
        System.out.println("\n" + factorial(7));
    }
    private static void repeat(){
        repeat();
    }

    private static void walk(int steps){
        if(steps < 1) return; // base case
        System.out.println("You take a step!");
        walk(steps -1);
    }
    /*
    Call stack = In computer science, a call stack is a stack data structure that stores information about the
                 active subroutines of a computer program. This kind of stack is also known as an execution stack,
                 program stack, control stack, run-time stack, or machine stack, and is ofter shortened to just
                 "the stack". Wikipedia

     */
    /*
                Call Stack
                -----------
    Top ====>   | walk(0) |
                -----------
                | walk(1) |
                -----------
                | walk(2) |
                -----------
                | walk(3) |
                -----------
                | walk(4) |
                -----------
                | walk(5) |
                -----------
                | main()  |
                -----------
     */
    private static int factorial(int num){
        if(num < 1) return 1; // base case
        return num * factorial(num - 1); // recursive
    }

    private static int power(int base, int exponent){
        if(exponent < 1) return 1; // base case
        return base * power(base, exponent -1 ); // recursive case
    }
/*               +---------------------------------------------------+
                 | integration               | recursion             |
+----------------+---------------------------+-----------------------+
| implementation | uses loops                | calls itself          |
+----------------+---------------------------+-----------------------+
| state          | control index             | parameter values      |
|                | (int steps = 0)           | walk(int steps)       |
+----------------+---------------------------+-----------------------+
| progression    | moves toward value        | converge towards      |
|                | in condition              | base case             |
+----------------+---------------------------+-----------------------+
| termination    | index satisfies condition | base case = true      |
+----------------+---------------------------+-----------------------+
| size           | more code less memory     | less code more memory |
+----------------+---------------------------+-----------------------+
| speed          | faster                    | slower                |
+----------------+---------------------------+-----------------------+

 */

}
