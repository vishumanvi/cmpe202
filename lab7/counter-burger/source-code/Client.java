  

public class Client {

    public static void runTest()
    {
        Component theOrder = BuildOrder.getOrder() ;
        theOrder.printDescription();
        System.out.println("\n\n");
        Component theOrder2 = BuildOrder.getOrder2() ;
        theOrder2.printDescription();

    }
}
 
