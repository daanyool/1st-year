public class SampleTesting {
   public static void main(String[] args) {
      char[] chr = new char[5];
      chr[0] = 'E';
      chr[1] = 'D';
      chr[2] = 'C';
      chr[3] = 'B';
      chr[4] = 'A';
      int counter = 0;
      
      System.out.println("char length: " + chr.length);
      
      for(int a = chr.length; a>=0; a--) {
         for(int b = counter; b<chr.length; b++) {
            System.out.print(chr[b] + " ");
         }
         System.out.println();
         counter++;
      }
   }
}