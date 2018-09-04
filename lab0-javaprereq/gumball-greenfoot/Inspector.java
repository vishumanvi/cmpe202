import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien {
    
    public Inspector() {
        this.alienType = "Inspector";
    }   
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public String getAlienType() {
        return (this.alienType);
    }
    
    public boolean validateCoin(String denomination) {
        if (denomination == "Quarter") return true;
        else return false;  
    }
    
    public void move(int X, int Y) {
        Greenfoot.delay(50);
        setLocation(X-50, Y);
    }
    
    public String selectPicker(ArrayList <BlueGumball>blueGumballs,ArrayList <GreenGumball> greenGumballs,ArrayList <RedGumball> redGumballs) {
        String selectedPicker;
        int randomNo;
        if (greenGumballs.isEmpty())
            selectedPicker = "RandomPicker";
        else {
            randomNo = Greenfoot.getRandomNumber(2);
            System.out.println("Random No is : " + randomNo);
            if (randomNo == 1)
                selectedPicker = "RandomPicker";
            else
                selectedPicker = "GreenPicker";
        }
        return (selectedPicker);
    }
        
}
