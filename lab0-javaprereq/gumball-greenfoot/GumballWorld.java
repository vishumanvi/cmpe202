import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballWorld extends World
{

    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 367, 237);
        Penny myPenny = new Penny();
        addObject( myPenny, 57, 71 ) ;
        Quarter myQuarter = new Quarter();
        addObject( myQuarter, 68, 156 ) ;
        
        Quarter2 myQuarter2 = new Quarter2();
        addObject( myQuarter2, 68, 250 ) ;
       
        Quarter3 myQuarter3 = new Quarter3();
        addObject( myQuarter3, 68, 350 ) ;
        
        Quarter4 myQuarter4 = new Quarter4();
        addObject( myQuarter4, 68, 450 ) ;
        
        FakeQuarter myfakeQuarter = new FakeQuarter();
        addObject( myfakeQuarter, 66, 550 ) ;

        Inspector inspector = new Inspector();
        addObject(inspector, 533, 291);
        showText("Inspector", 533, 220);
        RandomPicker randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(655, 94);
        showText("Random Picker", 655, 25);
        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        showText("Green Picker", 686, 380);
        greenpicker.setLocation(669, 456);
        
    }
    

    
    public void act() {
        
    }
}
