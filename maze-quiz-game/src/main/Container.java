package main;

import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.OverlayLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Container extends JLayeredPane
{
	public Logger  logger;
	public JButton button;
	
	/**
	 * A method which is called to create new container
	 */
	public Container() {
		this.setLayout(new OverlayLayout(this));
		this.setBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "Log"));
		logger = new Logger();
		button = new JButton("Y");
		this.add(logger, 1);
		this.add(button, 0);
		logger.setBounds(0, 0, 320, 64);
		button.setBounds(0, 0, 48, 24);
		this.setLayer(button, 2);
	}
}
