package main;

public class LabelExc extends Exception{
    
    /**
    * Custom created exception to manage the 'label' value of the tile
    * @param String the message to display
    * @see Exceptions
    */
    public LabelExc(String message){
        super(message);
        Logger.message=message;
        //System.out.println(message);
    }
}
