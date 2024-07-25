import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision1(int[] asteroids) {
        Stack<Integer> stack =new Stack<>();

        for(int e:asteroids)
        {
            if(!stack.isEmpty())
            {
               if(stack.peek()<e)
               {
                    stack.push(e);
               }
               else if(stack.peek()==Math.abs(e))
               {
                   stack.pop();
               }
            }
            else {
                stack.push(e);
            }
        }

        int[] em=new int[stack.size()];
        int l=stack.size();
        for(int i=l-1;i>=0;i--)
        {
            em[i]=stack.pop();
        }
        return em;
    }

    public int[] asteroidCollision2(int[] asteroids)
    {
        Stack<Integer> stack =new Stack<>();
        int i=0;
        stack.push(asteroids[i]);
        while(i<asteroids.length-1)
        {
            i++;
            if(stack.peek()>0)
            {
                if(asteroids[i]>0)
                {
                    stack.push(asteroids[i]);
                }
                else
                {
                    if(stack.peek()==Math.abs(asteroids[i]))
                    {
                        stack.pop();
                    } else {
                        if(stack.peek()<Math.abs(asteroids[i]))
                        {
                            stack.pop();
                            stack.push(asteroids[i]);

                        }
                    }
                }
            }
            else
            {
                    stack.push(asteroids[i]);
            }
        }

        int[] em=new int[stack.size()];
        int l=stack.size();
        for(int p = l-1; p >=0; p--)
        {
            em[p]=stack.pop();
        }
        return em;
    }

    public int[] asteroidCollision3(int[] asteroids)
    {
        Stack<Integer> stack =new Stack<>();

        for(int el:asteroids)
        {

            if(el<0)
            {
                if(stack.empty() || stack.peek()<0)
                {
                    stack.push(el);
                }
                else{
                    while (stack.size()>0 && Math.abs(el)>Math.abs(stack.peek()) )
                    {
                        stack.pop();
                        stack.push(el);
                    }
                }

            }
            else
            {
                stack.push(el);
            }
        }

        int[] em=new int[stack.size()];
        int l=stack.size();
        for(int p = l-1; p >=0; p--)
        {
            em[p]=stack.pop();
        }
        return em;
    }

    public int[] asteroidCollision(int[] asteroids)
    {
        Stack<Integer> stack =new Stack<>();
        stack.push(asteroids[0]);
        int i=1;
        while(i<asteroids.length)
        {
            if(asteroids[i]<0 && !stack.empty())
            {
//              -
               if(stack.peek()>0)
               {
//                   +
                   int tm=asteroids[i];

                       while (!stack.isEmpty() && stack.peek()>0 && Math.abs(stack.peek()) < Math.abs(tm)) {
                           stack.pop();
                       }

                       if(stack.isEmpty())
                       {
                           stack.push(tm);
                           i++;
                       }
                       else if( stack.peek()>0 && Math.abs(stack.peek())==Math.abs(asteroids[i]))//equal element
                       {
                           stack.pop();
                           i++;
                       }
                       else if(stack.peek()>0)
                   {
                       i++;
                   }



               }
               else
               {
                   stack.push(asteroids[i]);
                   i++;
               }
            }
            else
            {
                stack.push(asteroids[i]);
                i++;
            }
        }
        int[] em=new int[stack.size()];
        int l=stack.size();
        for(int p = l-1; p >=0; p--)
        {
            em[p]=stack.pop();
        }
        return em;
    }


    public static void main(String[] args) {
        int[] t1={10,2,-5};
        int[] t2={-2,-2,-2,-2};
        int[] t3={5,-7};
        int[] t4={8,-8};
        int[] t6={-2,-2,1,-2};
        int[] t5={-2,2,1,-2};
        int[] t7={1,-1,-2,-2};
        System.out.println(Arrays.toString(new AsteroidCollision().asteroidCollision(t7)));
    }
}
