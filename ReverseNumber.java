import java.util.*;
class ReverseNumber
{
    public static void main(String [] args)
    {
Scanner sc=new Scanner(System.in);
        System.out.println("Ente the number ");
        int n=sc.nextInt();
        int sum=0;
        int a=n,b;
        while(a!=0)
        {
             b=a%10;
            sum=(sum*10)+b;
            a=a/10;
        }
System.out.println(sum);
    }
}