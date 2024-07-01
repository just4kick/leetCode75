//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

public class GCDstring {
    public String gcdOfStrings(String str1, String str2) {
    String common="";
        if(str1.equals(str2))
        {
            return str1;
        }
        else if(str1.length()!=str2.length()) {
            String bs = (str1.length() > str2.length()) ? str1 : str2;
            String ss = (str1.length() < str2.length()) ? str1 : str2;

            String tss = ss;
            String tbs = bs;
            int result=ss.length();
            int a=bs.length();
            int b=ss.length();

            while (result > 0) {
                if (a % result == 0 && b % result == 0) {
                    break;
                }
                result--;
            }

            common=ss.substring(0,result);


            while(!tss.equals(common))
            {
                if(tss.startsWith(common))
                {
                    tss=tss.substring(common.length());
                }
                else {
                    return "";
                }

            }
            while(!tbs.equals(common))
            {
                if(tbs.startsWith(common))
                {
                    tbs=tbs.substring(common.length());
                }
                else
                {
                    return "";
                }

            }


        }
        return common;
    }


    public static void main(String[] args) {
        GCDstring s= new GCDstring();
       String output= s.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");
        System.out.println("out "+output);
    }
}
