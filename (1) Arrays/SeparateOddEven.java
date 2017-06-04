// Initialize an arrray and separate them into 2 arrays , odd values and even
import java.util.Scanner ;
class SeparateOddEven
{
    public static void main(String[] args)
    {
        System.out.println("Enter the length of array") ;
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int a[] = new int[size] ;
       // int b[] = new int[size] ;
       // int c[] = new int [size] ;
        int i ,x = 0,m = 0;
        int k = 0 , j = 0 ;
        for(i=0 ; i<size ; i++)
        {
            System.out.println("Enter the element") ;
            Scanner sc1 = new Scanner(System.in);
            a[i] = sc1.nextInt() ;
            
        }
        
           for(i=0 ; i<a.length ; i++)
        {
            
            if(a[i]%2 == 0) {
            x++ ;
            }
        }
        m = a.length - x ;
        int b[] = new int[x] ;
        int c[] = new int[m] ;
        //System.out.println(b.length) ;
        
        for(i=0 ; i<a.length ; i++)
        {
            
            if(a[i]%2 == 0) {
            b[k] = a[i] ;
            k++ ;
            }
            else {
            c[j] = a[i] ;
            j++ ;
            }
        }
        
        System.out.println("The even array is :") ;
        for(i = 0 ; i<b.length ; i++)
        {
            System.out.print(b[i] + " ") ;
            
        }
        System.out.print("\n") ;
        System.out.println("The odd array is :") ;
        for(i = 0 ; i<c.length ; i++)
        {
            System.out.print(c[i] + " ") ;
        }
    }
}
