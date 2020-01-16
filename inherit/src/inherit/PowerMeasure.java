package inherit;

public class PowerMeasure extends MeterA implements MeterI{

	protected double current = 1.0;
	protected double voltage = 12.0;
	
	public PowerMeasure() {
	 System.out.println("Power Measure Constructor Called");
		
	}

	public double getResistivity() {  //V = IR
		return (voltage / current);
	}

	@Override
	public double measure() {
		return voltage*current;
	}

	@Override
	public double calcProbeMeasure() {
		double pv = getProbeVal();
		System.out.print(getProbeVal());
		return current * pv;
	}
	
}
