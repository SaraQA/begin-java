import java.util.Vector ;
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

class VectorCaller
{
    public static void main(String[] args)
    {
        String s = new String("Hello") ;
        String m = new String("Yes") ;
        Vector v = new Vector() ;
        Complex c = new Complex(2,5) ;
        v.add(c) ;
        v.add(s) ;
        v.add(m) ;
        Object[] o = v.toArray() ;
        for(int i =0 ; i<o.length ;i++)
        {
        System.out.println(o[i]) ;
        }
    }
}