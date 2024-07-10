import java.util.Arrays;

public class MaxArea {
    public int maxArea(int[] height) {
        int are =0;
        int ma=0;
        int dis=0;
        for(int i=0;i<height.length;i++)
        {
                    for(int j=i;j< height.length;j++)
                    {
                        dis=j-i;
                        int tare=0;
                        if(height[i]<height[j])
                        {
                            tare=dis * height[i];
                        }
                        else if(height[i]>=height[j])
                        {
                            tare=dis * height[j];
                        }
                            if(tare>are)
                            {
                                are=tare;
                            }

                    }
                    if(are>ma)
                    {
                        ma=are;
                    }
                    are=0;
        }
    return ma;
    }
    public int maxArea1(int[] height)
    {
        int result=0;
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
            int dis = j-i;
            if(height[i]<height[j])
            {
                if((dis * height[i])>result)
                {
                    result=dis * height[i];
                }
                i++;
            }
            else
            {
                if((dis * height[j])>result)
                {
                    result=dis * height[j];
                }
                j--;

            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] t1={8,20,1,2,3,4,5,6};
        System.out.println(new MaxArea().maxArea1(t1));
    }
}
