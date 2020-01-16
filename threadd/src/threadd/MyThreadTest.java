package threadd;

public class MyThreadTest {

	private MyThread threadA = null;
	private MyThread[] threads = new MyThread[10];
	
	public MyThreadTest() {
		threadA = new MyThread("A");
	
		for(int i =0; i< threads.length; i++)
			threads[i] = new MyThread("Thread" + i);
	}

	public void run() {
		threadA.start();
		for(int i =0; i<threads.length; i++)
			threads[i].start();
	}
	
	public static void main(String[] args) {
		MyThreadTest mtt =new MyThreadTest();
		mtt.run();
	}

}
