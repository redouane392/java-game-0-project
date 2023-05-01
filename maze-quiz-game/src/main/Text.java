package main;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;



public class Text {
    
    enum Phrases{
    phrase1 ("The end is near my friend"),
    phrase2 ("Almost"),
    phrase3 ("Come on man"),
    phrase4 ("..."),
    phrase5 ("I've spent 240 hours coding this, just for you <3"),
    phrase6 ("Looking alive"),
    phrase7 ("Just a few more steps"),
    phrase8 ("If you die, then you are dead");
    private String text;
    Phrases(String a){
        this.text=a;}
    public String getText(){return text;}
    }
    
    enum Traps{
    trap1(1),
    trap2(2),
    trap3(3),
    trap4(5),
    trap5(5),
    trap6(6),
    trap7(7),
    trap8(8),
    trap9(9),
    trap10(10);
    private int dmg;
    Traps(int a){
        this.dmg=a;}
    public int getDmg(){return dmg;}
    }
    
    /**
    * A method which is called when the game starts to assign each tile a label.
    * @return <code>GetPhrase()</code> if we assigning a phrase, otherwise <code>GetTraps</code>.
    * @see Text#GetPhrase  
    * @see Text#GetTraps
    */
    String getInfo(){
        Random rand = new Random(); //instance of random class
        int random = rand.nextInt(2);
        
        switch(random){
            case 0: return getPhrase();
            default: return getTraps(); 
        }
    }
    
    
    
    /**
    * A method for getting the damage from the trap which is called inside of another method, when the game starts.The value is received from the enum
    * @return The <code>parameter</code> value from the enum 
    * @see Text#Traps
    */
    int getDmg(){
        Traps[] values = Traps.values();
        Random rand = new Random(); //instance of random class
        int random = rand.nextInt(values.length);
        int dmg=values[random].getDmg();
        return dmg;
    }
    
    /**
    * A method for getting the phrase to print from the trap which is called inside of another method, when the game starts.The value is received from the enum
    * @return The <code>parameter</code> value from the enum 
    * @see Phrases
    */
    String getPhrase(){
        Phrases[] values = Phrases.values();
        Random rand = new Random(); //instance of random class
        int random = rand.nextInt(values.length);
        String text=values[random].getText();
        return text;
    }
    
    /**
    * A method for getting a value to assign for the label variable, which is called inside of another method, when the game starts.The value is received from the enum
    * @return The <code>name</code> of the enum variable 
    * @see Traps
    */
    String getTraps(){
        Traps[] values = Traps.values();
        Random rand = new Random(); //instance of random class
        int random = rand.nextInt(values.length);
        String text=values[random].name();
        return text;
    }
    
}
