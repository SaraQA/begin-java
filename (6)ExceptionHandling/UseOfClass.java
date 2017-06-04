import java.util.Vector;
import java.util.Scanner ;


class Person
{
	private String name ;
	private int age ;
	protected static Scanner sc = new Scanner(System.in);
	
	public Person(String name , int age)
	{
		this.name = name ;
		this.age = age ;
	}
	
	public String toString()
	{
		return "The name is : " +name + " \nThe age is : " +age ;
	}
}

class Student extends Person
{
	private int roll_no ;
	
	public Student(String n , int a, int roll)
	{
		super(n,a) ;
		roll_no = roll ;
	}
	
	public String toString()
	{
		return toString() + "\nThe roll_no is : " +roll_no ;
	}
}

class Teacher extends Person
{
	private String subject ;
	
	public Teacher(String n , int a,String sub)
	{
		super(n,a) ;
		subject = sub ;
	}
	
	public String toString()
	{
		return toString() + "\nThe subject is : " +subject ;
	}
}


class UseOfClass
{

	public static void main(String[] args)
    {
		 Scanner sc = new Scanner(System.in) ;
        int answer = 0;
        Vector<Person> v = new Vector<Person>() ;
		do
       {
           System.out.println("What you want to add? 1.Person 2. Student 3. Teacher") ;
         
		   int option = sc.nextInt() ;
		   
		   switch(option)
		   {
		        case 1 : 
		                System.out.println("Enter name of person") ; 
						String n = sc.next() ;
						System.out.println("Enter age of person") ; 
						int a = sc.nextInt() ;
						Person p = new Person(n,a) ;
		                v.add(p) ;
		                break ;
		        case 2 :
						System.out.println("Enter name of Student") ; 
						String n1 = sc.next() ;
						System.out.println("Enter age of Student") ; 
						int a1 = sc.nextInt() ;
		                System.out.println("Enter roll_no") ;
		                int r = sc.nextInt() ;
						Student stu = new Student(n1,a1,r) ;
		                v.add(stu) ;   
		                break ;
				case 3 :
						System.out.println("Enter name of Teacher") ; 
						String n2 = sc.next() ;
						System.out.println("Enter age of Teacher") ; 
						int a2 = sc.nextInt() ;
		                System.out.println("Enter subject") ;
		                String sub = sc.next() ;
						Teacher t = new Teacher(n2,a2,sub) ;
		                v.add(t) ;   
		                break ;
		                
		   }
			System.out.println("Do you want to continue ? 1. Yes   2. No") ;
			answer = sc.nextInt() ;
        }while(answer == 1) ;
		
		System.out.println("Enter object to be searched") ; 
		String obj = sc.next() ;
		
		int count = 0;
			if(obj.equals("Person"))
			{
				for(int i=0 ; i<v.size() ; i++)
				{
					if(v.elementAt(i).getClass().getName().equals("Person") )
					{
						count++ ;
					}
				}
				
			} else if(obj.equals("Student"))
				{
					for(int i=0 ; i<v.size() ; i++)
					{
						if(v.elementAt(i).getClass().getName().equals("Student") )
						{
							count++ ;
						}
					}
				} else if(obj.equals("Teacher"))
					{
						for(int i=0 ; i<v.size() ; i++)
						{
							if(v.elementAt(i).getClass().getName().equals("Teacher") )
							{
								count++ ;
							}
						}
					} else
						System.out.println("Doesnt exist");
			if(count != 0)
			System.out.println("The count of object " +obj+ " is equal to "+count);
		//	System.out.println(v.elementAt(0).getClass()) ; // output - class Person
			// thats why getClass.getName()
	}
	
		
}