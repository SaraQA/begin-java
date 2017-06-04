import java.util.Scanner ;

interface Shape
{
    public void area();   // by default public , abstract
    public void display() ;
}

class Triangle implements Shape
{
    private int side1 , side2 ;
    private double area ;
    public Triangle(int b , int h)
    {
        side1 = b ;
        side2 = h ;
    }
    
    public void area()
    {
        area = 0.5 * side2 *side1 ;
    }
    
   public void display()
    {
        System.out.println("Area of triangle : "+area) ;
    }
}

class Rectangle implements Shape
{
    private int one ;
    private int two ;
    private double area ;
    public Rectangle(int one , int two)
    {
       this.one = one ;
       this.two = two ;
    }
    
    public void area()
    {
        area = one * two ;
    }
    
    public void display()
    {
    System.out.println("Area of rectangle : "+area) ;

    }
}

class InterfaceCaller
{
    public static void main(String[] args)
    {

    Shape[] s = new Shape[2];  // creating array of references
    s[0] = new Triangle(2,4) ;
    s[0].area() ;
    s[0].display() ;
   // System.out.println("Area of triangle : " +answer) ;    
        
    s[1] = new Rectangle(4,4) ;
    s[1].area() ;
    s[1].display() ;

   // System.out.println("Area of rectangle : " +ans) ;    

    }
}