import java.util.*;
import java.io.*;

public class Names {
  public static String Mothername(){
    String MotherName = null;
    int MotherIndex = (int) (Math.random()*1000);
    int i = 0;
     try {
       File Mother = new File("GirlNames.txt");
       Scanner Mother1 = new Scanner(Mother);
      while (MotherIndex > i){
        MotherName = Mother1.nextLine();
        i++;
      }
     }
     catch (FileNotFoundException Name) {
         System.out.println("Exception occurred");
      }
      return MotherName;
  }

  public static String Fathername(){
    int i = 0;
    int FatherIndex = (int) (Math.random()*1000);
    String FatherName = null;
      try {
      File Father = new File("BoyNames.txt");
      Scanner Father1 = new Scanner(Father);
      while (FatherIndex > i){
        FatherName = Father1.nextLine();
        i++;
      }
     }
     catch (FileNotFoundException Name) {
         System.out.println("Exception occurred");
      }

      return FatherName;
  }
}