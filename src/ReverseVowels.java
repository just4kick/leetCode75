public class ReverseVowels {

    public String reverseVowels(String s) {
//        String[] result=s.split(" ");
        String result =s;
            char[] ch = result.toCharArray();
            int end = result.length() - 1;
            int start = 0;
            int ss = 0;
            int ed = 0;
            while (start < end) {
                if (ss == 0 && (ch[start] == 'a' || ch[start] == 'e' || ch[start] == 'i' || ch[start] == 'o' || ch[start] == 'u' || ch[start] == 'A' || ch[start] == 'E' || ch[start] == 'I' || ch[start] == 'O' || ch[start] == 'U')) {
                    ss = 1;
                }
                if (ed == 0 && (ch[end] == 'a' || ch[end] == 'e' || ch[end] == 'i' || ch[end] == 'o' || ch[end] == 'u' || ch[end] == 'A' || ch[end] == 'E' || ch[end] == 'I' || ch[end] == 'O' || ch[end] == 'U')) {
                    ed = 1;
                }

                if (ss == 1 && ed == 1) {
                    char tem = ch[start];
                    ch[start] = ch[end];
                    ch[end] = tem;
                    ss = 0;
                    ed = 0;
                }
                if (ss == 0) {
                    start++;
                }
                if (ed == 0) {
                    end--;
                }
        }


    String m= new String(ch);
        return m;
    }

    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        String t1="A man, a plan, a canal: Panama";
        System.out.println(rv.reverseVowels(t1));
    }

}
