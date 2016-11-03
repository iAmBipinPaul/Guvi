public class StringReverse{

    public static void main(String[] args)
    {
       /* using builtin StringBuilder  Function 
	 StringBuilder r=new StringBuilder("Bipin");
        r.reverse();
        System.out.println(r);
*/
        String c="";


        String b="Bipin";
        for(int i=b.length()-1;i>=0;i--)
        {

            c=c+b.charAt(i);
        }
        System.out.println(c);
    }
}