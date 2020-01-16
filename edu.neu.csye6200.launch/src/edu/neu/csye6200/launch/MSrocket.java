package edu.neu.csye6200.launch;
public class MSrocket extends Rocket   
	{
	private int stage_num;
	private double updated_mass;
	private double updated_thrust;
	static MSrocket build_list[] = new MSrocket[10];
	int flag = 3 ;

	 
	public MSrocket(String rocket_name, String manufacturer, double shuttle_mass, double fuel_load,
			double payload_weight, double engine_thrust) 
	{
		super(rocket_name, manufacturer, shuttle_mass, fuel_load, payload_weight, engine_thrust);
		this.setStage_num(3);
		this.setUpdated_mass(updated_mass);
		this.setUpdated_thrust(updated_thrust);
	}
				
	public static void buildrocket() 
	{	
		
		MSrocket m1 = new MSrocket("CHANDRAYAN","INDIA",562,230,97,5600);		
		//m1.updated_weight();
	//	m1.updated_thrust();
		build_list[0] = m1;
		
		MSrocket m2 = new MSrocket("VOYAGER","USA",623,205,85,4922);		
		m2.updated_weight();
		m2.updated_thrust();
		build_list[1] = m2;

		MSrocket m3 = new MSrocket("SPUTNIK","USSR",423,285,89,4978);	
		m3.updated_weight();
		m3.updated_thrust();
		build_list[2] = m3;

		MSrocket m4 = new MSrocket("YINGHUO","CHINA",456,245,90,5123);		
		m4.updated_weight();
		m4.updated_thrust();
		build_list[3] = m4;
		
		MSrocket m5 = new MSrocket("QUASSAM","ISRAEL",398,233,92,5060);		
		m5.updated_weight();
		m5.updated_thrust();
		build_list[4] = m5;
	
		MSrocket m6 = new MSrocket("XYX","AUSTRALIA",402,225,96,5123);		
		m6.updated_weight();
		m6.updated_thrust();
		build_list[5] = m6;
		
		MSrocket m7 = new MSrocket("APOLLO","USA",398,250,86,4800);		
		m7.updated_weight();
		m7.updated_thrust();
		build_list[6] = m7;
		
		MSrocket m8 = new MSrocket("MANGALYAN","INDIA",400,237,91,5250);		
		m8.updated_weight();
		m8.updated_thrust();
		build_list[7] = m8;
		
		MSrocket m9 = new MSrocket("APPLE","FRANCE",427,295,95,5123);		
		m9.updated_weight();
		m9.updated_thrust();
		build_list[8] = m9;
		
		MSrocket m10 = new MSrocket("GETLZ","GERMANY",419,235,96,4997);		
		m10.updated_weight();
		m10.updated_thrust();
		build_list[9] = m10;
		
		print(); 
	}

	public void setUpdated_mass(double updated_mass) {
		this.updated_mass = updated_mass;
	}
	public static void print()
	{	
		System.out.println("UPDATED DETAILS OF ROCKET AFTER DETACHING");
		for (int i = 0; i < build_list.length ; i++)
		{
			MSrocket rock_stage = build_list[i];			  // assigning the constructed details to object 'rok'
			System.out.println("\n"+ (i+1)+".)" + rock_stage);               
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
			
		}
	} 
	public int getStage_num() {
		return stage_num;
	}

	public void setStage_num(int stage_num) {
		this.stage_num = stage_num;
	}

	public double getUpdated_mass() {
		return updated_mass;
	}
	
	public double updated_weight()
	{
		if(flag > 0)
		{
			if(flag == 3)
			{
			setUpdated_mass(super.totalweight() - 100);	// using super to access parent class
			flag--;
			}
			if(flag == 2)
			{
			setUpdated_mass(getUpdated_mass() - 200);
			flag--;
			}
		
			if(flag == 1)
			{
			setUpdated_mass(getUpdated_mass() - 300);	
			}
		
		}				
		
		return getUpdated_mass();
	}
	
	public double getUpdated_thrust() {
		
		return updated_thrust;
	}

	public void setUpdated_thrust(double updated_thrust) {
		this.updated_thrust = updated_thrust;
	}

	public double updated_thrust()
	{
		if (stage_num == 2)
		{
			setUpdated_thrust(super.getEngine_thrust() - 2000);	  // using super to access parent class
		
		}	
		if (stage_num == 3)
		{
			setUpdated_thrust(super.getEngine_thrust() - 2500);		// using super to access parent class
		
		}
		if (stage_num == 4)
		{
			setUpdated_thrust(super.getEngine_thrust() - 3000);		// using super to access parent class
		
		}	
		return getUpdated_thrust();
	}
	
	public String toString() 
	{
			return ( "\n\n ROCKET SPECS \n ROCKET NAME = " + rocket_name + "\n MANUFACTURER = " + manufacturer +
					"\n SHUTTLE MASS = " + getShuttle_mass() + " Tonnes"  + "\n FUEL LOAD = " + getFuel_load() +" Tonnes" + "\n PAYLOAD WEIGHT = " + getPayload_weight() + " Tonnes" 
					+ "\n ENGINE THRUST = " + getEngine_thrust() + "N" + "\n TOTAL WEIGHT =" + getLaunchpad_mass() + " Tonnes"+ "\n No of STAGES= "+ getStage_num() + "\n WEIGHT AFTER DETACHING STAGE 3,2,1 ="  + getUpdated_mass() +"T"
					+ "\n UPDATED THRUST=" + getUpdated_thrust() +"N");      // formatter
	}
	
}
	
	