public class LongestOnes {
    public int longestOnes1(int[] nums, int k) {
        int output=0;
        int e=0;
        int res=0;
        int n=k;
        int s=0;
        int f=0;
        int max=0;
        while(s<nums.length)
        {
            if(n>0 && nums[s]==1)
            {
                res++;
                s++;
            } else if (n==0 && nums[s]==1) {
                res++;
                e++;
                s++;

            } else if (n==0 && nums[s]==0) {

                if(res>max)
                {
                    max=res;
                }
                res=e;
                e=0;
                res++;
                n=k-1;
                s++;
            } else
            {
                res++;
                n--;
                s++;
                if(res>max)
                {
                    max=res;
                }
            }
        }


        return max;
    }
    public int longestOnes(int[] nums, int k)
    {
        int max=0;
        int s=0;
        int n=k;
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
        return max;
    }


    public static void main(String[] args) {
        int[] nums={0,1,1,1,1,1,0};
        int k=3;
        System.out.println(new LongestOnes().longestOnes(nums,k));

    }
}
