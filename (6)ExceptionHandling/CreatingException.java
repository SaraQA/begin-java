import java.util.Scanner ;
class CreatingException
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in) ;
        int arr[] = new int[5] ;
        for(int i=0 ; i<arr.length ;i++)
        {
            System.out.println("enter element") ;
            arr[i] = sc.nextInt() ;
        }
        try {
        int total = checkArraySum(arr) ;
        } catch(Exception ex)
        {
            System.out.println("Odd value") ;
        }
    }
    
    public static int checkArraySum(int array[]) throws Exception
    {
        int sum = 0;
        Exception myX = new Exception("Odd sum") ;
        for(int i=0 ; i<array.length ; i++)
        {
            sum = sum + array[i] ;
        }
        if(sum/2 != 0)
           throw myX ;
           
        return sum ;   
    }
}