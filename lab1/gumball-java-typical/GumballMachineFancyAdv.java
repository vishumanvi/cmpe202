
/**
 * This is a specific implementation of GumballMachine abstract class that costs 50 cents per gumball and 
 * accepts coins of any of the following denominations (nickel, dime and quarters)
 *
 * Vishwanath Manvi
 * 1.0 - 9/4/18
 */
public class GumballMachineFancyAdv extends GumballMachine {

    int totalCoinsValue; //total value of all the coins currently inserted into gumball machine.

    /**
     * Constructor for objects of class GumballMachineFancyAdv
     */
    public GumballMachineFancyAdv(int size) {
        num_gumballs = size;
        has_quarter = false;
    }

    public void insertQuarter(int coin) {     
        //accept only coins of following denominations mentioned in problem stmt - nickel, dime and quarters
        if (coin == 5 || coin == 10 || coin == 25)
            totalCoinsValue += coin;
            
        if ( totalCoinsValue >= 50)
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank() {

        if ( this.has_quarter ) {
            totalCoinsValue = 0; //reset coins in gumball machine
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
            }
        }
        else
            System.out.println( "Please insert 50 cents." ) ;
    }      
    
}
