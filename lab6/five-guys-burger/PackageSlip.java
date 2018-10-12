
/**
 * Write a description of class PackageSlip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PackageSlip implements PrintOrder
{
     /**
     * Constructor for objects of class PackageSlip
     */
    public PackageSlip()
    {

    }
    
     public Component printingSequence() {
        Composite packageSlip = new Composite( "PackageSlip" ) ;
        
        CustomBurger customBurger = new CustomBurger( "LBB" ) ;
        Bacon b = new Bacon("{{{Bacon}}}");
        Lettuce l = new Lettuce("Lettuce");
        Tomato t = new Tomato("Tomato");
        GrilledOnion go = new GrilledOnion("->|G Onion");
        GrilledJalapeno gj = new GrilledJalapeno("->|G Jalapeno");
        Fries f = new Fries("LTL CAJ");
        
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

