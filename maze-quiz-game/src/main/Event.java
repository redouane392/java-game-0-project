package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Event { 
    
        /**
        * A method for checking the neighboring tiles for having a traps 
        * @return The <code>number</code> of neighboring tiles that have traps 
        * @see Chest#label
        */
		
	void GetN(){
        int num=0;
        for (Element neighbor: ((Game.current).connections)) {
            try {
                Text.Traps trap;
                trap = Text.Traps.valueOf(neighbor.label);
                num += 1;
            } catch (IllegalArgumentException e) {
            } finally {
            String msg = "Checking neighbours";
            System.out.println(msg);
            }
            String text="Number of dead neighbours - "+num;
            Logger.message=text;
            }
    }
}
