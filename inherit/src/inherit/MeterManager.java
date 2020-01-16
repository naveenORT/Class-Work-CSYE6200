package inherit;

import java.util.logging.Logger;
import java.util.ArrayList;

//Singleton
public class MeterManager {

	
	private static Logger log = Logger.getLogger(MeterManager.class.getName());
	private static MeterManager instance = null;	
	private ArrayList<MeterI> meterList = new ArrayList<MeterI>();
	private MeterManager() {
	
	}

	public static MeterManager instnce() {
		if (instance == null) 
			instance = new MeterManager();
		return instance;
	}

	public void add(MeterI meter)
	{

		meterList.add(meter);
		log.info("Added a meter");
	}

	public static MeterManager instance()
	{
		if (instance == null)
			instance = new MeterManager();
			return instance;
	
	}	

}
