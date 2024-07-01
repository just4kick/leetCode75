//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;

public class Kidwithcandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> a= new ArrayList<>();
        int h=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            if(h<candies[i])
            {
                h=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            int p=candies[i]+extraCandies;
           if(p>=h)
           {
               a.add(true);
           }
           else
           {
               a.add(false);
           }
        }
        return a;
    }

    public static void main(String[] args) {
        Kidwithcandy k = new Kidwithcandy();
        int t[]={2,3,5,1,3};
        System.out.println(k.kidsWithCandies(t,3));
    }
}
