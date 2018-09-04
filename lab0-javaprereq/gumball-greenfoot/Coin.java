import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Coin extends Actor {
    
    public String denomination;
    
    public void act() {
        int mouseX, mouseY ;
        boolean isCoinTouchingGM;
        int X, Y;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();
            setLocation(mouseX, mouseY);
        }
    }
        
    public boolean checkifTouchingGM() {
        return (isTouching(GumballMachine.class));
    }   
    
    public GumballMachine getGumballMachine() {
            GumballWorld gumWorld = getWorldOfType(GumballWorld.class);
            List <GumballMachine> gumBallMachines;
            GumballMachine gumBallMachine;
            gumBallMachines = gumWorld.getObjects(GumballMachine.class);
            gumBallMachine = gumBallMachines.get(0);
            return gumBallMachine;
    }
      
     
        
    abstract String getDenomination();

}
