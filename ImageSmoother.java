import java.io.* ;

public class ImageSmoother
{

  public static void main ( String[] args )
  {
    int[][] image  = {{0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0}};

    // assume a rectangular image
    int[][] smooth = new int[ image.length ][ image[0].length ];
    
    // Compute the smoothed value for 
    // non-edge locations in the image.

    for ( int row=1; row<image.length-1; row++ )
    {
      for ( int col=1; col<image[row].length-1; col++ )
      {
      int sum = image[row-1][col-1] + image[row-1][col] + image[row-1][col+1] +
                image[row][col-1] + image[row][col] + image[row][col+1] +
                image[row+1][col-1] + image[row+1][col] + image[row+1][col+1];
                     
         smooth[row][col] = sum/9;
      }
    }
      
    // write out the input
    for (int row = 0; row < smooth.length; row++) {
       for (int col = 0; col < smooth[row].length; col++) {
          System.out.print(image[row][col] + " ");
       }
        System.out.println();
    }
    System.out.println("\nThe output: ");

    // write out the result
    for (int row = 0; row < smooth.length; row++) {
       for (int col = 0; col < smooth[row].length; col++) {
          System.out.print(smooth[row][col] + " ");
       }
       System.out.println();
    }
  }
}      