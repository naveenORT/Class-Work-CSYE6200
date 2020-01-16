package vehicle;

public class Vehicle {

	int passengers;
	double kpl;
	int fuelCap;
	String make;
	String model;
	String year;
	/**
	  *	Constructor(DEFAULT)
      */	
	public Vehicle() {
	    String year = "2019";
		String make	= "Unk.";
		String model = "-?-";
		passengers = 4;
		kpl = 20.5;
		fuelCap = 30;
	}
	/**
	  *	Constructor(DEFAULT)
     */
		
	public Vehicle(String year,String make, String model,int passengers, double kpl, int fuelCap) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.passengers = passengers;
		this.kpl = kpl;
		this.fuelCap = fuelCap;
	
	}
	public String toString() {
		return ("Vehicle[make=" + make + ",model=" + model +
				",passengers=" + passengers +
				",fuelCap=" + fuelCap +
				",kpl=" +kpl +"]");
	}

}
