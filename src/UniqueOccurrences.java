import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int c:arr)
        {
            if(map.get(c)!=null)
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);

            }
        }
        HashSet<Integer> m=new HashSet<>(map.values());
        return map.size()==m.size();
    }

    public static void main(String[] args) {
        int[] t1={1,2,2,1,1,3};
        System.out.println(new UniqueOccurrences().uniqueOccurrences(t1));
    }
}
