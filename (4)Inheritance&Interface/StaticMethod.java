class Rectangle
{
    private int length ;
    private int breadth ;
    private int id  ;
	private static int count = 0 ;
    
    public void initialize(int l , int b)
    {
	    id = 1000 + Rectangle.Count() ; 
        length = l ;
        breadth = b ;
    }
    
	public static int Count() 
	{
	   count++ ; 
	   return count ;
	}
	
    public void display()
    {
        System.out.println("Rectangle id : " + id) ;
       System.out.println("Length is : " +length + "  Breadth is : " + breadth) ;
         
    }
    
}

class HelloWorld
{
    public static void main(String [] args)
    {
        Rectangle rc = new Rectangle() ;
        rc.initialize(5,5) ;
        rc.display() ;
		
        
        Rectangle rc1 = new Rectangle() ;
        rc1.initialize(2,2) ;
         rc1.display() ;
         
     
		 Rectangle rc2 = new Rectangle() ;
        rc2.initialize(3,3) ;
         rc2.display() ;
         		
        
    }
} 