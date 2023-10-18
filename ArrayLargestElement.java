import java.io.* ;

public class ArrayLargestElement {
  public static void main ( String[] args ) {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    // declare and initialize the max and the min
    int max = 0;
    
    //  
    for ( int row=0; row < data.length; row++) {
      max = 0;
      for ( int col=0; col < data[row].length; col++) {
         if(data[row][col] > max)
            max = data[row][col];    
      }
      System.out.println( "max in row " + row + " = " + max);
    }
  }
}  