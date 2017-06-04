class ThrowDemo
{
    public static void main(String[] args)
    {
        int z = 1 ,x=7 ,y=1 ;
        System.out.println("Before") ;
        try{
            z = fun(x,y) ;
            System.out.println("After") ;

        } catch(ArithmeticException e)
        {
            System.out.println("error" + e) ;
        }
        System.out.println("End " + z) ;
    }
        
        public static int fun(int a , int b) throws ArithmeticException
        {
            int c = 0;
            System.out.println("In") ;
            try{
                c =a/b ;
            } catch(ArithmeticException e)
            {
                throw e ; // throw means he isn't able to handle i.e outer lines not to be exceuted
            }
            System.out.println("Out") ;
            return c ;
        }
    
}