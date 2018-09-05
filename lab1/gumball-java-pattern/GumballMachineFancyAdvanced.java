
/**
 * This is a specific implementation of GumballMachine abstract class that costs 50 cents per gumball and 
 * accepts coins of any of the following denominations (nickel, dime and quarters)
 *
 * Vishwanath Manvi
 * 1.0 - 9/4/18
 */

public class GumballMachineFancyAdvanced extends GumballMachine
{
   // this attribute holds total value of all coins inserted into the machine
   private int totalCoinValue;

   // Constructor that initializes all states and inventory
   public GumballMachineFancyAdvanced(int numberGumballs) {
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
    
    // This method returns hasQuarterState if nickels, dimes and quarters worth 50 cents are  are inserted.
    public State getHasQuarterState(int coin) {
        totalCoinValue += coin;
        if (totalCoinValue >= 50 && (coin == 5 || coin == 10 || coin == 25)) {
            totalCoinValue = 0;
            return hasQuarterState;
        }
        else
            return noQuarterState;
    }
    
     public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball Inc. - Fancy and Advanced");
        result.append("\nJava-enabled Standing Gumball Model #2012");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
