public class ReverseWords {
    public String reverseWords(String s) {
    StringBuffer se=new StringBuffer();
    String[] arrstr=s.trim().split("\\s+");
    for(int i = arrstr.length-1 ;i>=0;i--)
    {
        se.append(arrstr[i]).append(" ");
    }
    return se.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords rv = new ReverseWords();
        String t1="a good   example";
        String t2=" ";
        System.out.println(rv.reverseWords(t1));
    }

}
