package run;

public class MyRunTest {

	MyRunnable myRunA = null;
	MyRunnable myRunB = null;
	Thread threadA = null;
	Thread threadB = null;
	public MyRunTest() {
		myRunA = new MyRunnable("A");
		threadA = new Thread(myRunA);
		myRunB = new MyRunnable("B");
		threadB = new Thread(myRunB);
	}

	public void run() {
		
		threadA.start();
	}
	
	
	public static void main(String[] args) {
		MyRunTest mrtest = new MyRunTest();
		mrtest.run();
	}

}
