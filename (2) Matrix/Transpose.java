// Transpose of a matrix
import java.util.Scanner ;
class HelloWorld
{
    public static void main(String args[])
    { 
        System.out.println("Enter the number of rows") ;
        Scanner sc= new Scanner(System.in) ;
        int row = sc.nextInt() ;
        int a[][] = new int[row][] ;
		
		// Initializing
		for(int i=0 ; i<row ; i++)
		{
		System.out.println("Enter the number of elements in a row") ;
		Scanner sc1 = new Scanner(System.in) ;
        int value = sc1.nextInt() ;
		 a[i] = new int[value]  ;
		
			for(int j=0 ; j<row ; j++)
			{
			System.out.println("Enter the element") ;
			Scanner sc2= new Scanner(System.in) ;
				a[i][j] = sc2.nextInt() ;
			}
			
		}
		
	     int ref[][] = new int[row][row] ;
		 
		for(int k=0 ; k< row ; k++){
		      
			for( int i=0 ; i<a[k].length ; i++ ) {
			  
			   ref[k][i] = a[i][k] ;
			   
			} 
			
		}
		a = ref ;
				// Printing Matrix
		for(int k = 0 ; k<row ; k++){
		     for(int b : a)
			 System.out.print(b + " ") ;
			 System.out.print("\n") ;
		}
		
	}
}








