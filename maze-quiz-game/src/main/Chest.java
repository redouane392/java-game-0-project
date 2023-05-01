package main;
import java.awt.Color;
import java.awt.Graphics;

public class Chest extends Element {
	public Color color;
	
	public Chest(int x, int y, String label, Color color) {
		super(x, y, label);
		this.color = color;
	}
	
	/**
	 * A method which is called when paint a component
	 * set the green color if visited if not set the red color
	 */
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		if (this.equals(Game.current)) drawConnection(g);
		g.setColor(visited ? Color.GREEN : Color.RED);
		// g.drawImage(image, screenX, screenY, null);
		g.fillRect(screenX, screenY, Game.UNIT_SIZE, Game.UNIT_SIZE);
	}
	
	
	@Override
	public void clicked() {
        Event event = new Event();
        event.GetN();
	}
}
