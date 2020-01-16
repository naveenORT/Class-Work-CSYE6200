	package ui;

public class SimControl {

	private Thread myThread = null;
	private Runnable myRunnable = null;
	private boolean paused = false;
	private boolean done = false;
	
	public SimControl(Runnable myRunnable) {
		this.myRunnable = myRunnable;
	}
	
	public void startSim() {
		if(myThread == null)
			myThread = new Thread(myThread);
		if(myThread.isAlive())
		myThread.start();
	
		}
	
		public void pauseSim() {
		
			paused = !paused;
		}
	
		public void quitSim() {
	
		}

		private void delayThread(long millis)
		{
			try {
			Thread.sleep(millis);
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
		}
		public void run() {
			while(!done) {
			if(!paused)
				doWork();
			}
			System.out.println("we've stopped the simulation");
			myThread = null;
		
		}
		int ctr=0;
		public void doWork() {

			System.out.println("Did some work - ctr" + ctr++);
		}
}














