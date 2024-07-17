public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int left=0;
        int right=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            right=right+nums[i];
        }
        for (int i=0;i<nums.length;i++)
        {
            right=right-nums[i];
            if(left==right)
            {
                return i;
            }
            left=left+nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
            int[] t1={1,7,3,6,5,6};
        System.out.println(new PivotIndex().pivotIndex(t1));
    }
}
