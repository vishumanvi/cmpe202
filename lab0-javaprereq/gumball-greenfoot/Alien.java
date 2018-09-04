import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Alien extends Actor {
    String alienType;
    
    public Alien() {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }

    abstract public void act();

    abstract String getAlienType();
    
}
