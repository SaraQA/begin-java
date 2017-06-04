import java.util.Scanner ;
class Matrix
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of rows") ;
        Scanner sc= new Scanner(System.in) ;
        int row = sc.nextInt() ;
        int a[][] = new int[row][] ;
       
       for(int i=0 ; i<row ; i++)
       {
        System.out.println("Enter the number of values in row ") ;
         Scanner sc2= new Scanner(System.in) ;
        int value = sc2.nextInt() ;
        a[i] = new int [value];
        for(int j=0 ;j<value ; j++)
        {
             System.out.println("Enter the elements in row ") ;
            Scanner sc3= new Scanner(System.in) ;
            a[i][j] = sc3.nextInt() ;
        }
        
      
      
       }
       
           for(int i=0 ; i<row ; i++)
           {
               for(int j=0 ; j<a[i].length ; j++)
               {
                   System.out.print(a[i][j] + " ") ;
               }
               System.out.print("\n") ;
           }
         
       
        
    }
}