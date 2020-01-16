package threadd;

public class MyThread extends Thread{

	private boolean done = false;
	private int ctr = 0;
	public MyThread(String name) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		while(!done)
			doWork();
			ctr++;
			if((ctr %10)==0)
				System.out.println("Thread - loop #" + getName());
		
	}
	
	private void doWork() {

		for (int i=0; i<10000; i++) {
			double val = Math.exp((double) i);
	}
	}
}
