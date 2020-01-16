package edu.neu.csye6200.launch;
import java.io.IOException;

public class Simulation {
	
	MSrocket r1 = MSrocket.build_list[0];
	MSrocket r2 = MSrocket.build_list[1];
	MSrocket r3 = MSrocket.build_list[2];
	MSrocket r4 = MSrocket.build_list[3];
	MSrocket r5 = MSrocket.build_list[4];
	
	double burn_rate;
	double acceleration_gravity = 9.38;
	double rocket_height = 0;
	double updated_fuel_level;
	int time;
	double rocket_acceleration;
	char x;
	boolean done = false;
	public Simulation() throws IOException 
	
	{
		System.out.println("\n\n ENTER A ROCKET TO SIMULATE" + "\n ROCKET 1 " + "\n ROCKET 2 "+ "\n ROCKET 3" +"\n ROCKET 4 " + "\n ROCKET 5 ");
		
		
		x = (char)System.in.read();
		
		switch (x)
		{
		 	case '1':		
				 rocket_acceleration = r1.getEngine_thrust() * r1.totalweight();
				 updated_fuel_level = r1.getFuel_load();	
				 for (time = 1; time <= 125; time++ )
				{
					
					if (updated_fuel_level > 0)	
					{
						if (time == 25)
							updated_fuel_level = updated_fuel_level - 50  ;
							rocket_acceleration =+ 100; 
							rocket_height = (rocket_acceleration * time)/100 ; //(distance travelled = speed x time)
						if (time == 50)
							updated_fuel_level = updated_fuel_level - 75  ;
							rocket_acceleration =+ 150;
							rocket_height = (rocket_acceleration * time)/100 ;
						if (time == 75)
							updated_fuel_level = updated_fuel_level - 100  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;
						if (time == 100)
							updated_fuel_level = updated_fuel_level - 30  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;
						if (time == 125)
							updated_fuel_level = updated_fuel_level - 50  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;	
		
						
					}
				
					else if (updated_fuel_level <= 0) 
					{	
						
						System.out.println("ROCKET LAUNCHED- MAXIMUM HEIGHT REACHED ");
						break;
					}	
					System.out.println(time +"  " + r1.rocket_name       +"      ROCKET FLYING AT HEIGHT               "+rocket_height+"                 KM");
				}
				 break;
			case '2':
				
				rocket_acceleration = r2.getEngine_thrust() * r2.totalweight();
				updated_fuel_level = r2.getFuel_load();
				 for (time = 1; time <= 125; time++ )
				{
					
					if (updated_fuel_level > 0)	
					{
						if (time == 25)
							updated_fuel_level = updated_fuel_level - 50  ;
							rocket_acceleration =+ 100; 
							rocket_height = (rocket_acceleration * time)/100 ; //(distance travelled = speed x time)
						if (time == 50)
							updated_fuel_level = updated_fuel_level - 75  ;
							rocket_acceleration =+ 150;
							rocket_height = (rocket_acceleration * time)/100 ;
						if (time == 75)
							updated_fuel_level = updated_fuel_level - 100  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;
						if (time == 100)
							updated_fuel_level = updated_fuel_level - 30  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;
						if (time == 125)
							updated_fuel_level = updated_fuel_level - 50  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;	
						
					}
				
					else if (updated_fuel_level <= 0) 
					{	
						
						System.out.println("FUEL OUT ..ROCKET LAUNCHED- MAXIMUM HEIGHT REACHED ");
						break;
					}	
					System.out.println(time +"  " + r2.rocket_name       +"      ROCKET FLYING AT HEIGHT               "+rocket_height+"                 KM");
				}
				 break;
				
			case '3':
				
				rocket_acceleration = r3.getEngine_thrust() * r3.totalweight();
				updated_fuel_level = r3.getFuel_load();
				 for (time = 1; time <= 125; time++ )
				{
					
					if (updated_fuel_level > 0)	
					{
						if (time == 25)
							updated_fuel_level = updated_fuel_level - 50  ;
							rocket_acceleration =+ 100; 
							rocket_height = (rocket_acceleration * time)/100 ; //(distance travelled = speed x time)
						if (time == 50)
							updated_fuel_level = updated_fuel_level - 75  ;
							rocket_acceleration =+ 150;
							rocket_height = (rocket_acceleration * time)/100 ;
						if (time == 75)
							updated_fuel_level = updated_fuel_level - 100  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;
						if (time == 100)
							updated_fuel_level = updated_fuel_level - 30  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;
						if (time == 125)
							updated_fuel_level = updated_fuel_level - 50  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;	
		
						
					}
				
					else if (updated_fuel_level <= 0) 
					{	
						
						System.out.println("ROCKET LAUNCHED- MAXIMUM HEIGHT REACHED ");
						break;
					}	
					System.out.println(time +"  " + r3.rocket_name       +"      ROCKET FLYING AT HEIGHT               "+rocket_height+"                 KM");
				}
				 break;			
				 
			case '4':
				
				rocket_acceleration = r4.getEngine_thrust() * r4.totalweight();
				updated_fuel_level = r4.getFuel_load();
				 for (time = 1; time <= 125; time++ )
				{
					
					if (updated_fuel_level > 0)	
					{
						if (time == 25)
							updated_fuel_level = updated_fuel_level - 50  ;
							rocket_acceleration =+ 100; 
							rocket_height = (rocket_acceleration * time)/100 ; //(distance travelled = speed x time)
						if (time == 50)
							updated_fuel_level = updated_fuel_level - 75  ;
							rocket_acceleration =+ 150;
							rocket_height = (rocket_acceleration * time)/100 ;
						if (time == 75)
							updated_fuel_level = updated_fuel_level - 100  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;
						if (time == 100)
							updated_fuel_level = updated_fuel_level - 30  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;
						if (time == 125)
							updated_fuel_level = updated_fuel_level - 50  ;
							rocket_acceleration =+ 100;
							rocket_height = (rocket_acceleration * time) ;						
					}
				
					else if (updated_fuel_level <= 0) 
					{	
						
						System.out.println("ROCKET LAUNCHED- MAXIMUM HEIGHT REACHED ");
						break;
					}	
					System.out.println(time +"  " + r4.rocket_name       +"      ROCKET FLYING AT HEIGHT               "+rocket_height+"                 KM");
				}
				 break;
				case '5':
				
					rocket_acceleration = r5.getEngine_thrust() * r5.totalweight();
					updated_fuel_level = r5.getFuel_load();
					 for (time = 1; time <= 125; time++ )
					{
						
						if (updated_fuel_level > 0)	
						{
							if (time == 25)
								updated_fuel_level = updated_fuel_level - 50  ;
								rocket_acceleration =+ 100; 
								rocket_height = (rocket_acceleration * time)/100 ; //(distance travelled = speed x time)
							if (time == 50)
								updated_fuel_level = updated_fuel_level - 75  ;
								rocket_acceleration =+ 150;
								rocket_height = (rocket_acceleration * time)/100 ;
							if (time == 75)
								updated_fuel_level = updated_fuel_level - 100  ;
								rocket_acceleration =+ 100;
								rocket_height = (rocket_acceleration * time) ;
							if (time == 100)
								updated_fuel_level = updated_fuel_level - 30  ;
								rocket_acceleration =+ 100;
								rocket_height = (rocket_acceleration * time) ;
							if (time == 125)
								updated_fuel_level = updated_fuel_level - 50  ;
								rocket_acceleration =+ 100;
								rocket_height = (rocket_acceleration * time) ;	
			
							
						}
					
						else if (updated_fuel_level <= 0) 
						{	
							
							System.out.println("ROCKET LAUNCHED- MAXIMUM HEIGHT REACHED ");
							break;
						}	
						System.out.println(time +"  " + r5.rocket_name       +"      ROCKET FLYING AT HEIGHT               "+rocket_height+"                 KM");
					}
					 break;
					 default:
						 done = true;
						 break;

		}
		
}}
