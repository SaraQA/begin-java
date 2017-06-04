// Swap consecutive elements
import java.util.Scanner ;
class SwapElements
{
    public static void main(String[] args)
    {
        System.out.println("Enter the length of array") ;
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int a[] = new int[size] ;
        int i ;
        for(i=0 ; i<size ; i++)
        {
            System.out.println("Enter the element") ;
            Scanner sc1 = new Scanner(System.in);
            a[i] = sc1.nextInt() ;
            
        }
        
        for(i=0 ; i< a.length-1 ; i=i+2)
        {
           int temp = a[i] ;
            a[i] = a[i+1] ;
            a[i+1] = temp ;
        }
        
        System.out.println("The array is :" ) ;
        
        for(i=0 ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ") ;
        }
        
    }
}
