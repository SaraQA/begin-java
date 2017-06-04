class A
{
    double a ;
     A()
    {
        System.out.println("Default") ;
    }
    A(int x)
    {
        a = x ;
        System.out.println("Parameterized") ;

    }
    
    {
        System.out.println("Non static" +a) ;
    }
    
    static
    {
        System.out.println("static") ;
    }
    
    public String toString()
    {
        return a + " " ;
    }
}

class DemoStaticNonS
{
    static 
    {
        System.out.println("Demo") ;
    }
    
     public static void main(String[] args)
     {
         A x = new A() ;  
         A y = new A(1) ;
         A z = new A(2) ;
         
        System.out.println(x) ;
        System.out.println(y) ;
        System.out.println(z) ;
     }
}

/*
Demo
static
non-static 0.0
Default
non-static 0
Param
non-static 0.0
Param
0.0
1.0
2.0
*/