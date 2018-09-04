import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quarter4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quarter4 extends Coin {

    public Quarter4() {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ; 
        this.denomination = "Quarter";
    }
  
    public void act() {
        
        if (checkifTouchingGM()) {
            GumballMachine gumballMachine;
            gumballMachine = getGumballMachine();
            gumballMachine.insertCoin(this.denomination);
            GumballWorld gumWorld = getWorldOfType(GumballWorld.class);
            gumWorld.removeObject(this);
            
        }
    }
    
   public String getDenomination() {
        return (this.denomination);
    }
}
