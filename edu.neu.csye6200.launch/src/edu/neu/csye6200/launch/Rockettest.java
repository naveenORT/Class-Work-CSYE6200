package edu.neu.csye6200.launch;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Rockettest 
{
	static Rocket launch_list[] = new Rocket[10];
	static Rocket rock1 = new Rocket("CHANDRAYAN","INDIA",562,230,97,5600);
	static Rocket rock2 = new Rocket("VOYAGER","USA",623,205,85,4922);
	static Rocket rock3 = new Rocket("SPUTNIK","USSR",423,285,89,4978);
	static Rocket rock4 = new Rocket("YINGHUO","CHINA",456,245,90,5123);
	static Rocket rock5 = new Rocket("QUASSAM","ISRAEL",398,233,92,5060);
	static Rocket rock6 = new Rocket("XYX","AUSTRALIA",402,225,96,5123);
	static Rocket rock7 = new Rocket("APOLLO","USA",398,250,86,4800);
	static Rocket rock8 = new Rocket("MANGALYAN","INDIA",400,237,91,5250);
	static Rocket rock9 = new Rocket("APPLE","FRANCE",427,295,95,5123);
	static Rocket rock10 = new Rocket("GETLZ","GERMANY",419,235,96,4997);
	
	
	static Logger log = Logger.getLogger(LaunchSheduler.class.getName());   //logging launch scheduler class	
	static Logger log2 = Logger.getLogger(RocketIO.class.getName());  // logging ROCKET IO CLASS
	
	public Rockettest()
	{
	launch_list[0]= rock1;
	launch_list[1]= rock2;
	launch_list[2]= rock3;
	launch_list[3]= rock4;
	launch_list[4]= rock5;
	launch_list[5] = rock6;
	launch_list[6] = rock7;
	launch_list[7] = rock8;
	launch_list[8] = rock9;
	launch_list[9] = rock10;
	
	}
	
	public static void storerocketlist()
	{
	for (int i = 0; i < launch_list.length ; i++)
	{
		Rocket rock_database = launch_list[i];			  // assigning the constructed details to object 'rok'
		rock_database.totalweight();
		System.out.println("\n"+ (i+1)+".)" + rock_database);               
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
	}}
 	 	
 	public static void main(String args[]) throws IOException
	{	
 		
 		FileHandler handler = new FileHandler("C:\\Users\\Naveen Rajendran\\Desktop\\career\\OOPS\\logdetails.txt");	// saving entire log in this location	
 		Formatter simpleFormatter = new SimpleFormatter();
 		handler.setFormatter(simpleFormatter);
 		log.addHandler(handler);
 		log2.addHandler(handler);
 		System.out.println("\n  ASSIGNMENT-4" + "\n NAVEEN RAJENDRAN " + "\n NUID:001304569");
		System.out.println("\n ROCKET DATABASE"); 
		System.out.println("PRINTING THE DETAILS");
		Rockettest rocket = new Rockettest();
		storerocketlist();
		LaunchSheduler object = LaunchSheduler.getSingleton();
		MSrocket.buildrocket();
		RocketIO io = new RocketIO();
		Tractor t = new Tractor();
		Simulation st = new Simulation();
	}
	
}