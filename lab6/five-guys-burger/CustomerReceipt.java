
/**
 * Write a description of class CustomerReceipt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerReceipt implements PrintOrder
{
    // instance variables - replace the example below with your own
    public CustomerReceipt()
    {
    }
    
    public Component printingSequence() {
        Composite customerReceipt = new Composite( "CustomerReceipt" ) ;
        
        CustomBurger customBurger = new CustomBurger( "LBB",5.59 ) ;
        //Burger bu = new Burger("LBB",5.59);
        Bacon b = new Bacon("{{{Bacon}}}");
        Lettuce l = new Lettuce("Lettuce");
        Tomato t = new Tomato("Tomato");
        GrilledOnion go = new GrilledOnion("->|G Onion");
        GrilledJalapeno gj = new GrilledJalapeno("->|G Jalapeno");
        Fries f = new Fries("LTL CAJ",2.79);
        
        customerReceipt.addChild( customBurger ) ;
        
        customBurger.addChild( b ) ;
        customBurger.addChild( l ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( go ) ;
        customBurger.addChild( gj ) ;
        
        customerReceipt.addChild(f);
        
        return customerReceipt;

    }

 }
