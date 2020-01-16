package ep;

import java.util.Observable;
import java.util.Observer;

public class EventSubscriber implements Observer {

	public EventSubscriber() {
	
	}	
	@Override
	
	public void update(Observable o, Object arg) {
		System.out.println("ES RECEIVED UPDATE FROM:" + o);
		System.out.println("                    message" + arg);
	
	
	
	
	}
}

