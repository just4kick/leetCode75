public class ReverseWords {
    public String reverseWords(String s) {
    String result=s.trim();
    StringBuffer se=new StringBuffer();
    String[] arrstr=result.split("\\s+");
    for(int i = arrstr.length-1 ;i>=0;i--)
    {
        se.append(arrstr[i]).append(" ");
    }
    String mm= new String(se);
    return mm.trim();
    }

    public static void main(String[] args) {
        ReverseWords rv = new ReverseWords();
        String t1="a good   example";
        String t2=" ";
        System.out.println(rv.reverseWords(t1));
    }

}
