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

    public static void main(String[] args) {
        int[] t1={-5};
        System.out.println(new LargestAltitude().largestAltitude(t1));
    }
}
