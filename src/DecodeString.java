import java.util.ArrayList;
import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {

        if(!(s.contains("[") || s.contains("]")))
        {
            return s;
        }


        StringBuilder res= new StringBuilder(s);
        StringBuilder out= new StringBuilder();
        StringBuilder tems= new StringBuilder();
        int m=0;
        ArrayList<Integer> ba=new ArrayList<>();
        ArrayList<Integer> ma=new ArrayList<>();
        ArrayList<Integer> mfa=new ArrayList<>();

        Stack<Character> ast=new Stack<>();
        int f=0;
        int mf=0;
//        int i=0;
        int j=0;

        for(int b=0;b<s.length();b++)
        {
            if(Character.isDigit(s.charAt(b)) && s.charAt(b+1)=='[')
            {
//                100[leetcode]
                ba.add(b);
                mf=b;
                while(mf>=0 && Character.isDigit(s.charAt(mf)))
                {
                    tems.append(s.charAt(mf));
                    mf--;
                }
                mfa.add(++mf);
                ma.add(Integer.parseInt(tems.reverse().toString()));
                tems.delete(0,tems.length());
            }
        }

        while(!ba.isEmpty())
        {
            j=ba.getLast();
          while(res.charAt(j)!=']')
          {
              ast.push(res.charAt(j));
              j++;
          }
            for(int k=j;k>=mfa.getLast();k--)
            {
                res.deleteCharAt(k);
            }

          while(f==0)
          {
              if(ast.peek()!='[')
              {
                  tems.append(ast.pop());
              }
              else
              {
                  ast.pop();
                  ast.pop();
                  f=1;
              }
          }

        out.append(tems.reverse().toString().repeat(ma.getLast()));
        ma.removeLast();
        tems.delete(0,tems.length());
        res.insert(mfa.getLast(),out);
        out.delete(0,out.length());
        mfa.removeLast();
        //clear
        ba.removeLast();
        f=0;
        }

//        System.out.println("assit = " + ast);
//        System.out.println("main = " + mst);
//        System.out.println("ba ="+ ba );
//        System.out.println("res = " + res);
//        System.out.println("m = " + m);

        return res.toString();
    }

    public static void main(String[] args) {
        String t1="3[a2[c]]";
        String t3="2[abc]3[cd]ef";
        String t2="su";
        String t5="100[leetcode]";
        System.out.println(new DecodeString().decodeString(t5));
    }
}
