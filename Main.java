import java.util.*;


public class Main {
  public static void main(String[]args){
    String Option2;

    boolean IsDead = false;
    MainMenu.mainMenu();
  while (IsDead != true){
    Options.Options();

    Scanner Scan = new Scanner(System.in);
    
    String Option = new String(Scan.nextLine());

    Option = Option.toUpperCase();
    
    if (Option.equals("A")){
      Options.OptionA();

      Option2 = Scan.nextLine();

      Option2 = Option2.toUpperCase();

      if (Option2.equals("A"))
      {
        double ChanceA2 = Math.random();
        if (ChanceA2>.5){
           System.out.println("You Decided to Study Harder and Your Smarts Went up");
         }
         else {
           System.out.println("You were too lazy and didnt study. Your Smarts Went down");
         }
    }
      else if (Option.equals("E")){
      Options.OptionE();
      }
    }
  }
  }
}