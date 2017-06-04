// Reverse a String
import java.lang.String ;
import java.util.Scanner ;
class RemoveStr
{
    public static void main(String[] args)
    {
        System.out.println("Enter String") ;
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        
         System.out.println("Enter other String") ;
        String x = sc.nextLine() ;
        int len = x.length() ;
        System.out.println(len) ;
        StringBuffer sb = new StringBuffer(s) ;
        int a = sb.indexOf(x) ;
        
        while(a != -1)
        {
        
       // System.out.println(a) ;
        
        sb.delete(a,a+len) ;
        a= sb.indexOf(x);
       
        }
        
        System.out.println(sb) ;
        
        
        
    }
}