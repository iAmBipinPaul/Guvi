import java.util.*;
class Unique
{
    public static void main(String [] args)
    {
        int [] a={4,2,3,4,5,5,3,2,1};
        int count;
        for(int i=0;i<a.length;i++)
        {
            count=0;

            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                count++;
            }
            if(count==1)
            {
                System.out.println(a[i]);
                System.exit(0);
            }
        }
        System.out.println("Unique elemnt does not exist");
    }
}