// 1) Find no of characters which are digits 2) Capitalize first letter of every word
import java.lang.String ;
import java.lang.Character ;
import java.util.Scanner ;
class CharStr
{
    public static void main(String[] args)
    {
        System.out.println("Enter String") ;
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        int count =0 ;
        char[] arr = s.toCharArray() ;
        for(int i=0 ;i<arr.length ; i++)
        {
            boolean ans = Character.isDigit(arr[i]) ;
            if(ans)
            count++ ;
            if(i == 0)
            arr[i] = Character.toUpperCase(arr[i]) ;
            
            if(Character.isWhitespace(arr[i]))
            {
                arr[i+1] = Character.toUpperCase(arr[i+1]) ;
            }
        }
        System.out.println(count) ;
        String x = new String(arr) ;
        System.out.println(arr) ;
        
        
        
        
    }
}