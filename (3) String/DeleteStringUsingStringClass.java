// Initialize one string. Then other whose occurence is to be removed.
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
		                
        String arr[] = s.split(x) ;
		
        System.out.println(arr) ;
        
        
        
    }
}