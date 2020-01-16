
package vehicle;
/**
 *	Constructor
 */	
public class Vehicletest {

	Vehicle carList[]; //define array
	
	/**
	 *	Constructor
	 */	
	

	/**
	 *	Constructor
	 */	

	
	
	public Vehicletest() {
		Vehicle car1 = new Vehicle("1995","Ford","F150" ,4, 20.0, 40);
		Vehicle car2 = new Vehicle("2001","Volvo","XC70" ,5, 22.0, 30);
		
		System.out.println("Car1 is"+ car1);
		System.out.println("Car1 is"+ car2);
	
		car1.passengers = 21;
		//car1 = car2;
		
		System.out.println("Car1 is"+ car1);
		System.out.println("Car1 is"+ car2);
	
		// A list that is 10 items long
	}
	
	public void loadsampleCars()
	{
		
	}	
	
		
		public void printCarList()
		{
		System.out.println("Year     Make       Model");
		for (int i=0; i < carList.length; i++)
		{
			Vehicle veh = carList[i];
			
			System.out.println(veh);
		}
		}
	

		public void printCarListshort()
		{
		System.out.println("Year     Make       Model");
		for (int i=0; i < carList.length; i++)
		{
			Vehicle veh = carList[i];
			
			System.out.println(veh);
		}
		}

		public void runStrTests() {
			String quote = "The universe is full of stars";
		
			int len = quote.length();
			int starIndex = quote.indexOf("star");
		
		
		
		}
		
		
		
		
		public static void main(String[] args) {
			Vehicletest Vehicletest = new Vehicletest();
				
		}

}
