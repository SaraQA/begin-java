import java.lang.String ;
import java.util.Scanner ;
class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of string") ;
	//	Scanner sc = new Scanner(System.in) ;
	//	int value = sc.nextInt() ;
		String[] arr = new String[3] ;
		
	/*	for(int i=0 ; i< value ; i++)
		{
			System.out.println("Enter string") ;
			arr[i] = sc.nextLine() ;
			sc.hasNext() ;
		} */
		arr[0] = "Hello" ;
		arr[1] = "to" ;
		arr[2] = "Me" ;
		
		String s = arr[0] ;
		for(int i=1 ; i < 3 ; i++)
		{
			
			s = s.concat(arr[i]) ;
			
		}
		System.out.println(s) ;
		
	}
}