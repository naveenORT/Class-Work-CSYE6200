package run;

public class MyRunnable {
	private String name ="";
	private int ctr = 0;
	private boolean done = false;
	
	
	public MyRunnable(String name) {
	
	this.name = name;
	}
	public void run() {
		while(!done)
			doWork();
			try {
			Thread.sleep(100L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ctr++;			
			if((ctr %10)==0)
				System.out.println("Thread - loop #" + getName());
		
}
	
	

	private void doWork() {

		for (int i=0; i<10000; i++) {
			double val = Math.exp((double) i);

	}

	
	public MyRunnable() {
		this.name = name;
	}

}
