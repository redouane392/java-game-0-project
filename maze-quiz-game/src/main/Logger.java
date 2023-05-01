package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Logger extends JPanel implements Runnable {
	
	public static BufferedImage heart;
	public static String message;
	public static String input;
	
	static {
		try {
			message = "";
			heart = ImageIO.read(Logger.class.getResourceAsStream("/heart.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Logger() {
		this.setPreferredSize(new Dimension(320, 64));
		this.setBackground(Color.BLACK);
		new Thread(this).start();
	}
	
	/**
	 * A method which is called to put text over Logger.
	 * @param g
	 */
	public void putText(Graphics g) {
		int width;
		int current;
		int widths[];
		int lastSpace, lastIter;
		FontMetrics metrics;
		
		metrics = g.getFontMetrics();
		width = this.getWidth() - 72;
		widths = metrics.getWidths();
		current = 0;
		lastIter = 0;
		lastSpace = 0;
		
		int i, n;
		n = 1;
		
		for (i = 0; i < message.length(); i++) {
			int ch;
			if ((ch = message.charAt(i)) == ' ')
				lastSpace = i;
			current += widths[ch];
			if (current < width) continue;
			g.drawString(message.substring(lastIter, lastSpace), 12, 12 * n++);
			lastIter = lastSpace + 1;
			i = lastSpace;
			current = 0;
		}
		g.drawString(message.substring(lastIter, i), 12, 12 * n);
	}
	
	/**
	 *  A method to ask the system to refresh the display 
	 */
	public void run() {
		while (true)
		this.repaint();
	}
	
	/**
	 * A method which is called when the we call the method run.
	 * draw the graphics on the screen.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		if (this.hasFocus())
		g.fillRect(0, 16, (int) (Game.UNIT_SIZE * 0.5), (int) (Game.UNIT_SIZE * 0.5));
		putText(g);
		// g.drawString(message, 8, 8);
		g.drawImage(heart, 320 - 16*3, 0, null);
		g.drawString(String.format("%d", Game.health), 320 - 24, 12);
	}
}
