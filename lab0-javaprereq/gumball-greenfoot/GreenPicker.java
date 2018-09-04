import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker {
    
    public GreenPicker() {
        this.alienType = "GreenPicker";
    }
    
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }    
    
    public String getAlienType() {
        return (this.alienType);
    }
    
    public Gumball pickGumball(ArrayList <GreenGumball> greenGumballs) {
        Gumball gumball = null;
        try {
            if (!greenGumballs.isEmpty())
                gumball = greenGumballs.remove(0);
        } catch (Exception ex) {
            System.out.println("Exception caught!");
        }
        finally {
            return(gumball);
        }

      //System.out.println("Caught Exception in pickGumball in GreenPicker")
}
    
}
