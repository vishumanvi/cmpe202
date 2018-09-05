

/**
 * This is a specific implementation of GumballMachine abstract class that costs 50 cents per gumball and 
 * accepts only 2 quarters.
 *
 * Vishwanath Manvi
 * 1.0 - 9/4/18
 */

public class GumballMachineFancy extends GumballMachine
{
 // this attribute holds total value of all coins inserted into the machine
 private int totalCoinValue;

 // Constructor that initializes all states and inventory
 public GumballMachineFancy(int numberGumballs) {
        soldOutState = new SoldOutState(this); 
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        totalCoinValue = 0;

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } 
 }

 // This method returns hasQuarterState only if 2 quarters are inserted.
 public State getHasQuarterState(int coin) {
        totalCoinValue += coin;
        if (totalCoinValue == 50 && coin == 25) {
            totalCoinValue = 0;
            return hasQuarterState;
        }
        else
            return noQuarterState;
    }
    
 public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball Inc. - Fancy");
        result.append("\nJava-enabled Standing Gumball Model #2008");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }

}
