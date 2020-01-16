package ep;

import java.util.Observable;

public class EventPublisher extends Observable {

	private int ctr = 0;
	private boolean done = false;
	public EventPublisher() 
	{
		System.out.println("EventPublisher - we are here");
	}

	public void doAction() {
		setChanged();
		notifyObservers(new String ("A message" + ctr++));
	}
	
	public void run() {
		while(!done) {
			doAction();
			if(ctr > 10)
				done =true;
		
		}
	}
	public static void main(String[] args) {
	EventPublisher ep = new EventPublisher();
	EventSubscriber sub1 = new EventSubscriber();
	ep.addObserver(sub1);
	ep.run();
	}

}
