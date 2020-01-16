package edu.neu.csye6200.launch;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class RocketIO {
	
	static String base = "src/edu.neu.csye6200.launch";
	String file_name;
	ArrayList<MSrocket> store_details = new ArrayList<MSrocket>();
	
	public static Logger log2 = Logger.getLogger(RocketIO.class.getName());
	
	MSrocket m1 = MSrocket.build_list[0];
	MSrocket m2 = MSrocket.build_list[1];
	MSrocket m3 = MSrocket.build_list[2];
	MSrocket m4 = MSrocket.build_list[3];
	MSrocket m5 = MSrocket.build_list[4];
	MSrocket m6 = MSrocket.build_list[5];
	MSrocket m7 = MSrocket.build_list[6];
	MSrocket m8 = MSrocket.build_list[7];
	MSrocket m9 = MSrocket.build_list[8];
	MSrocket m10 = MSrocket.build_list[9];
	
	public RocketIO()
	{	
		
		load_list(); // storing all instances to file
		load_individual(); //storing details of each rocket in separate files
	}
	
	private static void list_save(String file_name, ArrayList<MSrocket> store_list) 
	{
	log2.info("\n SAVING ROCKET LIST TO DISK");
	try {	
		FileWriter writer  = new FileWriter(base + file_name); //getting file name & rocket list as parameters
		writer.write("\n"+ store_list);	      // storing rocket_list
		writer.close();
		}
	catch (FileNotFoundException e) 
		{
		System.out.println("FILE NOT FOUND");
		e.printStackTrace();
		log2.severe("FILE NOT FOUND ERROR OCCURED");
		} 
	catch (IOException e) 
	{
		log2.severe("IO ERROR OCCURED");
		System.out.println("IO ERROR");
		e.printStackTrace();
	}}
	
	private static void individual_save(String file_name, MSrocket m) //getting file name & rocket list as parameters
	{
	
	try {		
			FileWriter writer  = new FileWriter(base + file_name);
			writer.write("\n"+ m);	
			writer.close();
		}
	catch (FileNotFoundException e) 
	{
		System.out.println("FILE NOT FOUND");
		e.printStackTrace();
		log2.severe("FILE NOT FOUND ERROR OCCURED");
	} 
	catch (IOException e) 
	{
		System.out.println("IO ERROR");
		e.printStackTrace();
		log2.severe("IO ERROR OCCURED"); 
	}}
	
	private void load_individual() 
	{
	
		log2.info("\n LOADING ROCKET OBJECTS 1,2,3,4,5");
		
		RocketIO.individual_save("ROCKET1_DETAILS.txt",m1); //passing file name & rocket list as parameters
		
		RocketIO.individual_save("ROCKET2_DETAILS.txt",m2); //passing file name & rocket list as parameters
		
		RocketIO.individual_save("ROCKET3_DETAILS.txt",m3); //passing file name & rocket list as parameters
		
		RocketIO.individual_save("Rocket4_DETAILS.txt",m4); //passing file name & rocket list as parameters
		
		RocketIO.individual_save("ROCKET5_DETAILS.txt",m5); //passing file name & rocket list as parameters
		
		RocketIO.individual_save("ROCKET6_DETAILS.txt",m6);
		
		RocketIO.individual_save("ROCKET7_DETAILS.txt",m7);
		
		RocketIO.individual_save("ROCKET8_DETAILS.txt",m8);
		
		RocketIO.individual_save("ROCKET9_DETAILS.txt",m9);
		
		RocketIO.individual_save("ROCKET10_DETAILS.txt",m10);
		
		
		log2.info("\n FINISHED WRITING ROCKET OBJECTS  1, 2, 3, 4, 5 ,6 , 7, 8 , 9, 10  SEPERATELY TO DISK");
	}
	
	private void load_list() 
	{
		
		log2.info("\n LOADING ROCKET OBJECTS TO ROCKET LIST");

		store_details.add(m1); //adding object to list
		
		store_details.add(m2); //adding object to list	
		
		store_details.add(m3); //adding object to list
			
		store_details.add(m4); //adding object to list
				
		store_details.add(m5); //adding object to list
		
		store_details.add(m6);
		
		store_details.add(m7);
		
		store_details.add(m8);
		
		store_details.add(m9);
		
		store_details.add(m10);
		
		RocketIO.list_save("TOTAL_ROCKET_LIST.txt", store_details);  //passing file name & rocket list as parameters	
	}

}
