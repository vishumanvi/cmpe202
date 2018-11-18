 

public class Tester {

    public static void main( String[] args)
    {
        DataSet dataset = new DataSet() ; // defaults to BubbleSort
        dataset.display();
        dataset.doSort();
        dataset.display();
        dataset.resetData();
        dataset.display();
        dataset.changeStrategy( new InsertionSort() );
        dataset.doSort();
        dataset.display();
    }
 
}
 
