import java.util.Scanner ;
class EnhancedFor
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
        
        for(int b : a)   // same b ?
        {
            System.out.print(b) ;
        }
    }
}