import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        String str="(((()()))";
        Stack<Character> s= new Stack<>();
        boolean valid=true;
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            {
                s.push(ch);
            }
            else if(ch==')')
            {
                if(s.empty())
                {
                    valid=false;
                    break;
                }
                else
                {
                    s.pop();
                }
            }
        }
        if(valid && s.empty())
        {
            System.out.println("Valid parenthesis");
        }
        else
        {
            System.out.println("Invalid parenthesis");
        }
    }
}