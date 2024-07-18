import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> n1=new HashSet<>();
        HashSet<Integer> n2=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> nr1=new ArrayList<>(n1);
        List<Integer> nr2=new ArrayList<>(n2);

        for (int e : nums1)
        {
            n1.add(e);
        }
        for (int e : nums2)
        {
            n2.add(e);
        }

        for(Integer e: n1)
        {
            if(!(n2.contains(e)))
            {
                nr1.add(e);
            }
        }
        for(Integer e: n2)
        {
            if(!(n1.contains(e)))
            {
                nr2.add(e);
            }
        }

        res.add(nr1);
        res.add(nr2);
        return res;
    }
    public List<List<Integer>> findDifference1(int[] nums1, int[] nums2)
    {
        List<List<Integer>> res=new ArrayList<>();

        HashSet<Integer> total=new HashSet<>();
        for (int e : nums1)
        {
            total.add(e);
        }
        for (int e : nums2)
        {
            total.remove(e);
        }
        List<Integer> nr1=new ArrayList<>(total);
        for (int e : nums2)
        {
            total.add(e);
        }
        for (int e : nums1)
        {
            total.remove(e);
        }
        List<Integer> nr2=new ArrayList<>(total);
        res.add(nr1);
        res.add(nr2);
        return res;
    }

    public static void main(String[] args) {
        int[] ta1={1,2,3};
        int[] ta2={2,4,6};
        System.out.println(new FindDifference().findDifference(ta1,ta2));
    }
}
