import java.util.Scanner ;

abstract class Shape
{
    private int side1 ; 
    private int side2 ;
    
    Shape (int side1, int side2){
        //side1 = side1; It is going to consider it as parameter name
        this.side1 = side1;
        this.side2 = side2;
    }
    
    public void setSide1(int s1)
    {
        side1 = s1 ;
    }
    
    public int getSide1()
    {
        return side1 ;
    }
    
    public void setSide2(int s2)
    {
        side2 = s2 ;
    }
    
    public int getSide2()
    {
        return side2 ;
    }
    
    abstract public double area();
}

class Triangle extends Shape
{
    
    public Triangle(int b , int h)
    {
        super(b,h);
        //setSide1(b) ;
        //setSide2(h) ;
    }
    
    public double area()
    {
        return 0.5 * getSide2() * getSide1() ;
    }
}

class Rectangle extends Shape
{
    public Rectangle(int one , int two)
    {
        super(one,two) ;
        //setSide1(one) ;
        //setSide2(two) ;
    }
    
    public double area()
    {
        return getSide2() * getSide1() ;
    }
}

class AbstractCaller
{
    public static void main(String[] args)
    {

    Shape[] s = new Shape[2];  // creating array of references
    s[0] = new Triangle(2,4) ;
    double answer = s[0].area() ;
    System.out.println("Area of triangle : " +answer) ;    
        
    s[1] = new Rectangle(4,4) ;
    double ans = s[1].area() ;
    System.out.println("Area of rectangle : " +ans) ;    

    }
}