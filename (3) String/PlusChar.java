import java .lang.String;
class PlusChar
{
    public static void main(String[] args)
    {
    String a = new String("Hello") ;
   // String b = new String("hello") ;
    int len = a.length() ;
    for(int i=0 ; i<=len-1 ; i++)
    {
        char x  = a.charAt(i) ;
        char z = (char)(x + 1 );
        System.out.println(z) ;
    }
    
    }
    
}