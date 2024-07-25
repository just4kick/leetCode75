import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveStars {
    public String removeStars1(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch!='*')
            {
                stack.push(ch);
            }
            else {
                if(!(stack.isEmpty()))
                {
                    stack.pop();
                }
            }
        }
        char[] a= new char[stack.size()];
        int i=stack.size()-1;
        while (!stack.isEmpty())
        {
            a[i]=stack.pop();
            i--;
        }
        String res= new String(a);
        return res;
    }
    public String removeStars(String s)
    {
        String res="";
        int le=s.length();
        int io=0;
        char[] stack=new char[le];
        char[] str=s.toCharArray();
        for(int i=0;i<le;i++)
        {
            if(str[i]!='*')
            {
                stack[io++]=str[i];
            }
            else
            {
                stack[--io]=' ';
            }
        }

        return new String(stack).trim();
    }



    public static void main(String[] args) {

        String t1="leet**cod*e";
        System.out.println(new RemoveStars().removeStars(t1));


    }
}
