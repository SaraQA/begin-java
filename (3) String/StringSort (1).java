// Sort alphabetically
import java.lang.String ;
import java.util.Scanner ;
class StringSort
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
		String temp ;
		
		for(int i=0 ; i< value-1 ; i++) //
		{
		    for(int j=0 ; j<value-1 ;j++)
		    {
		          int answer = arr[j].compareToIgnoreCase(arr[j+1]) ;
		          if(answer > 0)
		          {
		              temp = arr[j] ;
		              arr[j] = arr[j+1] ;
		              arr[j+1] = temp ;
		          }
		          
		    }
		}
		
		for(int i = 0 ;i<value ; i++)
		{
		    System.out.println(arr[i]) ;
		}
		
	}
}