import java.util.Scanner ;
class AddRowElements
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
		int sum = 0, i=0;
		for(int k = 0 ; k < row ; k++){
		    for(int b : a[k]){
		        sum = sum + b ;
		    }
		    int ref[] = new int[a[k].length+1] ;
		   
		    for( i=0 ; i<a[k].length  ; i++){
		        ref[i] = a[k][i] ;
		    }
		    ref[i] = sum ;
		    a[k] = ref ;
		    
		    sum = 0;
		}
		
				// Printing Matrix
		for(int k = 0 ; k<row ; k++){
		     for(int b : a[k])
			 System.out.print(b + " ") ;
			 System.out.print("\n") ;
		}
    }
}

		