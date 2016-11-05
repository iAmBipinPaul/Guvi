import java.util.*;
class StringToInt
{
    public static void main(String [] args)
    {
Scanner sc=new Scanner(System.in);
        System.out.println("Ente the Numbr in Stirng Format");
        String n=sc.nextLine();
        try
        {
 int sum=Integer.parseInt(n);
 System.out.println("The Convertd Numbris :"+ sum);
        }
       catch(Exception e)
       {
System.out.println("NOt a valid Integer of String ");
       }
    }
}