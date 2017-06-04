// Count the number of times string occurs in array of string
import java .lang.String;
import java.util.Scanner ;
class ArrayString
{
    public static void main(String[] args)
    {


    System.out.println("Enter the number of string") ;
     Scanner sc = new Scanner(System.in) ;
     int value = sc.nextInt() ;
    String[] arr = new String[value] ;
    //arr[0] = "The something" ;
   //arr[1] = "something" ;
   // arr[2] = "The again" ;
     
    for(int i=0 ; i<value ; i++) 
    {
         System.out.println("Enter string") ;
       arr[i] = sc.nextLine() ;
        sc.hasNext() ;
    }
    int count=0 ;
    String x = "all" ;
     for(int i=0 ; i<value ; i++) {
       boolean ans =  arr[i].equalsIgnoreCase(x) ;
   
       if(ans)
       count++ ;
     }
         System.out.println(count) ;
     
     //contentEquals
    for(int i=0 ; i<value ; i++) {
     boolean answer =  arr[i].startsWith("The") ;
     if(answer)
     System.out.println(arr[i]) ;
    }
	
	}
}
	