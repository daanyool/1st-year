import java.io.* ;

public class SumOfEachColumns {
  public static void main ( String[] args ) {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    int maxColumns = 0;       
        
    for ( int row=0; row < data.length; row++) {
      if(data[row].length> maxColumns) {
         maxColumns = data[row].length;
      }
    }
    
      int[] sumColumns = new int[maxColumns];
      
      for(int row = 0; row < data.length; row++) {
         for ( int col=0; col < data[row].length; col++) {
            sumColumns[col] += data[row][col];
         }
      }
      
      for(int col = 0; col < sumColumns.length; col++) {
         System.out.println("Sum for col " + col + " is " + sumColumns[col]);
      }   
  }
}      