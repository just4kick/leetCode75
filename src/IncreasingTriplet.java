import org.w3c.dom.css.CSSMediaRule;

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
        {
            return false;
        }
        int i=0;
        int j=1;
        int k=2;
        while(i+2<nums.length)//check k must be below num.len
        {
            if(k<nums.length) {
                if (nums[j] < nums[k])// check j value must be less than k value
                {
                    if (nums[i] < nums[j])//check i value must e less than j value
                    {
                        return true;//return true if all above condition is true
                    } else//i value is greater than j value
                    {
                        if (j + 1 < k)//check j+1 index is less than k index
                        {
                            j++;
                        } else // j+1 index is not less than k
                        {
                            k++;
                            j++;
                        }
                    }
                } else {
                    k++;
                }

            }
            else
            {
                i++;
                j=i+1;
                k=i+2;
            }

        }
        return false;
    }

    public boolean increasingTriplet1(int[] nums)
    {
        if(nums.length<3)
        {
            return false;
        }
        int i=0;
        int j=1;
        int k=2;
     while(i<nums.length-2)
     {
      if(nums[i]<nums[j])
      {
            if(nums[j]<nums[k])
            {
                return true;
            }
            else
            {
                k++;
                if(!(k<nums.length))
                {
                    j++;
                    k=j+1;
                    if(!(j<nums.length-1))
                    {
                        i++;
                        j=i+1;
                        k=j+1;
                    }
                }
            }
      }
      else
      {
          if((k<nums.length-1))
          {
              k++;
              j++;
          }
          else {
              i++;
              j=i+1;
              k=j+1;
          }

     }
    }

        return false;
    }


    public boolean increasingTriplet2(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= max1) max1 = n;
            else if(n <= max2) max2 = n;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        IncreasingTriplet it= new IncreasingTriplet();
        int[] t1={2,1,5,0,4,6};
        System.out.println(it.increasingTriplet2(t1));
    }

}
