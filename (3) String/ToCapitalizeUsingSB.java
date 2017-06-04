// 1) Find no of characters which are digits 2) Capitalize first letter of every word (using Stringbuffer class)
import java.lang.String ;
import java.lang.Character ;
import java.util.Scanner ;
class ToCapitalizeSB
{
    public static void main(String[] args)
    {
        System.out.println("Enter String") ;
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        int count = 0 ;
		StringBuffer sb = new StringBuffer(s) ;
		
	for(int i=0 ; i<sb.length() ;i++)
	{
		
	   char x = sb.charAt(i) ;
	   
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0))) ;	
	   
	   if(Character.isDigit(x)) 
	   count++ ;
	   boolean ans = Character.isWhitespace(x) ;
	   if(ans)
	   {
	   sb.setCharAt(i+1 , Character.toUpperCase(sb.charAt(i+1))) ;
	   
	   }
	}
     System.out.println(count) ;   
	 
	     System.out.println(sb) ;   
		
        
    }
}