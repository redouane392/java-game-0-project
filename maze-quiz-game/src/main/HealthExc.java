package main;


public class HealthExc extends Exception{
    
    /**
    * Custom created exception to handle the 'health' value of the character
    * @param String the message to display
    * @see Exceptions
    */
    public HealthExc(String message){
        super(message);
        Logger.message=message;
        Game.DeleteArrows();
    }
}
