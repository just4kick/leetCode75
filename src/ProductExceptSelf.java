import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
//originally coded by me .
                int length = nums.length;
        int[] pre= new int[length];
        int[] sub= new int[length];
        pre[0]=1;
        sub[length -1]=1;
        for(int i = 1; i< length; i++)
        {
            pre[i]=nums[i-1]*pre[i-1];
            sub[length -i-1]=nums[length -i] * sub[length -i];
        }
      for(int i = 0; i< length; i++)
      {
          nums[i]=pre[i]*sub[i];
      }


        // after understanding solution by others.


//        int[] output=new int[nums.length];




        return nums;
    }

    public static void main(String[] args) {
        ProductExceptSelf pes= new ProductExceptSelf();
        int[] t1={2,3,4,5};
        System.out.println(Arrays.toString(pes.productExceptSelf(t1)));
    }

}
