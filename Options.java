import java.util.*;

public class Options {
  static int Age = 0;

  public static void Options() {
    System.out.println("A --> Work and Education");
    System.out.println("B --> Relationships");
    System.out.println("C --> Cars and House");
    System.out.println("D --> Other");
    System.out.println("E --> Age");
  }

  public static void OptionA(){
      System.out.println("A --> Study Harder");
      System.out.println("B --> Drop Out of School");
      System.out.println("C --> Try and Bully Someone");
  }

  public static void OptionB() { 
    System.out.println("A --> Parents");
    System.out.println("B --> Spouse (WIP)");
  }

  public static void OptionC() {
    System.out.println("WIP");
  }

  public static void OptionD() {
    System.out.println("WIP");
  }

  public static void OptionE() {
    Age++;
  }

  public int GetAge() 
  {
    return Age;
  }

}