  

public class Client {

    public static void main(String[] args)
    {
        System.out.println("\n\n");
        Component customerReceipt, packageSlip;
        CustomerReceipt cp = new CustomerReceipt();
        customerReceipt = cp.printingSequence() ;
        customerReceipt.printDescription();
        
        System.out.println("\n\n");
        PackageSlip ps = new PackageSlip();
        packageSlip = ps.printingSequence() ;
        packageSlip.printDescription();
        


    }
}
 
