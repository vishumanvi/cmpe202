import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FakeQuarter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FakeQuarter extends Quarter
{

    public FakeQuarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 75, 75 ) ;
        this.denomination = "Fake";
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
