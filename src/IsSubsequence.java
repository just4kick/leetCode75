public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
            int k=0;
            int f=0;
            for(int i= 0;i<s.length();i++)
            {
                for(int j=k;j<t.length();j++)
                {
                    if(t.charAt(j)==s.charAt(i))
                    {
                        f++;
                        k=j+1;
                        break;
                    }
                }
            }

            return (f==s.length());
    }

    public static void main(String[] args) {
        String s="aba";
        String t="abba";
        System.out.println(new IsSubsequence().isSubsequence(s,t));
    }
}
