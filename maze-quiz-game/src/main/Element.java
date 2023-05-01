package main;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public abstract class Element
{
	public int x;
	public int y;
	public int screenX;
	public int screenY;
	public Color color;
	public String label;
	public boolean hovered;
	public boolean visited;
	public ArrayList<Element> connections;
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param label
	 */
	protected Element(int x, int y, String label) {
		this.x = x;
		this.y = y;
		this.label = label;
		this.connections = new ArrayList<>();
	}
	
	public void drawConnection(Graphics g) {
		g.setColor(Color.BLACK);
		for (Element current: connections)
		g.drawLine(screenX + 8, screenY + 8, current.screenX + 8, current.screenY + 8);
	}

	public void update() {
		screenX = (x - (Game.current).x) + (int) (320 * 0.5);
		screenY = (y - (Game.current).y) + (int) (200 * 0.5);
	}

	
	public void draw(Graphics g) {
		if (! hovered) return;
		g.setColor(Color.WHITE);
                String msg= "hiii";
		g.drawString(msg, 8, 8);
	}
	/**
        * A method for returning the value of 'visited' variable of class Element
        * @return The <code>value</code> of the 'visited' variable 
        * @see visited
        */
        public boolean GetV(){return this.visited;}
	public abstract void clicked() throws HealthExc,LabelExc;
}
