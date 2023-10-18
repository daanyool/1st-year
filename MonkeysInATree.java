public class MonkeysInATree {
  public static void main(String[] args) {
    String num = " ";
    
    for(int monk = 5; monk>=0; monk--) {
      if(monk==5)
        num = "Five";
      else if(monk==4)
        num = "Four";
      else if(monk==3)
        num = "Three";
      else if(monk==2)
        num = "Two";
      else if(monk==1)
        num = "One";
      else if(monk==0)
        num = "No";
        
      if(monk>0)
        System.out.println(num + " little monkeys swinging in a tree \nTeasing Mr Crocodile \"you can't catch me\" \nAlong came the crocodile as quiet as can be \nand SNAP!\n");
      else
        System.out.println(num + " little monkeys swinging in a tree \n" + num + " little monkeys swinging in a tree");
    }
  }
}