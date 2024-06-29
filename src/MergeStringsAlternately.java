//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75


public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < (word1.length() + word2.length()); i++) {
            if (i < word1.length()) {
                temp.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                temp.append(word2.charAt(i));
            }
        }

        return temp.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately ms=new MergeStringsAlternately();
        System.out.println(ms.mergeAlternately("abc","xyz"));
    }
}