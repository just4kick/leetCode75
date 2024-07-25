
import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> que;
    public RecentCounter() {
        que = new LinkedList<>();
    }
    public int ping(int t) {

        que.add(t);
        System.out.println(que);
        if(t<=3000)
        {
           return que.size();
        }else
        {
            int range=t-3000;
            while(!(range<=que.peek()))
            {
                que.remove();
            }

            return que.size();
        }
    }


    public static void main(String[] args) {

        System.out.println(new RecentCounter().ping(3001));
    }
}
