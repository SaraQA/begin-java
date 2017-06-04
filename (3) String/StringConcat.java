import java.lang.String ;
import java.util.Scanner ;
class StringConcat
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of string") ;
		Scanner sc = new Scanner(System.in) ;
		int value = sc.nextInt() ;
		String[] arr = new String[value] ;
		sc.nextLine();
		for(int i=0 ; i< value ; i++)
		{
			System.out.println("Enter string") ;
			arr[i] = sc.nextLine() ;
		} 
		/*arr[0] = "Hello" ;
		arr[1] = "to" ;
		arr[2] = "Me" ;*/
		
		String s = arr[0] ;
		for(int i=1 ; i < value ; i++)
		{
			
			s = s.concat(arr[i]) ;
			
		}
		System.out.println(s) ;
		
	}
}