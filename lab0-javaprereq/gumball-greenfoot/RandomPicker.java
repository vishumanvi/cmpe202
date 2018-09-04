import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    public RandomPicker() {
        this.alienType = "RandomPicker";
    }
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }  
    
    public String getAlienType() {
        return (this.alienType);
    }
    
    public Gumball pickGumball(ArrayList <GreenGumball> greenGumballs,ArrayList <BlueGumball> blueGumballs,ArrayList <RedGumball> redGumballs ) { 
        
        Gumball gumball = null;
        int randomNo;
        int totalGumballs;  
            try {
                totalGumballs = greenGumballs.size() + blueGumballs.size() + redGumballs.size();
                do{
                randomNo = Greenfoot.getRandomNumber(3);
                switch (randomNo) {
                    case 0: //green
                        if (!greenGumballs.isEmpty())
                            gumball = greenGumballs.remove(0);
                        break;
                    case 1: // blue
                        if (!blueGumballs.isEmpty())
                            gumball = blueGumballs.remove(0);
                        break;
                    case 2: //red
                        if (!redGumballs.isEmpty())
                            gumball = redGumballs.remove(0);
                        break;
                }
            } while (totalGumballs > 0 && gumball == null);
          //return gumball;
        } catch (Exception ex) {
          System.out.println("Caught exception!");
        }
       finally {
           return gumball;
        }
    }
}
    
 
