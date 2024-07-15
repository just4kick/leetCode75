public class MaxVowels {

    boolean isVowel(char a)
    {
        return switch (a) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
    public int maxVowels(String s, int k) {
        int res=0;
        int ws=0;
        int ma=0;
        for(int we = 0; we <s.length(); we++)
        {
            if(we <k)
            {
                if(isVowel(s.charAt(we)))
                {
                    res++;
                   ma=res;
                }
            }else
            {
                if(isVowel(s.charAt(we)))
                {
                    res++;
                }
                if(isVowel(s.charAt(ws)))
                {
                    res--;
                }
                if(res>ma)
                {
                    ma=res;
                }
                ws++;
            }
        }
        return ma;
    }

//below is 3 ms solution on leetcode . and i am not written it.

        public int maxVowels1(String s, int k) {
//            abciiidef
            byte[] arr = new byte[123], str = new byte[s.length()];
            s.getBytes(0, s.length(), str, 0);
            arr['a'] = arr['e'] = arr['i'] = arr['o'] = arr['u'] = 1;
            int i = 0, j = 0, max = 0, ans = 0;
            while (i < k) {
                max += arr[str[i++]];
            }
            ans = max;
            while (i < str.length) {
                max += arr[str[i++]] - arr[str[j++]];
                if (ans < max) {
                    ans = max;
                }
            }
            return ans;

        }
    public static void main(String[] args) {
        String t1="kii";
        int k=3;
        System.out.println(new MaxVowels().maxVowels1(t1,k));
    }
}
