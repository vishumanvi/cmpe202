import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penny here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penny extends Coin {   

    public Penny() {
       GreenfootImage image = getImage() ;
       image.scale( 50, 50 ) ;  
       this.denomination = "Penny";
    }

    public void act() {
        
 //       if (Greenfoot.mouseDragged(this)) {
        
            if (checkifTouchingGM()) {
                GumballMachine gumballMachine;
                gumballMachine = getGumballMachine();
                gumballMachine.insertCoin(this.denomination);
                GumballWorld gumWorld = getWorldOfType(GumballWorld.class);
                gumWorld.removeObject(this);
            }
 //       }
    }
    
    public String getDenomination() {
        return (this.denomination);
    }  
    
   
      
  
    
}
