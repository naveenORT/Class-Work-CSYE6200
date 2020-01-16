package ui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MyAppUi
{
	private JFrame frame = null;
	private MyPanel canvas = null;
	private Logger log = Logger.getLogger(MyAppUI.class.getName());
	
	private JButton stopBtn = null;
	private JButton startBtn = null;
	private JComboBox combo
	private JPanel mainPanel = null;
	
	public MyAppUi() {
	initGUI();
	}
	
	private void initGUI() {
		
		frame = new JFrame();
		frame.setSize(400,300);
		frame.setTitle("MyAppUI:");	
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JPanel panel = new JPanel();
		//panel.setBackground(Color.RED);	
		frame.setLayout(new BorderLayout());
		
		frame.add(getMainPanel(), BorderLayout.NORTH);
		canvas = new MyPanel();
		
		frame.add(canvas, BorderLayout.CENTER);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		MyAppUi myApp = new MyAppUi();
		System.out.println("MyAppUi is exiting");
	}
	private JPanel getMainPanel() {
		mainPanel = new JPanel();
		
		mainPanel.setLayout(new FlowLayout());
		startBtn = new JButton("Start");
		stopBtn = new JButton("Stop");
	
		
		startBtn.addActionListener(this);
		stopBtn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				System.out.println("STOP CALLED");
			}
	});
		mainPanel.add(startBtn);
		mainPanel.add(stopBtn);
		
		comboBox = new JComboBox();
		comboBox.addItem("Option 1");
		comboBox.addItem("Option 2");
		comboBox.addItem("Option 3");
		
		
		
		mainPanel.add(new JLabel("Option:"));
		mainPanel.add(comboBox);
		comboBox.addActionListener(this);
		return mainPanel;
	
	}
	public void actionPerformed(ActionEvent e)
	{
		log.info("We receive an actionEvent" + e);
	
		if (e.getActionCommand().equalsIgnoreCase("Start")) {
			System.out.println("Lets start something");
		}
		else if (e.getActionCommand().equalsIgnoreCase("Stop")) {
			System.out.println("Lets stop something");
		}
		
	}
}
