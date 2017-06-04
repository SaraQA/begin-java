import java.util.Vector ;
import java.util.Scanner ;
class WrapperExample2
{
    public static void main(String[] args)
    {
        int answer = 0;
        Vector v = new Vector() ;
        do
        {
            System.out.println("What you want to add? 1.Integer 2. Double") ;
           Scanner sc = new Scanner(System.in) ;
		   int option = sc.nextInt() ;
		   
		   switch(option)
		   {
		       case 1 :
		                System.out.println("Enter Integer") ;
                        int a = sc.nextInt() ;
                        Integer obj = new Integer(a) ;
                        v.add(obj) ;
                        break ;
                case 2 :
                        System.out.println("Enter Double") ;
                        double d = sc.nextDouble() ;
                        Double db = new Double(d) ;
                        v.add(db) ;
                        break ;
		   }
            
            System.out.println("Do you want to continue ? 1. Yes   2. No") ;
	    	answer = sc.nextInt() ;
        } while(answer == 1) ;
        
        for(int i =0 ; i< v.size() ;i++)
        {
            System.out.println(v.elementAt(i)) ;   
        }
    }
}