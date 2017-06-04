import java.lang.String ;
import java.util.Scanner ;
class WordInString
{
	public static void main(String[] args)
	{
	    	System.out.println("Enter the string") ;
		Scanner sc = new Scanner(System.in) ;
		String s = sc.nextLine() ;
		
			System.out.println("Enter word") ;
			String word = sc.nextLine() ;
			
			//String arr[] = s.split(" ") ;
		
		if(s.contains(word))
		
		System.out.println("Its there") ;
		
		
	}
}