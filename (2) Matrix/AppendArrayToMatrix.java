import java.util.Scanner ;
class AppendArrayToMatrix
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
		
			for(int j=0 ; j<value ; j++)
			{
			System.out.println("Enter the element") ;
			Scanner sc2= new Scanner(System.in) ;
				a[i][j] = sc2.nextInt() ;
			}
			
		}
	
		System.out.println("Enter the number of elements in an array") ;
		Scanner sc3 = new Scanner(System.in) ;
        int size = sc3.nextInt() ;
        int array[] = new int[size] ;
		for(int i=0 ; i<size ; i++){
		System.out.println("Enter the element") ;
		Scanner sc4 = new Scanner(System.in) ;
        array[i] = sc4.nextInt() ;
		}
		
		int k = 0;
		int b[][] = new int[row+1][] ;
		for(k = 0 ; k<row ; k++ ){
		    for(int c : a[k])
		    b[k] =a[k] ;
		}
		b[k] = array ;
		a = b ;
       
       // Printing Matrix
		for( k = 0 ; k<a.length ; k++){
		     for(int c : a[k])
			 System.out.print(c + " ") ;
			 System.out.print("\n") ;
		}
    }
}