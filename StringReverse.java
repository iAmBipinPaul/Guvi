import java.util.*;

public class StringReverse{

    public static void main(String[] args)

    {

       /* using builtin StringBuilder  Function 

	 StringBuilder r=new StringBuilder("Bipin");

        r.reverse();

        System.out.println(r);

*/

Scanner sc=new Scanner(System.in);

System.out.println("Enter the String ");

 String b=sc.nextLine();

        String c="";

        for(int i=b.length()-1;i>=0;i--)

        {

            c=c+b.charAt(i);

        }

        System.out.println(c);

    }

}