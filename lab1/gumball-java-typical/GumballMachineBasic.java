/**
 * This is a specific implementation of GumballMachine abstract class that costs 25 cents per gumball and 
 * accepts only 1 quarter.
 *
 * Vishwanath Manvi
 * 1.0 - 9/4/18
 */
public class GumballMachineBasic extends GumballMachine {

    public GumballMachineBasic( int size ) {
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin) {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank() {
    	if ( this.has_quarter ) {
    		if ( this.num_gumballs > 0 ) {
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    	}
    	else
    		System.out.println( "Please insert a quarter." ) ;    
    }
}
