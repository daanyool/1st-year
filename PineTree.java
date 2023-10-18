public class PineTree { 
  public static void main(String[] args) {
    int height = 8;
    
    for(int row = 0; row<height; row++) {
      for(int space = height - row; space>0; space--) {
        System.out.print(" ");
      }
      for(int star = 0; star<row*2+1; star++) {
        System.out.print("*");
      }
      System.out.println();
      }
    for(int i = 0; i<3; i++) {
      for(int j = 0; j<height-2; j++) {
        System.out.print(" ");
      }
      System.out.println(" ***");
    }
  }
}
