// Use of Vector . WIthout array
import java.util.Vector ;
import java.util.Scanner ;
class Complex
{
    private int real ;
    private int imaginary ;
    
    public Complex(int rl , int img)
    {
        imaginary = img ;
        real = rl ;
    }
    
    public String toString()
    {
        return real + " + i" + imaginary ;
    }
}

class VectorMenu
{
    public static void main(String[] args)
    {
        int answer = 0;
        Vector v = new Vector() ;
       do
       {
           System.out.println("What you want to add? 1.Complex 2. String") ;
           Scanner sc = new Scanner(System.in) ;
		   int option = sc.nextInt() ;
		   
		   switch(option)
		   {
		        case 1 : 
		                 Complex c = new Complex(2,3) ;
		                 v.add(c) ;
		                 break ;
		        case 2 :
		                System.out.println("Enter String") ;
		                String s = sc.next() ;
		                v.add(s) ;   
		                break ;
		                
		   }
		   System.out.println("Do you want to continue ? 1. Yes   2. No") ;
		answer = sc.nextInt() ;
       }while(answer == 1) ;
       
       
       for(int i =0 ; i< v.size() ;i++)
       {
           if(v.elementAt(i) instanceof String)
           {
               
               System.out.println(((String)v.elementAt(i)).length()) ; // type cast object to string
           }
       }
    }
}