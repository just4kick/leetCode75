import java.util.ArrayList;
import java.util.Arrays;

public class MaxOperations {
    public int maxOperations1(int[] nums, int k) {
        ArrayList<Integer> h= new ArrayList<Integer>();
        int result=0;
        for(int e : nums)
        {
            h.add(e);
        }
        for(int r=0;r<h.size();r++)
        {
            for(int l=h.size()-1;l>0;l--)
            {
                if(nums[r]+nums[l]==k)
                {
                    result ++;
                    h.remove(l);
                    h.remove(r);

                }
            }
        }

        return result;
    }

    public int maxOperations(int[] nums, int k)
    {
        int res=0;
        int p=0;
        int s=0;
        int e=nums.length-1;
        while(s<e)
        {
            if(nums[s]+nums[e]==k)
            {
                s++;
                e--;
                p++;
                res++;
            }
            else {
                if (s + 1 < e) {
                   s++;
                } else {
                    e--;
                    s = p;
                }
            }

        }

        return res;
    }
    public int maxOperations2(int[] nums, int k)
    {
        Arrays.sort(nums);
        int res=0;
        int p=0;
        int s=0;
        int e=nums.length-1;
        while(s<e)
        {
            if(nums[s]+nums[e]==k)
            {
                res++;
                p++;
                s=s+1;
                e=e-1;
            }
            else {

                if(e-1>s)
                {
                    e--;
                }
                else {
                    s++;
                    e= nums.length-p-1;
                }
            }
        }

        return res;
    }

    public int maxOperations3(int[] nums, int k)
    {
        Arrays.sort(nums);
        int res=0;
        int bb=0;
        int be=0;
        int s=0;
        int e=nums.length-1;
        while(s<e)
        {
            if(Math.abs(nums[s]-k)==nums[e])
            {
                res++;
                bb=s+1;
                be=e-1;
                s++;
                e--;
            }else {
                if(Math.abs(nums[s]-k)>nums[e])
                {
                    s=(s+1)+bb;
                    e=nums.length-1-be;
                }
                else {
                    e=(e-1)-be;
                }

            }
        }
        return res;
    }

    public int maxOperations4(int[] nums, int k)
    {
        int res=0;
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        for(int i=nums.length-1;i>0;i-- )
        {
            if(Math.abs(nums[0]-k)<=nums[i])
            {
                e=i;
                break;
            }
        }
        while(s<e)
        {
            if(Math.abs(nums[s]-k)==nums[e])
            {
                res++;
                s++;
                e--;
            }
            else if(Math.abs(nums[s]-k)<nums[e])
            {
                e--;
            }else
            {
                s++;
            }

        }

        return res;

    }





    public static void main(String[] args) {

        int[] t1={63,10,28,31,90,53,75,77,72,47,45,6,49,13,77,61,68,43,33,1,14,62,55,55,38,54,8,79,89,14,50,68,85,12,42,57,4,67,75,6,71,8,61,26,11,20,22,3,70,52,82,70,67,18,66,79,84,51,78,23,19,84,46,61,63,73,80,61,15,12,58,3,21,66,42,55,7,58,85,60,23,69,41,61,35,64,58,84,61,77,45,14,1,38,4,8,42,16,79,60,80,39,67,10,24,15,6,37,68,76,30,53,63,87,11,71,86,82,77,76,37,21,85,7,75,83,80,8,19,25,11,10,41,66,70,14,23,74,33,76,35,89,68,85,83,57,6,72,34,21,57,72,79,29,65,3,67,8,24,24,18,26,27,68,78,64,57,55,68,28,9,11,38,45,61,37,81,89,38,43,45,26,84,62,22,37,51,15,30,67,75,24,66,40,81,74,48,43,78,14,33,19,73,5,1,2,53,29,49,73,23,5};
        int[] t2={3,1,3,4,3};
        int k=6;
        System.out.println(new MaxOperations().maxOperations4(t2,k));
    }
}
