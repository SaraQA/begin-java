import java.util.Scanner ;
interface Beverage
{
    public void setVolume(int vol) ;
    public int getVolume();
    public void printDetails() ;
}

interface Soda extends Beverage
{
    public void volumeOfCO2() ;
    
}

interface Juice extends Beverage
{
    
    public void setFruit(String fn) ;
    public String whichFruit() ;

}

class Pepsi implements Soda
{
    int volume ;
    public Pepsi(int vol)
    {
        setVolume(vol)   ;
    }
    
    public void setVolume(int vol)
    {
        volume = vol ;
    }
    
    public int getVolume()
    {
        return volume ;
    }
    
    public void volumeOfCO2()
    {
        System.out.println("Volume of CO2 : " +volume) ; //
    }
    
    public void printDetails()
    {
        System.out.println("Volume of CO2 : " +volume) ;
    }
}

class AppyFizz implements Soda,Juice
{
    int volume ;
    String fruitname ;
    public AppyFizz(String fruit)
    {
        setFruit(fruit) ;
    }
    public void setVolume(int vol)
    {
        volume = vol ;   
    }
    public int getVolume()
    {
        return volume ;
    }
    public void setFruit(String fn)
    {
        fruitname = fn ;
    }
    
    public void printDetails()
    {
       System.out.println("Contains fruit : " +fruitname) ;
       System.out.println("Volume of CO2 : " +getVolume() ) ;
    }
    public void volumeOfCO2()
    {
         
    }
     
    public String whichFruit()
    {
        return fruitname ; 
    }
}

class Maza implements Juice
{
    int volume ;
    String fruitname ;
    public Maza(String fruit)
    {
        setFruit(fruit) ;
    }
    public void setVolume(int vol)
    {
        volume = vol ;
    }
    public int getVolume()
    {
        return volume ;
    }
    public void printDetails()
    {
        System.out.println("Contains fruit : " +fruitname) ;
        System.out.println("Volume : " +getVolume() ) ;
    }
    public void setFruit(String fn)
    {
        fruitname = fn ;
    }
    public String whichFruit()
    {
        return fruitname ;
    }
    
}

class BeverageCaller
{
    public static void main(String[] args)
    {
        int answer = 0 ;
        Beverage[] b = new Beverage[10] ;
        int i = 0;
        do
        {
           System.out.println("What you wanna store") ;
           System.out.println("1. Pepsi 2.AppyFizz 3. Maza") ;
           Scanner sc = new Scanner(System.in) ;
           int option = sc.nextInt() ;
           
           switch(option)
           {
               case 1 :
                       b[i] = new Pepsi(500) ; 
                       //b[i].printDetails();
                       break ;
                case 2 :
                        b[i] = new AppyFizz("Apple")  ;
                        b[i].setVolume(300) ;
                       
                        //b[i].printDetails() ;
                        break ;
                case 3 :
                        b[i] = new Maza("Mango") ;
                        b[i].setVolume(200) ;
                        //b[i].printDetails() ;
                        break ;
           }
           
           System.out.println("Do you want to continue ? 1. Yes   2. No") ;
		   answer = sc.nextInt() ;
		   i++ ;
        }while(answer == 1) ;
        
        for(int j = 0 ; j<i ; j++) {
         b[j].printDetails();
         if(b[j] instanceof Pepsi)
         System.out.println("Object of pepsi") ;
         else if(b[j] instanceof AppyFizz)
         System.out.println("Object of AppyFizz") ;
         else if(b[j] instanceof Maza)
         System.out.println("Object of Maza") ;
          
        }
    }
}
