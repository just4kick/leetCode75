public class LongestSubarray {
    public int longestSubarray(int[] nums) {

        int max=0;
        int s=0;
        int n=1;
        int ss=0;
        while (s<nums.length)
        {
            if(nums[s]==1)
            {
                s++;
                if(s-ss>max)
                {
                    max=s-ss;
                }
            } else if (nums[s]==0 && n==0) {

                if(nums[ss]==0)
                {
                    s++;
                    ss++;
                }
                else
                {
                    ss++;
                }
                if(s-ss>max)
                {
                    max=s-ss;
                }


            }
            else
            {
                n--;
                s++;
                if(s-ss>max)
                {
                    max=s-ss;
                }
            }
        }
        return max-1;
    }
}
