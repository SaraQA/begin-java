// Insert a value
import java.util.Scanner ;
class InsertElement
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of elements") ;
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int a[] = new int[size] ;
        
        for(int i=0 ; i<a.length ; i++)
        {
            System.out.println("Enter element") ;
            Scanner sc1 = new Scanner(System.in) ;
            a[i] = sc1.nextInt() ;
        }
        
        for(int b : a)   
        {
            System.out.print(b + " ") ;
        }
        // take value
        System.out.println("Enter the value to be inserted") ;
           Scanner sc2 = new Scanner(System.in) ;
            int value = sc2.nextInt() ;
            
            // Take position
         System.out.println("Enter the position") ;
         Scanner sc3 = new Scanner(System.in) ;
         int position = sc3.nextInt() ;   
         
	int c[] = new int[a.length+1] ;
	int k ;
	   for( k=0 ; k<position-1; k++)
                {
                    c[k] = a[k] ;
                }
                //a = c ;
            c[k] = value ;   
				
        for(int i=k+1 ; i<c.length ;i++, k++)
		{
            c[i] = a[k] ;
		
         }
			 
         
           for(int b : c)   
        {
            System.out.print(b + " ") ;
        }
         
            
    }
}