package wwp;


import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;


import gov.nasa.worldwind.awt.WorldWindowGLCanvas;

public class WorldWindApo2 { 

		private JFrame frame;
		private WorldWindowGLCanvas wwd = null;
		private StatusBar statusBar;
		private boolean hasStatusBar = true;
	public WorldWindApo2() {
		frame = new JFrame();
		
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(new BorderLayout());
	
		wwd = new WorldWindowGLCanvas();
	
		wwd.setPreferredSize(new Dimension(1000, 800));
		wwd.setModel(new BasicModel());
		
		frame.getContentPane().add(wwd, BorderLayout.CENTER);
	
		
		if(hasStatusBar) {
			statusBar = new StatusBar();
			frame.getContentPane().add(statusBar, BorderLayout.WEST);
		}
		
		if (hasLayerPanel) {
		
			layerPanel = new LayerPanel(wwd);
			frame.getContentPane().add(layerPanel, BorderLayout.WEST);
		}
		frame.pack();
	
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	
	public static void main(String[] args) {
		
		WorldWindApo2 wwApp = new WorldWindApo2();
			
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				wwApp.getFrame().setVisible(true);
					}
		});
	
	}

}
