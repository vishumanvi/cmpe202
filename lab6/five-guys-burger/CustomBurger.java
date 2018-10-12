
import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    
    public CustomBurger ()
    {

    }
    
    public CustomBurger ( String d )
    {
        super(d) ;
    }
    
    public CustomBurger ( String d, double p )
    {
        super(d,p) ;
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        if (price > 0)
            description = description + " " + String.valueOf(price);  
            
        System.out.println( description ) ;
        
        for (Component obj  : components)
        {
            obj.printDescription();
            
        }
    }

 
}

       