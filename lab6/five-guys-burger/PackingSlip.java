
/**
 * Write a description of class PackingSlip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PackingSlip implements PrintOrder
{
     /**
     * Constructor for objects of class PackageSlip
     */
    public PackingSlip()
    {

    }
    
     public Component printingSequence() {
        Composite packageSlip = new Composite( "Packing Slip" ) ;
        
        CustomBurger customBurger = new CustomBurger("1. LBB") ;
        Bacon b = new Bacon("{{{Bacon}}}");
        Lettuce l = new Lettuce("Lettuce");
        Tomato t = new Tomato("Tomato");
        GrilledOnion go = new GrilledOnion("->|G Onion");
        GrilledJalapeno gj = new GrilledJalapeno("->|G Jalapeno");
        Fries f = new Fries("1. LTL CAJ");
        
        packageSlip.addChild( customBurger );
        customBurger.addChild( l ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( go ) ;
        customBurger.addChild( gj ) ;
        customBurger.addChild( b ) ;
        packageSlip.addChild(f);
        
        return packageSlip;

    }
}

