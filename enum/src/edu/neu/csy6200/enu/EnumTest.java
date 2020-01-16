package edu.neu.csy6200.enu;
public class EnumTest {

	enum WeekDay {
		SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6) ;	
		private int value;
		WeekDay(int n) { value = n; }
		public void setValue (int value) { this.value = value;}
		public int getValue() { return value; }
	
	}
	
	private WeekDay currDay = WeekDay.SUNDAY;
	
	public EnumTest() {
		System.out.println("Current day is" + currDay + " ordinal "+ currDay.ordinal());

		//WeekDay days[] = WeekDay.values();
		
	for ( WeekDay d : WeekDay.values()) {
		System.out.println("Day is" + d + " ordinal" + d.ordinal()+ " value" + d.getValue());
	}}

	public static void main( String[] args)
	{
	EnumTest et = new EnumTest();
	}
	
}
