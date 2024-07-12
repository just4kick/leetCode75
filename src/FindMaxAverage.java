public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double su=0;
        double tot=0;
        double avg=0;
        int b=0;
        for(int i=0;i< nums.length;i++)
        {
            if(i<k)
            {
                su=(su+nums[i]);
                avg=su/k;
               tot=avg;
            }
            else
            {
                su=su-nums[b];
                b++;
                su=su+nums[i];
                avg=su/k;
                if(avg>tot)
                {
                    tot=avg;
                }
            }
        }
        return tot;
    }

    public static void main(String[] args) {
    int[] t1={-1};
    int k=1;
        System.out.println(new FindMaxAverage().findMaxAverage(t1,k));
    }
}
