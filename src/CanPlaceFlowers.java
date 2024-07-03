//https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean result=false;
        int zero=0;
//        for(int c : flowerbed)
//        {
//            if(c==0) {
//                zero++;
//            }
//        }
//        if(zero>1 && flowerbed.length==zero && zero%2!=0)
//        {
//            zero++;
//        }
//        if(zero>1 && zero/2>=n)
//        {
//            return true;
//        }

        if(flowerbed.length ==1 )
        {
             if(flowerbed[0] == 0)
             {
                 if(n==1)
                 {
                     return true;
                 }
                 else
                 {
                     return false;
                 }
             }
             else
             {
                 if(n!=0)
                 {
                     return false;

                 }
                 else
                 {
                     return true;
                 }

             }
        }
        if(flowerbed.length==2)
        {
            if(flowerbed[0]==0 && flowerbed[1]==0)
            {
                if(n==1)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }


        for(int i=0;i<flowerbed.length-1;i++)
        {
            if(i==0)
            {
                if(flowerbed[i]==0 && flowerbed[i+1]==0)
                {
                    zero++;
                    flowerbed[i]=1;
                }
            }
            else {

                if (flowerbed[i] == 0) {
                    if (flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                        zero++;
                        flowerbed[i] = 1;
                    }


                }
            }

        }

        if(flowerbed[flowerbed.length-1]==0)
        {

            if( flowerbed[flowerbed.length-2]==0)
            {
                zero++;
                flowerbed[flowerbed.length-1]=1;
            }
        }
        System.out.println(zero);
        if(zero>=n)
        {
            return true;
        }

    return result;
    }


    public static void main(String[] args) {
        CanPlaceFlowers cpf= new CanPlaceFlowers();
        int[] t1={0};
        int n=0;
        System.out.println(cpf.canPlaceFlowers(t1,n));
    }
}
