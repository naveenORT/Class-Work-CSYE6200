package loopcontrol;
import java.io.IOException;
/**
 * @author Naveen Rajendran
 *
 **/
public class switch1 
{	
	public switch1() throws IOException 
	{
		char gridMap[][] = new char[8][8];	
		char inVal;
		boolean done = false;
		for (int row = 0; row < 8; row++){
			for(int col = 0; col < 8; col++){
				gridMap[row][col] = '+';
				gridMap[3][5] ='*';
				System.out.print(gridMap[row][col] +" ");
		 	}
			System.out.println(" ");
		}
		
		while (!done) 
		{
			System.out.println("enter a value to quit");
	        inVal = (char) System.in.read();	
		    System.out.println("We read a " + inVal + "character " + (int) inVal);
		    
		    switch(inVal) 
		    {
		    case 'a':
		    case 'A':
		    	System.out.println("We found an A ****");
		    	break;
		    case 'B':
		    case 'b':
		    	System.out.println("We found an B ****");
		    	break;	
		    case 'q':
		    	done = true;
		    	break;
		    case 'p':
		    	for (int row = 0; row < 8; row++)
				{
					for(int col = 0; col < 8; col++) 
				 	{
						gridMap[row][col] = '+';
						
						System.out.print(gridMap[row][col] +" ");
				 	}
				
					System.out.println(" "); //return to the next line
				}
		    	
		    default:
		    	System.out.println("invalid");
		   	} 		    
		    if (inVal == 'q') done = true;
		    
		}
		System.out.println("End of constructor");
	}

	
	public static void main(String[] args) throws IOException 
	{
		new switch1(); //create a switch using constructor
		System.out.print("We are done");;
	}

}
