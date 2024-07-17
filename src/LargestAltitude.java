public class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int res=0;
        int temp=0;
        for(int e: gain)
        {
            temp=temp+e;
            if(temp>res)
            {
                res=temp;
            }
        }
        return res;
    }
    public int largestAltitude1(int[] gain) {
        int res=0;
        int temp=0;
       for(int i=0; i<gain.length;i++)
       {
           temp=temp+gain[i];
           res=Math.max(temp,res);
       }
        return res;
    }


    public static void main(String[] args) {
        int[] t1={-5,1,5,0,-7};
        System.out.println(new LargestAltitude().largestAltitude1(t1));
    }
}
