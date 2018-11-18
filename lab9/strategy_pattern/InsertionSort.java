
/**
 * Write a description of class InsertionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSort implements SortingStrategy
{
    // instance variables - replace the example below with your own
      public void sort(int a[])  throws Exception {
        int temp;
        for (int i = 1; i < a.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(a[j] < a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
}
