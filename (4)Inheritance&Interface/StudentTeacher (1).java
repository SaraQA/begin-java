import java.util.Scanner ;
class Person
{
    private int age ;
	private String name ;
	
	public Person()
	{
	    age = 15 ;
	    
	}
	
	public void initialize()
	{
	    Scanner sc1 = new Scanner(System.in) ;
        System.out.println("Enter name") ;
        String n = sc1.next() ;
		name = n ;
		System.out.println("Enter age") ;
		int a = sc1.nextInt() ;
		age = a ;
	}
	
	 public String toString()
    {
        return name + " " + age ;
    }
}

class Student extends Person
{
    private int standard ;
    
    public Student()
    {
        standard = 1 ;
    }
    
    public void initialize()
    {
        Scanner sc2 = new Scanner(System.in) ;
        super.initialize() ;
        System.out.println("Enter standard") ;
		int std = sc2.nextInt() ;
        standard = std ;
    }
    
    public String toString()
    {
        
        return super.toString() + " " + standard ;
        
    }
    
    
}

class Teacher extends Person
{
    private String designation ;
    
    public Teacher()
    {
        
    }
    
    public Teacher(String d)
    {
        designation =d ;
    }
    
    public void initialize()
    {
        super.initialize() ;
        	System.out.println("Enter designtion") ;
        Scanner sc3 = new Scanner(System.in) ;
        String desig = sc3.next() ;
        designation = desig ;
    }
    
     public String toString()
    {
        
        return super.toString() + " " + designation ;
        
    }
}

class StudentTeacher
{
    public static void main(String[] args)
    {
        int answer = 0 ;
        Student stu =null ;
        Teacher t = null ;
        do
        {
            System.out.println("Choose option") ;
            Scanner sc = new Scanner(System.in) ;
            int option = sc.nextInt() ;
           
            switch(option)
            {
                
                case 1 :
                         stu = new Student() ;
                        
                        break ;
                case 2 :
                         t = new Teacher() ;
                       
                        break ;
                case 3 :
                         t = new Teacher("Jr. Teacher") ;
                        break ;
                case 5 :
                        if(t != null)
                        {
                        t.initialize() ;
                        System.out.println(t) ;
                        }else
                        System.out.println("Teacher not initialzied") ;
                        break ;
                case 4 :
                        if(stu != null)
                        {
                            stu.initialize() ;
                        System.out.println(stu) ;
                        }else
                        System.out.println("Student not initialzied") ;
                        break ;

                        
                        
            }
            System.out.println("Do you want to continue ? 1. Yes   2. No") ;
			answer = sc.nextInt() ;
        }while(answer == 1) ;
    }
}