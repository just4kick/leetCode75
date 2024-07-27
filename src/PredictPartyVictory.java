import java.util.LinkedList;
import java.util.Queue;

public class PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        String D="Dire";
        String R="Radiant";
        StringBuilder sen=new StringBuilder(senate);
        StringBuilder tem=new StringBuilder(sen);;
        Queue<Character> que=new LinkedList<>();

        int i=0;
        while(sen.length()!=1) {
            if(!(sen.toString().contains("R") && sen.toString().contains("D")) )
            {
                if(sen.toString().contains("R"))
                {
                    return R;
                }
                else
                {
                    return D;
                }
            }
            while (i < sen.length()) {
                if (que.isEmpty()) {
                    que.add(sen.charAt(i));
                    i++;
                } else if (que.peek() == sen.charAt(i)) {
                    que.add(sen.charAt(i));
                    i++;
                } else {
                    que.remove();
                    sen.deleteCharAt(i);
                }
            }
            i=0;
        }
        if(sen.toString().contains("R"))
        {
            return R;
        }
        else
        {
            return D;
        }
    }

    public static void main(String[] args) {
        String t1="RRRRRRRD";
        System.out.println(new PredictPartyVictory().predictPartyVictory(t1));
    }
}
