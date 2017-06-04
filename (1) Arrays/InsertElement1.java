// Insert a value
import java.util.Scanner ;
class InsertElement1
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
	
	   for(int k=0 ; k<a.length ; k++)
                {
                    c[k] = a[k] ;
                }
                a = c ;
				
        for(int i=position-1 ; i<c.length ;i++)
		{
            int temp = a[i] ;
			 a[i] = value ;
			 value = temp ;
		
         }
			 
         
           for(int b : a)   
        {
            System.out.print(b + " ") ;
        }
         
            
    }
}