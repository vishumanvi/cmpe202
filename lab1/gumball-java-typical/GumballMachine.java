/**
 * This is a abstract class implementation of GumballMachine that holds no of gumballs and hasquarter state along 
 * with defining required methods by its subclasses.
 *
 * Vishwanath Manvi
 * 1.0 - 9/4/18
 */

public abstract class GumballMachine {
    int num_gumballs;
    boolean has_quarter;
        
    abstract void insertQuarter(int coin); //subclass needs to implement this method.
    abstract void turnCrank(); //subclass needs to implement this method.
    
}
