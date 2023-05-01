package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import control.MouseControl;

@SuppressWarnings("serial")
public class Game extends JPanel implements Runnable {
	public static Window  window;
	public static Element current;
        public static int health = 100;
	public static final int UNIT_SIZE = 16;
	public static final ArrayList<Element> elements = new ArrayList<>();
	public static final ArrayList<Arrow>   arrows = new ArrayList<>();
	
	private MouseControl mc;
	
	public Game(Window window) {
		this.mc = new MouseControl();
		this.window = window;
		this.addMouseListener(mc);
		this.addMouseMotionListener(mc);
		
		this.setPreferredSize(new Dimension(320, 200));
		this.setFocusable(true);
		this.setBackground(Color.WHITE);
		new Thread(this).start();
	}
	/**
	 * create and add the element
	 * set the connection between elements 
	 * ask the system to refresh the display
	 */
	
	@Override
	public void run() {
        Text text=new Text();
		Element chest0,chest1,chest2,chest3,chest4,chest5,chest6,chest7,chest8,chest9,chest10,chest11,chest12,chest13,chest14,chest15,chest16,chest17,
		chest18,chest19,chest20,chest21,chest22,chest23,chest24,chest25,chest26,chest27,chest28,chest29,
		chest30,chest31,chest32,chest33,chest34,chest35,chest36,chest37,
		chest38,chest39,chest40,chest41,chest41_,chest42,chest43,chest44,chest45,chest46,chest47,chest48,chest49,chest49_,chest50,chest51,chest52,chest53,chest54,chest55,chest56,chest57,
		chest58;
	
		chest0 = new Chest(160, 160, text.getInfo(), Color.WHITE);
		chest1 = new Chest(-20, -20, text.getInfo(), Color.BLUE);
		chest2 = new Chest(0, 0, text.getInfo(), Color.BLUE);
		chest3 = new Chest(0, 20, text.getInfo(), Color.BLUE);
		chest4 = new Chest(0, 40, text.getInfo(), Color.BLUE);
		chest5 = new Chest(0, 60, text.getInfo(), Color.BLUE);
		chest6 = new Chest(-40, 80, text.getInfo(), Color.BLUE);
		chest7 = new Chest(0, 100, text.getPhrase(), Color.BLUE);
		chest8 = new Chest(-60, 120, text.getInfo(), Color.BLUE);
		
		
		
		chest9 = new Chest(-80, 0, text.getInfo(), Color.BLUE);
		chest10 = new Chest(-20, 20, text.getInfo(), Color.BLUE);
		chest11 = new Chest(-20, 40, text.getInfo(), Color.BLUE);
		chest12 = new Chest(20, 60, text.getInfo(), Color.BLUE);
		chest13 = new Chest(20, 80, text.getInfo(), Color.BLUE);
		chest14 = new Chest(-40, 100, text.getInfo(), Color.BLUE);
		chest15 = new Chest(-80, 120, text.getInfo(), Color.BLUE);
	
		chest16 = new Chest(-80, 0, text.getInfo(), Color.BLUE);
		chest17 = new Chest(-80, 20, text.getInfo(), Color.BLUE);
		chest18 = new Chest(-60, 40, text.getInfo(), Color.BLUE);
		chest19 = new Chest(0, 60, text.getInfo(), Color.BLUE);
		
		chest20 = new Chest(40, 80, text.getInfo(), Color.BLUE);
		chest21 = new Chest(40, 100, text.getInfo(), Color.BLUE);
		chest22 = new Chest(40, 120, text.getInfo(), Color.BLUE);
		
		chest23 = new Chest(60, 0, text.getInfo(), Color.BLUE);
		chest24 = new Chest(60, 20, text.getInfo(), Color.BLUE);
		chest25 = new Chest(60, 40, text.getInfo(), Color.BLUE);
		chest26 = new Chest(60, 60, text.getInfo(), Color.BLUE);
		chest27 = new Chest(60, 80, text.getInfo(), Color.BLUE);
		chest28 = new Chest(60, 100, text.getInfo(), Color.BLUE);
		chest29 = new Chest(60, 120, text.getInfo(), Color.BLUE);
		
		
		chest30 = new Chest(80, 0, text.getInfo(), Color.BLUE);
		chest31 = new Chest(80, 20, text.getInfo(), Color.BLUE);
		chest32 = new Chest(80, 40, text.getInfo(), Color.BLUE);
		chest33 = new Chest(80, 60, text.getInfo(), Color.BLUE);
		chest34 = new Chest(80, 80, text.getInfo(), Color.BLUE);
		chest35 = new Chest(80, 100, text.getInfo(), Color.BLUE);
		chest36 = new Chest(80, 120, text.getInfo(), Color.BLUE);

		chest37 = new Chest(100, 0, text.getInfo(), Color.BLUE);
		chest38 = new Chest(100, 20, text.getInfo(), Color.BLUE);
		chest39 = new Chest(100, 40, text.getInfo(), Color.BLUE);
		chest40 = new Chest(100, 60, text.getInfo(), Color.BLUE);
		chest41 = new Chest(100, 80, text.getInfo(), Color.BLUE);
		chest58 = new Chest(100, 80, text.getInfo(), Color.BLUE);
		chest42 = new Chest(100, 100, text.getInfo(), Color.BLUE);
		chest43 = new Chest(100, 120, text.getInfo(), Color.BLUE);
		
		chest44 = new Chest(120, 0, text.getInfo(), Color.BLUE);
		chest45 = new Chest(120, 20, text.getInfo(), Color.BLUE);
		chest46 = new Chest(120, 40, text.getInfo(), Color.BLUE);
		chest47 = new Chest(120, 60, text.getInfo(), Color.BLUE);
		chest48 = new Chest(120, 80, text.getInfo(), Color.BLUE);
		chest49 = new Chest(120, 100, text.getInfo(), Color.BLUE);
		chest50 = new Chest(120, 120, text.getInfo(), Color.BLUE);
		
		chest51 = new Chest(140, 60, text.getInfo(), Color.BLUE);
		chest52 = new Chest(160, 100, text.getInfo(), Color.BLUE);
		chest53 = new Chest(140, 120, text.getInfo(), Color.BLUE);
		chest54 = new Chest(160, 120, text.getInfo(), Color.BLUE);
		chest55 = new Chest(180, 100, text.getInfo(), Color.BLUE);
		chest56 = new Chest(180, 120, text.getInfo(), Color.BLUE);
		chest57 = new Chest(200, 120, "YOU WIN", Color.BLUE);

		elements.add(chest0);
		elements.add(chest1);		
		elements.add(chest11);
		elements.add(chest12);
		elements.add(chest13);
		elements.add(chest2);
		elements.add(chest3);
		elements.add(chest4);
		elements.add(chest6);
		elements.add(chest5);
		elements.add(chest7);		
		elements.add(chest8);
		elements.add(chest9);
		elements.add(chest10);
		elements.add(chest11);
		elements.add(chest12);
		elements.add(chest13);
		elements.add(chest14);
		elements.add(chest15);
		elements.add(chest16);
		elements.add(chest17);
		elements.add(chest18);
		elements.add(chest19);
		elements.add(chest20);
		elements.add(chest21);
		elements.add(chest22);
		elements.add(chest27);
		elements.add(chest28);
		elements.add(chest32);
		elements.add(chest34);
		elements.add(chest35);
		elements.add(chest41);
		elements.add(chest58);
		elements.add(chest42);
		elements.add(chest45);
		elements.add(chest46);
		elements.add(chest48);
		elements.add(chest49);
		elements.add(chest50);
		elements.add(chest51);
		elements.add(chest52);
		elements.add(chest53);
		elements.add(chest54);
		elements.add(chest55);
		elements.add(chest56);
		elements.add(chest57);
			
		(chest1.connections).add(chest2);
		(chest2.connections).add(chest3);
		(chest3.connections).add(chest4);
		(chest4.connections).add(chest5);
		(chest5.connections).add(chest4);
		(chest4.connections).add(chest12);
		(chest12.connections).add(chest4);
		(chest4.connections).add(chest11);
		(chest9.connections).add(chest10);
		(chest10.connections).add(chest9);
		(chest11.connections).add(chest4);
		(chest11.connections).add(chest10);
		(chest11.connections).add(chest18);
		(chest18.connections).add(chest11);
		(chest12.connections).add(chest10);
		(chest10.connections).add(chest4);
		(chest10.connections).add(chest15);
		(chest15.connections).add(chest16);
		(chest16.connections).add(chest15);
		(chest17.connections).add(chest18);
		(chest18.connections).add(chest17);
		(chest17.connections).add(chest19);
		(chest19.connections).add(chest7);
		(chest19.connections).add(chest8);
		(chest8.connections).add(chest19);
		(chest13.connections).add(chest15);
		(chest15.connections).add(chest13);
		(chest14.connections).add(chest10);
		(chest10.connections).add(chest14);
		(chest16.connections).add(chest19);
		(chest22.connections).add(chest1);
		(chest19.connections).add(chest16);
		(chest5.connections).add(chest6);
		(chest6.connections).add(chest5);
		(chest6.connections).add(chest7);
		(chest7.connections).add(chest6);
		(chest7.connections).add(chest21);
		(chest22.connections).add(chest21);
        (chest21.connections).add(chest22);
        (chest21.connections).add(chest28);
        (chest28.connections).add(chest35);
        (chest20.connections).add(chest21);
        (chest21.connections).add(chest20);
        (chest20.connections).add(chest21);
        (chest27.connections).add(chest28);
        (chest28.connections).add(chest27);
        (chest27.connections).add(chest20);
        (chest20.connections).add(chest27);
        (chest35.connections).add(chest22);
		(chest27.connections).add(chest34);
		(chest34.connections).add(chest58);
        (chest34.connections).add(chest32);
		(chest32.connections).add(chest46);
		(chest45.connections).add(chest46);
        (chest46.connections).add(chest45);
		(chest48.connections).add(chest41);
		(chest58.connections).add(chest34);
		(chest42.connections).add(chest51);
        (chest51.connections).add(chest42);
		(chest42.connections).add(chest35);
		(chest41.connections).add(chest42);
		(chest42.connections).add(chest49);
        (chest49.connections).add(chest42);
        (chest46.connections).add(chest48);
        (chest48.connections).add(chest58);
        (chest49.connections).add(chest50);
        (chest50.connections).add(chest49);
        (chest48.connections).add(chest50);
        (chest48.connections).add(chest53);
        (chest48.connections).add(chest53);
        (chest52.connections).add(chest49);
        (chest53.connections).add(chest54);
        (chest49.connections).add(chest52);
        (chest54.connections).add(chest52);
        (chest52.connections).add(chest54);
		(chest52.connections).add(chest55);
		(chest55.connections).add(chest56);
		(chest56.connections).add(chest57);

		current = elements.get(1);
		putArrows();
		while (true) repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Element element;
		
		for (int i = 0; i < elements.size(); i++) {
			element = elements.get(i);
			element.update();
			element.draw(g);
		}
	}
	
	public static void deleteArrows() {
		for (int i = 0; i < elements.size(); i++)
			if (! (elements.get(i) instanceof Arrow)) continue;
			else elements.remove(i--);
	}
	
	public static void DeleteArrows() {
//		current.visited = true;
//		Chest.draw();
		putArrows();
		deleteArrows();
	}
	
	public static void putArrows() {
		ArrayList<Element> connections;
		current.visited = true;
		connections = current.connections;
		deleteArrows();
		for (int i = 0; i < connections.size(); i++)
		elements.add(new Arrow("Arrow", current, connections.get(i)));
	}
}
