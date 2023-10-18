import java.util.Random;

public class RandomNames {
  public static void main(String[] args) {
    Random nameNum = new Random();
    String firstName = "", lastName = "";
    
    int firstNameInt = nameNum.nextInt(12);  //firstname
    switch(firstNameInt) {
      case 0: firstName = "Christian"; break;
      case 1: firstName = "Lionel"; break;
      case 2: firstName = "Angelo"; break;
      case 3: firstName = "Miguel"; break;
      case 4: firstName = "Karlyle"; break;
      case 5: firstName = "Ian"; break;
      case 6: firstName = "Cy"; break;
      case 7: firstName = "Aike"; break;
      case 8: firstName = "John"; break;
      case 9: firstName = "Ervin"; break;
      case 10: firstName = "Jiremel"; break;
      case 11: firstName = "Kerby"; break;
      case 12: firstName = "Mark"; break;
      }
    
    int lastNameInt = nameNum.nextInt(12);  //lastname
    switch(lastNameInt) {
      case 0: lastName = "Alfar"; break;
      case 1: lastName = "Generalao"; break;
      case 2: lastName = "Bayutas"; break;
      case 3: lastName = "Binghay"; break;
      case 4: lastName = "Indino"; break;
      case 5: lastName = "Labandero"; break;
      case 6: lastName = "Ortega"; break;
      case 7: lastName = "Maurin"; break;
      case 8: lastName = "Villar"; break;
      case 9: lastName = "Managaytay"; break;
      case 10: lastName = "Asilo"; break;
      case 11: lastName = "Cuizon"; break;
      case 12: firstName = "Baratbate"; break;
      }
    System.out.println("The name is: " + lastName + ", " + firstName);  //combination of lastname and firstname
    }
  }
