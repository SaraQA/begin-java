// Delete element from array. (Multiple)
import java.util.Scanner ;
class DeleteElement
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
        
        System.out.println("Enter the number to be deleted") ;
        Scanner sc2 = new Scanner(System.in) ;
        int number = sc2.nextInt() ;
        
        for(int i = 0 ; i<a.length ; i++)
        {
            if(a[i] == number)
            {
                int temp = a[i] ;
                for(int j=i ; j<a.length-1 ; j++)
                a[j] = a[j+1] ;
                i = i - 1 ;
                // a.length-- ;    // You cannot change this.
                // One way is create other array c of smaller size and point a to c.
                int c[] = new int[a.length-1] ;
                for(int k=0 ; k<c.length ; k++)
                {
                    c[k] = a[k] ;
                }
                a = c ;
            }
        }
        
        
        for(int b : a)   
        {
            System.out.print(b + " ") ;
        }
    }
}