 

import java.util.ArrayList;

public class DataSet {

    private int[] data = new int[12];
    private SortingStrategy strategy;

    public DataSet()
    {

        resetData();

        SortingStrategy bubbleSortStrategy = (data) -> { 
                for (int i = data.length; --i>=0; ) {
                    boolean flipped = false;
                    for (int j = 0; j<i; j++) {
                        if (data[j] > data[j+1]) {
                            int T = data[j];
                            data[j] = data[j+1];
                            data[j+1] = T;
                            flipped = true;
                        }
                    }
                    if (!flipped) {
                        return;
                    }
                }
               
         //       return data;
        
        };

        strategy = bubbleSortStrategy;
     
    }
     
    public void doSort() {
        try {
            strategy.sort( data );
            System.out.println( "List sorted with " + strategy.toString() );
        } catch ( Exception e )
        {
            System.out.println( e.toString() );
        }
    }
     
    public void display() {
        System.out.println( "List is " );
        for ( int i = 0; i < 12; i++ )
        
            System.out.println( data[i] );
    }
     
    public void resetData() {
        data[0] = 198;
        data[1] = 56 ;
        data[2] =  56   ;
        data[3] = 12   ;
        data[4] = 34   ;
        data[5] = 62   ;
        data[6] = 99   ;
        data[7] = 145   ;
        data[8] = 87   ;
        data[9] = 26   ;
        data[10] = 37   ;
        data[11] = 13   ;
    }
     
    public void changeStrategy() {
        SortingStrategy mergeSortStrategy = (data) -> { 
            
        int temp;
        for (int i = 1; i < data.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(data[j] < data[j-1]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
               
    };
    strategy = mergeSortStrategy;
}
    
    public static void main( String[] args)
    {
        DataSet dataset = new DataSet() ; // defaults to BubbleSort
        dataset.display();
        dataset.doSort();
        dataset.display();
        dataset.resetData();
        dataset.display();
        dataset.changeStrategy();       //changes to InsertionSort
        dataset.doSort();
        dataset.display();
    }
     
}
 
