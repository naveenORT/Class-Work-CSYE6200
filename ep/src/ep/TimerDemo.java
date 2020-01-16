package ep;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {

private Timer timer;	
	
	public TimerDemo() {

	timer = new Timer();
	timer.schedule(new RemindTask(), 3000L, 1000L);

	}
class RemindTask extends TimerTask {
	private int ctr =0;
	@Override	
	public void run() {
		System.out.println("Timer alert" + ctr++);
		Toolkit.getDefaultToolkit().beep();
	
	if (ctr >=5) timer.cancel();
	}	
}	
	
public static void main(String[] args) {
	
	new TimerDemo();
	System.out.println("we are done!!");
}

}




















