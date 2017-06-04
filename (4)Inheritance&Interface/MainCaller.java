import java.util.Scanner ;
class Person
{
    private String name ;
    protected int age ;
    
    public void initialize(String n , int a)
    {
        name = n ;
        age = a ;
    }
    
    public void display()
    {
        System.out.println("Name : " +name) ;
         System.out.println("Age : "+age) ;
    }
    
    
}

class Student extends Person
{
    private double marks[] ;
    private int no_subjects ;
    
    public void initializeMarks(int subj)
    {
        Scanner sc1 = new Scanner(System.in) ;
        marks = new double[subj] ; //   
        for(int i=0 ; i<marks.length ;i++)
        {
         
            System.out.println("Enter marks") ;
            marks[i] = sc1.nextInt() ;
        }
    }
    
    public void initialize(String n , int a , int subj)
    {
        no_subjects = subj ;
        initialize(n,a) ;
        initializeMarks(subj) ;
    }
    
    public void display()
    {
        super.display() ;
        System.out.println("Number of Subjects : "+no_subjects) ;
        for(double d : marks )
        {
            System.out.println(d) ;
        }
    }
    
    public double  getTotal() //
    {
        double total = 0 ;
        for(double x : marks)
        {
            total = total + x ;
        }
        return total ;
    }
    
    public boolean isAdult()
    {
        if(age>18)
            return true ;
        else
            return false ;
    }
}

class MainCaller
{
    public static void main(String[] args)
    {
        System.out.println("No.of student" );
        Scanner sc = new Scanner(System.in) ;
        int number = sc.nextInt() ;
        
        Student[] arr = new Student[number] ;
        
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = new Student() ;
            
            System.out.println("Enter name of Student") ;
            String s = sc.next() ;
            System.out.println("Enter age") ;
            int age = sc.nextInt() ;
            System.out.println("Enter no. of subjects") ;
            int no_subj = sc.nextInt() ;

            arr[i].initialize(s,age,no_subj) ;
            
            
        }
        int j ;
         double max = arr[0].getTotal() ;
         int studentMaxPos = 0;
        for(j = 0 ;j<arr.length ; j++)
        {
            if(arr[j].getTotal() > max)
            {
                studentMaxPos = j ;
                max = arr[j].getTotal() ;
                
            }
        }
        arr[studentMaxPos].display() ;
        if(arr[studentMaxPos].isAdult())
        System.out.println("Is an Adult") ;
        else
        System.out.println("Still a kid :P") ;
        
    }
}