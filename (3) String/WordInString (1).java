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
		else
		    System.out.println("Its not there") ;
		
		int number = s.indexOf(word) ;
		System.out.println(number) ;
		
		if(number != -1)
		    System.out.println("Its there") ;
		else
		    System.out.println("Its not there") ;
	}
}