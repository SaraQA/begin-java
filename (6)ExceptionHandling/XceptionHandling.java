import java.util.Scanner ;
import java.lang.Integer ;
import java.lang.Double ;

class XceptionHandling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a string") ;
        String s =sc.next();
        int i = 0 ;
        double d =0.0 ;
        try
        {
             i = Integer.parseInt(s) ; // 
        } catch(NumberFormatException e)
        {
            System.out.println("Not an integer") ;
        }
        try
        {
              d = Double.parseDouble(s) ;
        } catch(NumberFormatException a)
        {
            System.out.println("Not a dobule") ;
        } catch(NullPointerException n)
        {
            
        }
        if(i != 0)
        System.out.println("Its an integer") ;
        else
        if(d != 0.0)
        System.out.println("Its double") ;

        
    }
}