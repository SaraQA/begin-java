/*
1. Sort in ascending
2. Find the distance objects whose total distance is more than a certain value
3. Change the km of the distance objects whose total distance is more than 1000 to 1
4. Add the minimum and the maximum distance object
*/
import java.util.Scanner ;
class Distance
{
	private int km ;
	private int m ;

	public void initialize(int metre , int kilom)
	{
		m = metre ;
		km = kilom ;
	}

	public void display()
	{
        System.out.println("The distance is "+ m + " metre and " + km + " kilometre") ;
	}
	
	public int add()
	{
		int total = m*1000 + km ;
		return total ;
	}

	public Distance compareMax(Distance dist)
	{
		if(add() > dist.add())
			return this ;
		else 
			return dist ;
	}
	
	public Distance compareMin(Distance dist)
	{
		if(add() < dist.add())
			return this ;
		else 
			return dist ;
	}

}

class DistanceCaller
{
	public static void main(String[] args)
	{
	   	System.out.println("Enter the number of Distances") ;
		Scanner sc= new Scanner(System.in) ;
                int number = sc.nextInt() ;
		Distance d[] = new Distance[number] ;
		int kilom ;
			for(int i=0 ; i<number ; i++) {
				d[i] = new Distance() ;
				System.out.println("Enter the distance in m") ;
				Scanner sc1 = new Scanner(System.in) ;
				int metre = sc1.nextInt() ;
				System.out.println("Enter the distance in km") ;
				Scanner sc2 = new Scanner(System.in) ;
				kilom = sc2.nextInt() ;
				d[i].initialize(metre , kilom) ;
				d[i].display() ;
				int t =	d[i].add() ;
				System.out.println("Total distance : "+t) ;
			}
			int answer = 1 ;
			do
			{
				System.out.println("Choose from the Menu : ") ;
				System.out.println("1. Sort in ascending ") ;
				System.out.println("2. Find the distance objects whose total distance is more than a certain value ") ;
				System.out.println("3. Change the km of the distance objects whose total distance is more than 1000 to 1 ") ;
				System.out.println("4. Add the minimum and the maximum distance object ") ;
				Scanner sc3 = new Scanner(System.in) ;
				int option = sc3.nextInt() ;
				
				switch(option)
				{
					case 1 : 
							Distance temp ;
							for( int i = 0 ; i < number-1 ; i++ ) {
								for( int k = 0 ; k < number-1 ; k++ ) {
									if( d[k].add() > d[k+1].add() ) {
											temp = d[k] ;
											d[k] = d[k+1] ;
											d[k+1] = temp ;
									}
								}
								
							}
							for(int i=0 ; i<number ; i++) {
								d[i].display() ;
							}
							break ;
					
					case 2 :
							System.out.println("Enter the target distance to get details of distances above it") ;
							Scanner sc5 = new Scanner(System.in) ;
							int distance = sc5.nextInt() ;
							System.out.println("The distances above " +distance+ " are : ") ;
							for(int k = 0 ; k < number ;k++ ) {
								if(d[k].add() > distance )
									d[k].display() ;
							}
							break ;
							
					case 3 :
							for(int k = 0 ; k < number ;k++ ) {
								if(d[k].add() > 1000 ) 
								d[k].initialize(1,0 );
								d[k].display() ;
							}
							break ;
					
					case 4 : 
							Distance max = d[0] ;
							Distance min = d[0] ;
							for(int k = 0 ; k < number ;k++ ) {
							max = max.compareMax(d[k]) ;
							min = min.compareMin(d[k]) ;
							}
							int total_value = min.add() + max.add() ;
							System.out.println("addition of min and max distance is : " +total_value) ;
							
				}
				
				System.out.println("Do you want to continue ? 1. Yes   2. No") ;
				Scanner sc4 = new Scanner(System.in) ;
				answer = sc4.nextInt() ;
				
			} while(answer == 1) ;
		
	}
}
