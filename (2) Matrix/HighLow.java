import java.util.Scanner ;
class HighLow
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
				
		// Printing Matrix
		for(int k = 0 ; k<row ; k++){
		     for(int b : a[k])
			 System.out.print(b + " ") ;
			 System.out.print("\n") ;
		}
		
		int low_column = 0 , low_row= 0 , high_column = 0 , high_row = 0, counter=0 ;
		int high = a[0][0] ;
		int low = a[0][0] ;
		for(int k = 0 ; k<row ; k++){
		     for(int b : a[k]){
			 
			    if(b > high){
				high = b ;
				high_column = counter ;
				high_row = k ;
				
				}
				if(b < low){
				low = b ;
				low_column = counter ;
				low_row = k ;
				}
				counter++ ;
			 }
			 
			 counter = 0;
		}
         System.out.println("Larger Number is " +high ) ;
		  System.out.println("Row is " +high_row ) ;
		   System.out.println("Coulmn is " +high_column ) ;
		 System.out.println("Low is " +low ) ;	
		  System.out.println("Row is " +low_row ) ;
		   System.out.println("Coulmn is " +low_column ) ;
		 int ref[] = a[high_row];
		 a[high_row] = a[low_row] ;
		 a[low_row] = ref ;
		 
		  for(int k = 0 ; k<row ; k++){
				for(int b : a[k])
				System.out.print(b + " ") ;
				System.out.print("\n") ;
			}
		 
	}
}
		 