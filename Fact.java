import java.util.*;
class Fact
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the number ");
        int n=sc.nextInt();
        int sum=1;
        if(n<0)
        {
            System.out.println("Number should be positive ");
        }
        else
        {
          if(n==0)
           {
            sum=1;
           }
        else
          {
             for(int i=1;i<=n;i++)
              {
                 sum=sum*i;
             }
            
           }
            System.out.println(sum);
        }
    }
}