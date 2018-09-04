import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor {
    ArrayList <BlueGumball> blueGumballs = new ArrayList();
    ArrayList <GreenGumball> greenGumballs = new ArrayList();
    ArrayList <RedGumball> redGumballs = new ArrayList();
    Gumball luckyGumball;
   
    Inspector inspectorAlien;
    Picker selectedPicker;
    RandomPicker randomPickerAlien;
    GreenPicker greenPickerAlien;
    boolean isGreenGumballsEmpty;
    Integer totalGumballsLeft;
    
    String coinInserted;
    
    boolean isCoinValid;
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 );
        coinInserted = "None";
        isCoinValid = false;
        fillGumballs();
        isGreenGumballsEmpty = false;
        totalGumballsLeft = greenGumballs.size() + blueGumballs.size() + redGumballs.size();
   
    }

    public void act() 
    {
        // Add your action code here.
        GumballWorld gumWorld = getWorldOfType(GumballWorld.class);
        if (totalGumballsLeft == 0) {
            gumWorld.showText("Sorry, out of gumballs", getX(), getY()-200);
            return;
        } else {
            gumWorld.showText(Integer.toString(totalGumballsLeft), getX(), getY()-200);
        }
        
        if (Greenfoot.mouseClicked(this)) {
            
            List <Inspector> inspectorPickers;
            List <GreenPicker> greenPickers;
            List <RandomPicker> randomPickers;
         
            inspectorPickers = gumWorld.getObjects(Inspector.class);
            inspectorAlien = inspectorPickers.get(0);
            
            greenPickers = gumWorld.getObjects(GreenPicker.class);
            greenPickerAlien = greenPickers.get(0);
            
            randomPickers = gumWorld.getObjects(RandomPicker.class);
            randomPickerAlien = randomPickers.get(0);
       
            inspectorAlien = inspectorPickers.get(0);
        
            crank();

        }
        
    }   
    
    public void insertCoin(String denomination) {
        int X, Y;
        setCoin(denomination);
        X = getX();
        Y = getY();
        GumballWorld gumWorld = getWorldOfType(GumballWorld.class);
        gumWorld.showText("have coin",X,Y);
    }
    
    public void setCoin(String denomination) {
        coinInserted = denomination;
    } 
    
    public void clearCoin() {
        coinInserted = "None";
    }
    
    public void crank() {
        
       int randomNo;
       String selectedPicker;
       GumballWorld gumWorld = getWorldOfType(GumballWorld.class);
 
       GreenGumball greenGumball = new GreenGumball();
       Gumball gumball = null;

       isCoinValid = inspectorAlien.validateCoin(coinInserted);
       
    //   if (outOfGumballs == true)
    //    gumWorld.showText("Sorry, out of gumballs", getX(), getY()-200);
        
       if (!isCoinValid) {
            System.out.println("Invalid coin. No gumballs for you!");
            gumWorld.showText("", getX(), getY());
            return;
       }

       selectedPicker = inspectorAlien.selectPicker(blueGumballs,greenGumballs,redGumballs);
       
       
       
       System.out.println("Selected picker is " + selectedPicker);
            
       if (selectedPicker == "GreenPicker") { //green picker 
           inspectorAlien.move(686, 454);
           gumball = greenPickerAlien.pickGumball(greenGumballs);
        } else {                  //random picker
                inspectorAlien.move(643, 104);
                gumball = randomPickerAlien.pickGumball(greenGumballs, blueGumballs,redGumballs);
        }
        
       if (gumball == null) {
 //          outOfGumballs = true;
           gumWorld.showText("Sorry, out of gumballs", getX(), getY()-200);
           gumWorld.showText("",getX(),getY());
           inspectorAlien.move(643, 104);
           return;
        }
       inspectorAlien.move(533, 291);
       ejectGumball(gumball);
       
     
    }
       
    public void ejectGumball(Gumball gumball) {
        GumballWorld gumWorld = getWorldOfType(GumballWorld.class);
        gumWorld.addObject(gumball, getX(), getY() + 160);
        gumWorld.showText("",getX(),getY());

        totalGumballsLeft = redGumballs.size() + blueGumballs.size() + greenGumballs.size();
        gumWorld.showText(Integer.toString(totalGumballsLeft),getX(),getY()-200);
        Greenfoot.delay(100);
        gumWorld.removeObject(gumball);
        clearCoin();
    }
       
    
    public void fillGumballs() {
     
     BlueGumball b1 = new BlueGumball();
 //    BlueGumball b2 = new BlueGumball();
 //    BlueGumball b3 = new BlueGumball();

     blueGumballs.add(b1);
 //    blueGumballs.add(b2);
 //    blueGumballs.add(b3);
     
     GreenGumball g1 = new GreenGumball();
  //   GreenGumball g2 = new GreenGumball();
  //   GreenGumball g3 = new GreenGumball();
     
     greenGumballs.add(g1);
   //  greenGumballs.add(g2);
   //  greenGumballs.add(g3);
     
     RedGumball r1 = new RedGumball();
  //   RedGumball r2 = new RedGumball();
  //   RedGumball r3 = new RedGumball();
     
     redGumballs.add(r1);
  //   redGumballs.add(r2);
  //   redGumballs.add(r3); 
    }
   
}
