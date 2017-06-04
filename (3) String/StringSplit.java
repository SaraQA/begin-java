import java.lang.String ;
import java.util.Scanner ;
class StringSplit
{
	public static void main(String[] args)
	{
	    	System.out.println("Enter the string") ;
		Scanner sc = new Scanner(System.in) ;
		String s = sc.nextLine() ;
		String arr[] = s.split(" ") ;
		
		for(int i=0 ; i< arr.length ; i++)
		{
		    
		    System.out.println(arr[i] +" " + arr[i].length() );
		}
		
	}
}