  
import java.text.DecimalFormat;

public class Client {

    public static void main(String[] args)
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        double totalPrice = 0;
        Component customerReceipt, packingSlip;
        CustomerReceipt cp = new CustomerReceipt();
        customerReceipt = cp.printingSequence() ;
        customerReceipt.printDescription();
        totalPrice = customerReceipt.getPrice();
        System.out.println("\n   Total Price: "+ fmt.format(totalPrice));
        
        System.out.println("\n\n\n");
        PackingSlip ps = new PackingSlip();
        packingSlip = ps.printingSequence() ;
        packingSlip.printDescription();
        


    }
}
 
