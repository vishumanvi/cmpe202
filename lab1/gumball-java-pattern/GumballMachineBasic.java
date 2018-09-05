
/**
 * This is a specific implementation of GumballMachine abstract class that costs 25 cents per gumball and 
 * accepts only 1 quarter.
 *
 * Vishwanath Manvi
 * 1.0 - 9/4/18
 */

public class GumballMachineBasic extends GumballMachine
{

    // Constructor that initializes all states and inventory
    public GumballMachineBasic(int numberGumballs) {
        soldOutState = new SoldOutState(this); 
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } 
    }
 
    // This method checks if coin inserted is a quarter and return right state if found.
    public State getHasQuarterState(int coin) {
        if (coin == 25)
            return hasQuarterState;
        else
            return noQuarterState;
    }
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball Inc. - Basic");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }

}
