package main;
import java.awt.BorderLayout;
import java.awt.Cursor;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Window window;
		Container container;
		window = new Window();
		container = new Container();
		window.setTitle("ClicknDiscover");
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLayout(new BorderLayout());
		window.add(new Game(window), BorderLayout.NORTH);
		window.add(container, BorderLayout.SOUTH);
		window.pack();
		window.setVisible(true);
	}
	
	/**
	 * A method which is called to set cursor 
	 * @param type
	 */
	public void makeCursor(int type) {
		this.setCursor(Cursor.getPredefinedCursor(type));
	}
}
