import java.util.Arrays;

public class EqualPairs {
    public int equalPairs1(int[][] grid) {
    int res=0;
//    for(int r=0;r<grid.length;r++)
//    {
//        int f=0;
//      for(int c=0;c<grid.length;c++)
//      {
//          if(grid[r][c]!=grid[c][r])
//          {
//              f=1;
//              break;
//          }
//
//      }
//    if(f==0)
//    {
//       res++;
//    }
//    }


        for(int[] row : grid)
        {
            for(int j=0;j<grid.length;j++)
            {
            int[] tem=new int[grid.length];
            for(int i=0;i<grid.length;i++)
            {
                tem[i]=grid[i][j];
            }
            if(Arrays.equals(row,tem))
            {
                res++;
            }
            }
        }
    return res;
    }
    public int equalPairs(int[][] grid)
    {
        int res=0;
        int f=0;
        int q =0;
        int le=grid.length;
        int[][] col=new int[le][le];
        for(int i=0;i<le;i++)
        {
            for(int j=0;j<le;j++)
            {
                col[i][j]=grid[j][i];
            }
        }

        for(int[] a1:grid)
        {
            for(int[] a2: col)
            {
                f=0;
                q =0;
                while(q <le)
                {
                    if(a1[q]!=a2[q])
                    {
                        f=1;
                        break;
                    }
                    q++;
                }
                if(f==0)
                {
                    res++;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[][] t1={{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        int[][] t2={{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(new EqualPairs().equalPairs(t2));
    }
}
