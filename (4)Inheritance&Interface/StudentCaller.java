import java.util.Scanner ;
class Person
{
    private String name ;
    private int age ;
    
    public int getAge()
    {
        return age ;
    }
    
    public String getName()
    {
        return name ;
    }
    
    public void initialize(String n , int a)
    {
        name = n ;
        age = a ;
    }
    
    public void display()
    {
        System.out.println("Name : " +name);
        System.out.println("Age : " +age) ;
    }
}

class Student extends Person
{
    private int standard ;
    
    public void initialize(String n, int a,int std)
    {
        standard = std ;
        initialize(n,a) ;
        
    }
    
    public void display()
    {
        super.display() ;
        System.out.println("Standard : " +standard) ;
    }
}

class StudentCaller
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter name") ;
        String s_name = sc.next() ;
        System.out.println("Enter age") ;
        int s_age = sc.nextInt() ;
        System.out.println("Enter Standard") ;
        int s_std = sc.nextInt() ;
        
        Student s = new Student() ;
        s.initialize(s_name,s_age,s_std) ;
        s.display() ;
    }
}