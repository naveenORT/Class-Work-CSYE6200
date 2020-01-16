package serial;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SerialTest {

	public SerialTest() {

	}

	public void streamOut(CarData cardata, String filename) {
			
		try {
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.close();
			fos.close();
		} catch (FileNotFoundException e)
			{e.printStackTrace();}
		catch (IOException e)
		{e.printStackTrace();
		}

	}
	public CarData streamIn(String filename) throws ClassNotFoundException {
		CarData cardata = null;
	
	
	try {
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fis);
		cardata =  (CarData) ois.readObject();		
		ois.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 catch (IOException e) {	
		e.printStackTrace();
	 }	
		catch(ClassNotFoundException e) {
			e.printStackTrace();
	}
	return cardata;	
	}	
		
	public static void main(String[] args) {
	 SerialTest	serTest = new SerialTest();
	 CarData carData = new CarData(1,2.0,"Ford"); 
	 serTest.streamOut(carData, "autoX.data");
	 CarData carDataIn;
	try {
		carDataIn = serTest.streamIn("autoX.data");
		 System.out.println("CarDataIn is" + carDataIn.getName());
			
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 ArrayList<CarData> carList = new ArrayList<CarData>();
	
	 carList.add(new CarData (0, 1.0, "Chevy"));
	 carList.add(new CarData (1, 1.0, "BMW"));
	 carList.add(new CarData (2, 1.0, "AUDI"));
	 carList.add(new CarData (3, 1.0, "KSP"));
	 carList.add(new CarData (4, 1.0, "OTHA"));
	
	 Collections.sort(carList);
	
	System.out.println("List is sorted");
	
	for (CarData car : carList) {
	
	System.out.println(car);
	}
	
	}
}
