import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Gumball extends Actor {
    String color;
    public Gumball() {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ; 
    }

    public void act() {
        // Add your action code here.
    }  
    
    abstract String getColor();
    
}
