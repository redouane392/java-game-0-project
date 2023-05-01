package main;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Arrow extends Element {
	public static final int DELTA = Game.UNIT_SIZE;
	private static BufferedImage image = null;
	
	static {
		try {
			image = ImageIO.read(Arrow.class.getResourceAsStream("/arrow.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String log ="Log = ";
    
	private double  rotation;
	private Element destination;
	private int current;
	/**
	 * Generate an X, Y that belongs to the surrounding circle of radius R.
	 * @param label
	 * @param source
	 * @param destination
	 */
	public Arrow(String label, Element source, Element destination) {
		super(-1, -1, label);
		int dx, dy;
		x = source.x + Integer.compare(destination.x, source.x) * DELTA;
		y = source.y + Integer.compare(destination.y, source.y) * DELTA;
		this.destination = destination;
		dx = destination.x - x;
		dy = destination.y - y;
		this.rotation = Math.acos((destination.x - x) / Math.sqrt(dx * dx + dy * dy));
		this.rotation*= (destination.y - y) >= 0 ? 1 : -1;
	
	}

	@Override
	public void update() {
		super.update();
		current = Game.UNIT_SIZE;
		current+= hovered ? 4: 0;
		
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		Graphics2D local;
		local = (Graphics2D) g.create();
		local.rotate(rotation, screenX + Game.UNIT_SIZE * 0.5, screenY + Game.UNIT_SIZE * 0.5);
		local.drawImage(image, screenX, screenY, current, current, null);
		local.dispose();
	}
	/**
         * A method which is called when this <code>Element</code> is clicked.
         * @param p the <i>parameter</i>.
         * @return <code>true</code> if something otherwise <code>false</code>.
         * @throws main.HealthExc
         * @throws main.LabelExc
         * @see Arrow#DELTA
         */
        @Override
	public void clicked () throws HealthExc, LabelExc {
		Game.current = destination;
		Logger.message = destination.label;
        log = log + " " + destination.label;
		try {
        Text.Traps trap;
        trap = Text.Traps.valueOf(Game.current.label);
        
        if(!Game.current.GetV()){
            Game.health -= trap.getDmg();}
        } catch (IllegalArgumentException e) {
        } finally {
            String msg = "Checking neighbours";
            System.out.println(msg);
        }
        
        try{
            if (Game.health < 0) throw new HealthExc("HEALTH IS 0, U DEAD");
            if ((Game.current.label).equals("YOU WIN")) throw new LabelExc("YOU WON");
        }
        catch(HealthExc | LabelExc ex){
                Game.health=0;
                writeText();
                
        }
        
        if (Game.health==0){
        	
            Game.DeleteArrows();
        }
        else{Game.putArrows();}
	}
        
        /**
         * A method which is called to write the data into the file
         * @see File
         */
        private void writeText(){
            try {
                File myObj = new File("filename.txt");
                if (myObj.createNewFile()) {
                    Logger.message="Saving your travel path to a file: ";
                    try {
                        FileWriter myWriter = new FileWriter("filename.txt");
                        myWriter.write(log);
                        new FileWriter("filename.txt", false).close();
                        //myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    
                    
                    
                    
                } else {
                    myObj.delete();
                    File myObj1 = new File("filename.txt");
                    Logger.message="Saving your travel path to a file: ";
                    try {
                        FileWriter myWriter = new FileWriter("filename.txt");
                        myWriter.write(log);
                        //new FileWriter("filename.txt", false).close();
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            
        
        
        };
}
