import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class StringCompression {
    public int compress(char[] chars) {
        if(chars.length==1) return 1;
        AtomicInteger output= new AtomicInteger();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char p : chars)
        {
            if(map.get(p)==null)
            {
                map.put(p,1);
            }
            else
            {
                int v=map.get(p);
                map.put(p,v+1);
            }

        }
        AtomicInteger i = new AtomicInteger(0);
    map.forEach((key,value)->
    {
        if(value<2)
        {
            output.set(output.get() + 1);
            chars[i.get()]=key;
            i.getAndIncrement();
        } else if (value<10) {
            output.set(output.get()+2);
            chars[i.get()]=key;
            chars[i.get()+1]=Character.forDigit(value,10);
            i.getAndIncrement();
            i.getAndIncrement();

        } else {
            output.set(output.get()+3);
            chars[i.get()]=key;
            chars[i.get()+1]=Character.forDigit(value/10,10);
            chars[i.get()+2]=Character.forDigit(value%10,10);
            i.getAndIncrement();
            i.getAndIncrement();
            i.getAndIncrement();
        }

    });

        return output.intValue();
    }
    public int compress1(char[] chars) {
        if(chars.length==1) return 1;
        char cur=chars[0];
        int i=0;
        int c=0;
        int j=0;
        int m=0;
        int f=0;
        while (i<chars.length)
        {
            if(f==0 && chars[i]==cur)
            {
                c++;
                i++;
                if(!(i<chars.length))
                {
                    f=1;
                    i--;

                }
            }
            else if(f==1 ||chars[i]!=cur)
            {
                if(c<2)
                {
                    m=m+1;
                    chars[j]=cur;
                    cur=chars[i];
                    c=0;
                    j++;
                    if(f==1) i++;
                } else if ( c<10) {
                    m=m+2;
                    chars[j]=cur;
                    chars[j+1]=Character.forDigit(c,10);
                    j=j+2;
                    cur=chars[i];
                    c=0;
                    if(f==1) i++;
                } else if(c<100){
                    m=m+3;
                    chars[j]=cur;
                    chars[j+1]=Character.forDigit(c/10,10);
                    chars[j+2]=Character.forDigit(c%10,10);
                    j=j+3;
                    cur=chars[i];
                    c=0;
                    if(f==1) i++;
                } else if (c<1000) {
                    m=m+4;
                    chars[j]=cur;
                    chars[j+1]=Integer.toString(c).charAt(0);
                    chars[j+2]=Integer.toString(c).charAt(1);
                    chars[j+3]=Integer.toString(c).charAt(2);
                    j=j+4;
                    cur=chars[i];
                    c=0;
                    if(f==1) i++;
                }else if(c<=2000)
                {
                    m=m+5;
                    chars[j]=cur;
                    chars[j+1]=Integer.toString(c).charAt(0);
                    chars[j+2]=Integer.toString(c).charAt(1);
                    chars[j+3]=Integer.toString(c).charAt(3);
                    chars[j+4]=Character.forDigit((c%1000)%100%10,10);
                    j=j+5;
                    cur=chars[i];
                    c=0;
                    if(f==1) i++;
                }
            }
        }
        return m;

    }
    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        char[] t1={'a','a','b','b','a','a'};
        char[] t2 ={'a','a','a','b','b','a','a'};
        char[] t3={'a','a','a'};
        char[] t4={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//        ch[] t5={'a',"a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a"};
        System.out.println(sc.compress1(t4));
        System.out.println(t4);
    }
}
