// Initialize a string and a word.Say whether the word is present in the string more than once.
import java.util.Scanner ;
class WordInString
{
	public static void main(String[] args)
	{
	    int count=0 ;
	    System.out.println("Enter string") ;
		Scanner sc = new Scanner(System.in) ;
		String s = sc.nextLine() ;
	    
	    System.out.println("Enter word") ;
	//	Scanner sc = new Scanner(System.in) ;
		String w = sc.next() ;
        
		String arr[] = s.split(" ") ;
		for(int i =0 ; i<arr.length ; i++)
		{
        boolean answer = arr[i].contains(w) ;
        if(answer)
        count++ ;
	    
		}
		if(count>1)
		System.out.println("The word is present more than once") ;	
		else if(count == 1)
		System.out.println("The word is present once" ) ;	
		else
		System.out.println("The word is not present " ) ;	
				
		
	}
}