import java.util.Scanner ;
class SumAndAverage
{
    public static void main(String[] args)
    {
System.out.println("Enter the length of array") ;
        Scanner sc = new Scanner(System.in) ;
       int size = sc.nextInt() ;
        int a[] = new int[size] ;
        int i, sum= 0;
        for(i=0 ; i<size ; i++)
        {
            System.out.println("Enter the element") ;
            Scanner sc1 = new Scanner(System.in);
            a[i] = sc1.nextInt() ;
            sum = sum + a[i] ;
        }
        
         for(i=0 ; i<size ; i++)
        {
            System.out.print(a[i] + " ") ;
        }
      //  int len = a.length ;
        double average = (float)sum/a.length ;
        System.out.println("The sum is :" +sum ) ;
        System.out.println("The average is : " +average) ;
        
       
        
    }
}