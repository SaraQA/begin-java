import java.util.Scanner ;
class BubbleSort
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
        System.out.print("\n") ;
        
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=0 ; j<a.length-1 ; j++)
            {
                if(a[j] > a[j+1])
                {
                   int  temp = a[j] ;
                   a[j] = a[j+1] ;
                   a[j+1] = temp ;
                }
            }
        }
        
        for(int b : a)   
        {
            System.out.print(b + " ") ;
        }
    }
}