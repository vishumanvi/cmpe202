

public class Main {

    public static void main(String[] args) {
 
        //GumballMachineBasic is a gumball machine that accepts only 1 quarter.
        GumballMachine gumballMachine = new GumballMachineBasic(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
            
        // will not dispense gumball
        gumballMachine.insertQuarter(5);
        gumballMachine.turnCrank();
        
        // will not dispense gumball
        gumballMachine.insertQuarter(50);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        //GumballMachineFancy is a gumball machine that accepts only 2 quarters.
        GumballMachine gumballMachine2 = new GumballMachineFancy(5);

        System.out.println(gumballMachine2);

        // will not dispense gumball
        gumballMachine2.insertQuarter(25);
        gumballMachine2.turnCrank();

        System.out.println(gumballMachine2);
         
        gumballMachine2.insertQuarter(25);
        gumballMachine2.insertQuarter(25);
        gumballMachine2.turnCrank();


        System.out.println(gumballMachine2);
        
        /* GumballMachineFancyAdvanced is a gumball machine that accepts only 50 cents worth of nickels
         dimes and quarters.
        */

        GumballMachine gumballMachine3 = new GumballMachineFancyAdvanced(5);

        System.out.println(gumballMachine3);
        
        gumballMachine3.insertQuarter(5);
        gumballMachine3.insertQuarter(5);
        gumballMachine3.insertQuarter(5);
        gumballMachine3.insertQuarter(10);
        gumballMachine3.insertQuarter(25);
        gumballMachine3.turnCrank();
        
        System.out.println(gumballMachine3);

        gumballMachine3.insertQuarter(5);
        gumballMachine3.turnCrank();
        gumballMachine3.insertQuarter(25);
        gumballMachine3.insertQuarter(25);
        gumballMachine3.turnCrank();

        System.out.println(gumballMachine3);

    }
}
