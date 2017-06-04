import java.util.Scanner ;
class ArrayInitializePrint
{
    public static void main(String[] args)
    {
System.out.println("Enter the length of array") ;
        Scanner sc = new Scanner(System.in) ;
       int size = sc.nextInt() ;
        int a[] = new int[size] ;
        int i;
        for(i=0 ; i<size ; i++)
        {
            System.out.println("Enter the element") ;
            Scanner sc1 = new Scanner(System.in);
            a[i] = sc1.nextInt() ;
        }
        
        System.out.println("The array is :" ) ;
        
        for(i=0 ; i<size ; i++)
        {
            System.out.print(a[i] + " ") ;
        }
        
        
        
    }
}