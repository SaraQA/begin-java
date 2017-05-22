/*
Create Class Student having name, address,marks
Throw exception if marks > 100 . Ask user to re-enter
If number of Student NRI's > 25 %, Change their address to India.
*/
import java.util.Scanner ;
class Student
{
    private String name ;
    private int marks ;
    private String address ;
    
    public void initialize(String n,int m , String a) throws Exception
    {
        Exception nameError = new Exception("The name is invalid") ;
        Exception markError = new Exception("The mark is invalid") ;
        
        if(n.isEmpty() )
			throw nameError ;
        if(m > 100)
			throw markError ;
        
        name = n ;
        marks = m ;
        address = a ;
        
    }
    
    public String getAddress()
    {
        return address ;
    }
    
     public void setAddress(String add) throws Exception
    {
        Exception addException = new Exception("Address is not India.") ;
        if(add.contains("India"))
        {
            
        }else
			throw addException ;
		
        address = add;
    }
    public void display()
    {
        System.out.println("The name is  : " +name) ;
        System.out.println("The marks is :" +marks) ;
        System.out.println("The address is : "+address) ;
    }
    
    public static void isInRange(Student[] stu) throws Exception
    {
        int no_in =0, no_nri=0 ;
        Exception addressError = new Exception("Too many NRI's") ;
        for(int i=0 ;i<stu.length ; i++)
        {
            if(stu[i].getAddress().contains("India"))
             no_in++ ;
            else
             no_nri++ ;
        }
        
        double total = (double)no_nri/stu.length * 100 ;
        if(total > 25)
        throw addressError ;
    }
    
}

class StudentXHandling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int count = 0;
        System.out.println("Enter number of Students") ;
        int number = sc.nextInt() ;
        Student[] s = new Student[number] ;
        
        
        for(int i=0; i<s.length ;)
        {
            count = 0;
            System.out.println("Enter name of Students") ;
            String stu_name = sc.next() ;
            
            System.out.println("Enter marks of Students") ;
            int stu_marks = sc.nextInt() ;
            
            System.out.println("Enter address of Students") ;
            String add = sc.next() ;
            
            s[i] = new Student() ;
			
            try {
				s[i].initialize(stu_name , stu_marks , add) ;
            } catch(Exception ex)
            {
                
                System.out.println(ex + " Re-enter") ;
                count++ ;
            }
            
            if(count == 0) {
				s[i].display() ;    
				i++ ;
            }
        }
        
        try {
			Student.isInRange(s) ;
        } catch (Exception ee)
        {
                     
            for(int j =0 ;j<s.length ; j++)
            {
                if(!(s[j].getAddress().contains("India")))
                {                    
                    System.out.println(ee + " Re-enter address of Student" +(j+1)) ;
                    String re_add = sc.next() ; 
                    try {
                        s[j].setAddress(re_add) ;
                    } catch(Exception p)
                        {
                            System.out.println(p + " Enter India") ;  
                            j--;
                            
                        }
                }
                
            }
            
            
        }
        
        for(int k=0 ; k<s.length ; k++)
        {
            s[k].display() ;
        }
        
               
    }
}
