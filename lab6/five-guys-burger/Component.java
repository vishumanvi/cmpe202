  

public interface Component {

     void printDescription() ;
     void printPrice() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);

}
 
