import java .lang.String;
class StoreCharInString
{
    public static void main(String[] args)
    {
    String a = new String("Hello") ;
   // String b = new String("hello") ;
    int len = a.length() ;
    for(int i=0 ; i<=len-1 ; i++)
    {
        char x  = a.charAt (i) ;
        char z = (char)(x + 1 );
       
        
    }
    
    char[] arr = a.toCharArray() ;
    for(int i=0 ; i< a.length() ; i++)
    {
        char z = (char)(arr[i] +1) ;
          //    System.out.println(z) ;
      //  System.out.println(arr[i]) ;
         String s = String.valueOf(z) ;
    System.out.print(s) ;
    }
 
    
   
    
    }
    
}