// Reverse a String
import java.lang.String ;
import java.util.Scanner ;
class ReverseStr
{
    public static void main(String[] args)
    {
        System.out.println("Enter String") ;
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        
        StringBuffer sb = new StringBuffer(s) ;
       StringBuffer x = sb.reverse() ;
       System.out.println(x) ;
    }
}