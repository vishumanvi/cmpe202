
/**
 * This is a specific implementation of GumballMachine abstract class that costs 50 cents per gumball and 
 * accepts only 2 quarters.
 *
 * Vishwanath Manvi
 * 1.0 - 9/4/18
 */
public class GumballMachineFancy extends GumballMachine {
    int totalCoinsValue; //total value of all the coins currently inserted into gumball machine.
    /**
     * Constructor for objects of class GumballMachineFancy
     */
    
    public GumballMachineFancy(int size) {
        this.num_gumballs = size;
        this.has_quarter = false;
        this.totalCoinsValue = 0;
    }

    public void insertQuarter(int coin) {
        
        if (coin == 25)
            totalCoinsValue += coin;
        
        if ( totalCoinsValue == 50)
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank() {
        
        if ( this.has_quarter ) {
            
            totalCoinsValue = 0; //reset coins in the Gumball machine
            
            if ( this.num_gumballs > 0 ) {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
            }
            else {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
            }
        }
        else
            System.out.println( "Please insert 2 quarters." ) ;      
    }
}
