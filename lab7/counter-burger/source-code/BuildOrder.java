  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

       // order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        
 
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( pc ) ;
        
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes"} ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 sauce free, extra +.50
        
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        
                        
        Sides si = new Sides( "Sides Options" ) ;
        String[] sio = { "Shoestring Fries" } ;
        si.setOptions( sio ) ;
        si.wrapDecorator( s ) ;

        
        Bun bu = new Bun( "Bun Options" ) ;
        String[] buo = { "Ciabatta Vegan" } ;
        bu.setOptions( buo ) ;
        bu.wrapDecorator( si ) ;    
        

        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( si ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;        
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( s ) ;        
        customBurger.addChild( bu ) ;
        customBurger.addChild( si ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }
    
     public static Component getOrder2()
    {
        Composite order = new Composite( "Order" ) ;
       // order.addChild(new Leaf("Shoestring Fries", 3.00 ));
       // order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Haromone & Antibiotic Free Beef", "1/3lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        
 
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Smoked Gouda", "Greek Feta" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Fresh Mozzarella" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Crushed Peanuts"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( pc ) ;
        
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = {"Marinated Tomatoes","Sunny Side Up Egg"} ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 sauce free, extra +.50
        
        Bun bu = new Bun( "Bun Options" ) ;
        String[] buo = { "Gluten Free Bun" } ;
        bu.setOptions( buo ) ;
        bu.wrapDecorator( p ) ;

        Sides si = new Sides( "Sides Options" ) ;
        String[] sio = { "Shoestring Fries" } ;
        si.setOptions( sio ) ;
        si.wrapDecorator( bu ) ;
        
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Habenero Salsa" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( si ) ;
 
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( si ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;        
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( s ) ;        
        customBurger.addChild( bu ) ;
        customBurger.addChild( si ) ;
        
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/