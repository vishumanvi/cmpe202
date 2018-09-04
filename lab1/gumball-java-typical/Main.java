

public class Main {

    public static void main(String[] args) {

        GumballMachine gumballMachine1 = new GumballMachineBasic(5);    // 25 cents/gumball, accepts quarters only
        GumballMachine gumballMachine2 = new GumballMachineFancy(5);    // 50 cents/gumball, accepts quarters or 50 cents coins
        GumballMachine gumballMachine3 = new GumballMachineFancyAdv(5); // 50 cents/gumball, accepts coins of any denomination

        System.out.println(gumballMachine1);
        System.out.println(gumballMachine2);
        System.out.println(gumballMachine3);
        
        // no gumballs as denominations are other than 25 or 50
        gumballMachine1.insertQuarter( 5 );
        gumballMachine1.turnCrank();
        
        System.out.println(gumballMachine1);
        
        gumballMachine1.insertQuarter( 25 );
        gumballMachine1.turnCrank();
        
        System.out.println(gumballMachine1);
        
        gumballMachine1.insertQuarter( 50 );
        gumballMachine1.turnCrank();
        
        System.out.println(gumballMachine2);
        
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.turnCrank();
        
        System.out.println(gumballMachine2);
        
        gumballMachine2.insertQuarter( 50 );
        gumballMachine2.turnCrank();
        
        System.out.println(gumballMachine2);
       
        // no gumballs as denominations are other than 25 or 50
        gumballMachine2.insertQuarter( 10 );
        gumballMachine2.insertQuarter( 5 );
        gumballMachine2.insertQuarter( 10 );
        gumballMachine2.insertQuarter( 25);
        gumballMachine2.turnCrank();
        
        System.out.println(gumballMachine3);

        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.turnCrank();
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.insertQuarter( 5 );
        
        gumballMachine3.turnCrank();
        
        System.out.println(gumballMachine3);

        gumballMachine3.insertQuarter( 50 );
        gumballMachine3.turnCrank();
        
        gumballMachine3.insertQuarter( 25 );
        gumballMachine3.insertQuarter( 25 );
        gumballMachine3.turnCrank();
        
        System.out.println(gumballMachine3);
        
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.insertQuarter( 10 );
     
        gumballMachine3.turnCrank();
        
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.turnCrank();
        
        System.out.println(gumballMachine3);
        
        
        
    }
}
