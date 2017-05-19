/*
1. Filter employees based on specific Designation
2. Sort based on salary
3. Details of employee based on id
4. Change designation to MANAGER for salary >5000
5. Make designation to ex
*/

import java.util.Scanner ;
import java.lang.String ;
class Employee
{
   private String name ;
   private String designation ;
   private double salary ;
   private int id ;
   private static int count ;
   
   public void initialize(String nam, String desig, double sal)
   {
        name = nam ;
        designation = desig ;
        salary = sal ;
        id = 1199 + Employee.idcount() ;
   }
   
   public static int idcount()
   {
       count++ ;
       return count ;
   }
   
   public void display()
   {
       System.out.println("Employee Detail : ") ;
       System.out.println("ID : " +id) ;
       System.out.println("Name : " +name) ;
       System.out.println("Designation : " +designation) ;
       System.out.println("Salary : " +salary) ;
   }
   public String desig()
   {
        return designation ;
   }
   
   public void setDesig(String desig)
   {
       designation = desig ;
   }

   public double getSalary()
   {
	   return salary ;
   }
   
   public boolean filter(String desig)
   {
        if(desig().equals(desig))
        return true ;
        else
        return false ;
   }
   
   public static void exEmployee(Employee e[] , String prefix )
   {
       for(int i=0 ; i< e.length ; i++)
       {
            
            e[i].setDesig( prefix+ "-" +e[i].desig()) ;
            
       }
   }
   
    public static void printEmployees(Employee e[] )
   {
       for(int i=0 ; i< e.length ; i++)
       {
            
            e[i].display();
            
       }
   }
   
   public static void toSort(Employee e[])
   {
	   Employee temp ;
       double min = e[0].salary ;
	   for(int i=0 ; i< e.length ; i++)
       {
		   for(int j=0 ; j<e.length-1 ;j++)
		   {
				if( e[j].salary > e[j+1].salary )
				{
					temp = e[j+1] ;
					 e[j+1] = e[j] ;
					e[j] = temp ;
				}
		   }
       }
	   
   }
   
   public static void getDetail(Employee e[] , int e_id)
   {
	   for(int i=0 ; i<e.length ; i++)
	   {
		   if(e[i].id == e_id )
			   e[i].display() ;
		   
	   }
   }
   
	public static void changeDesignation(Employee e , String changeTo)
	{
		e.setDesig(changeTo) ;
		e.display() ;
	}
}

class EmployeeCaller
{
    public static void main(String[] args)
    {
        System.out.println("Enter number of employees") ;
        Scanner sc = new Scanner(System.in) ;
        int number = sc.nextInt() ;
        
        Employee[] arr = new Employee[number] ;
        
        for(int i =0 ; i<number ; i++)
        {
            sc.nextLine() ;
            arr[i] = new Employee() ;
            System.out.println("Enter name of employee") ;
            String e_name = sc.nextLine() ;
            
            System.out.println("Enter designation of employee") ;
            String e_desig = sc.nextLine() ;
            
            System.out.println("Enter salary of employee") ;
            double e_sal = sc.nextDouble() ;
            
            arr[i].initialize(e_name, e_desig, e_sal) ;
            arr[i].display() ;
        }
        int answer = 0;
        do
        {
            System.out.println("Choose from the Menu") ;
            System.out.println("1. Filter employees based on specific Designation") ;
            System.out.println("2. Sort based on salary") ;
            System.out.println("3. Details of employee based on id") ;
            System.out.println("4. Change designation to MANAGER for salary >5000") ;
			System.out.println("5. Make ex") ;
             
			int option = sc.nextInt() ;
			
			switch(option)
			{
			    case 1 : 
			            System.out.println("Enter Designation") ;
			            String d =sc.next() ;
			            for(int i=0 ; i<number ; i++)
			            {
			                 if( arr[i].filter(d))
			                  arr[i].display();
			                 
			            }
						break ;
						
				case 2 : 
						Employee.toSort(arr) ;
						Employee.printEmployees(arr) ;
						break ;
						
				case 3 :
						System.out.println("Enter the id for Employee detail") ;
						int id = sc.nextInt() ;
						Employee.getDetail(arr , id) ;
						break ;
						
				case 4 :
						for(int i =0 ;i<arr.length ; i++)
						{
							if(arr[i].getSalary() > 5000)
								Employee.changeDesignation(arr[i] , "Manager") ;
						}
						break ;
			    case 5 :
			            Employee.exEmployee(arr, "ex") ;
			            Employee.printEmployees(arr) ;
			            break ;
			}
            
            System.out.println("Do you want to continue ? 1. Yes   2. No") ;
			answer = sc.nextInt() ;
        } while(answer == 1) ;

        
    }
} 