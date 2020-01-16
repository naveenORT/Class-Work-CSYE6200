package inherit;

public class AltPowerMeasure extends PowerMeasure {

	public AltPowerMeasure() {
		System.out.println("AltPowerMeasure constructor called");
	}


	public double getResistivity()
	{
		
		//return (voltage/current)*2 ;
		return super.getResistivity()*2;
		
	}






}
