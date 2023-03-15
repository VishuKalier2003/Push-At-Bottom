// todo: Push an element at the Bottom of the Stack...
import java.util.Scanner;
import java.util.Stack;
//! PushAtBottom Class created...
public class PushAtBottom
{
    //! Function to Push at the Bottom of the Stack... O(n) time...
    public void PushBottom(int t, Stack<Integer> stack)
    {
        //? If Stack is Empty we push the given element...
        if(stack.isEmpty())
        {
            stack.push(t);
            return;
        }
        int top = stack.pop();     // We pop the top element out of the Stack... the Popped element is itself stored in the Recursion Stack...
        PushBottom(t, stack);      //! Recursive Function...
        stack.push(top);
        return;
    }

    //! Main function begins...
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();       //! Integer Stack created...
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int temp = 4;
        PushAtBottom pushbottom = new PushAtBottom();
        pushbottom.PushBottom(temp, stack);
        while(!stack.empty())
        {
            System.out.println(stack.peek());      //? Checking the Stack elements...
            stack.pop();
        }
        // Closing the Scanner class...
        sc.close();
    }
}