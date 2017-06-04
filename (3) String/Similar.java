import java .lang.String;
class Similar
{
    public static void main(String[] args)
    {
    String a = new String("Hello") ;
    String b = new String("hello") ;
    
    boolean answer = a.equals(b) ;
    if(answer == true)
    System.out.println("its same") ;
    
    int ans = a.compareToIgnoreCase(b) ;
    System.out.println(ans) ;
    if(ans == 0)
    System.out.println("its same") ;
    else if(ans < 0)
    System.out.println(a + " is alphabetically before " +b) ;
    else if(ans > 0)
     System.out.println(b + " is alphabetically before " +a ) ;
    }
}