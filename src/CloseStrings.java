import java.util.*;

public class CloseStrings {
    public boolean closeStrings1(String word1, String word2) {

        if(word1.length()!=word2.length())
        {
            return false;
        }
        char[] w1=word1.toCharArray();
        char[] w2= word2.toCharArray();
        HashMap<Character,Integer> oc1=new HashMap<>();
        HashMap<Character,Integer> oc2=new HashMap<>();

        for(int i=0;i<word1.length();i++)
        {
            if(oc1.get(word1.charAt(i))==null)
            {
                oc1.put(word1.charAt(i),1);
            }
            else
            {
                oc1.put(word1.charAt(i),oc1.get(word1.charAt(i))+1);
            }
            if(oc2.get(word2.charAt(i))==null)
            {
                oc2.put(word2.charAt(i),1);
            }
            else
            {
                oc2.put(word2.charAt(i),oc2.get(word2.charAt(i))+1);
            }
        }
        int[] a=oc1.values().stream().mapToInt(Integer::intValue).toArray();
        int[] b=oc2.values().stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if(!(Arrays.equals(a,b)))
        {
            return false;
        }

        TreeSet<Character> ch1 = new TreeSet<>();
        TreeSet<Character> ch2 = new TreeSet<>();

       for(int o=0;o<word1.length();o++)
       {
           ch1.add(word1.charAt(o));
           ch2.add(word2.charAt(o));
       }
       if(ch1.equals(ch2))
       {
           return true;
       }
        return false;
    }
    public boolean closeStrings(String word1, String word2)
    {
        if(word1.equals(word2)) return true;
        int wl1=word1.length();
        int wl2=word2.length();
        if(wl1!=wl2) return false;





        return false;

    }


    public static void main(String[] args) {
        String a="cabbba";
        String b="abbccc";
        System.out.println(new CloseStrings().closeStrings(a,b));
    }
}
