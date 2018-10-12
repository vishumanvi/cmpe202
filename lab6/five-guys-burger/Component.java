  

public interface Component {

     void printDescription() ;
     double getPrice() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);

}
 
