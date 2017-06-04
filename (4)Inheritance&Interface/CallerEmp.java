import java.util.Scanner ;
class Employee
{
    private String name ;
    private double salary ;
    private String designation ;
    // Default
    public Employee()
    {
        name = "XYZ" ;
        salary = 1200 ;
        designation = "Staff" ;
        
    }
    // Parameterized
    public Employee(String n , double sal , String desig )
    {
        name = n ;
        salary = sal ;
        designation = desig ;
        
    }
    // Copy
    public Employee(Employee e)
    {
       name = e.name ;
       salary = e.salary ;
       designation = "ex"+e.designation ;
    }
    
    public void display()
    {
        System.out.println("Employee name : " +name) ;
        System.out.println("Salary : " +salary) ;
        System.out.println("Designation : " +designation) ;
    }
}

class CallerEmp
{
    public static void main(String[] args)
    {
        int answer = 0;
        Employee a = null , b = null ;
        do
        {
        System.out.println("Choose") ;
        System.out.println("1. Default 2. Parameterized 3. Copy") ;
        Scanner sc = new Scanner(System.in) ;
        int number = sc.nextInt() ;
        
        switch(number)
        {
            case 1 : 
                    a = new Employee() ;
                    a.display() ;
                    break ;
            case 2 :
                    System.out.println("Enter name of Employee ") ;
                    String name = sc.next() ;
                    System.out.println("Enter salary ") ;
                    int sal = sc.nextInt() ;  
                    System.out.println("Enter Designation") ;
                    String de = sc.next() ;
                     b = new Employee(name , sal , de) ;
                    b.display() ;
                    break ;
            case 3 :
                    System.out.println("Which object is to be copied 1. Default 2.Param") ;
                    int ans = sc.nextInt() ;
                    if(answer == 1)
                    {
                    Employee c = new Employee(a) ;
                    c.display() ;
                    }
                    else
                    {
                    Employee d = new Employee(b) ;
                    d.display() ;
                    }
        }
        
         System.out.println("Do you want to continue ? 1. Yes 2. No") ;
          answer = sc.nextInt() ;
        }while(answer == 1) ;
         
    }
}