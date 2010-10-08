/**
 *
 * @author dustinchilson
 * @creation_date Jan 24, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
import java.io.*;
public class Lab11C {
  public static void main(String[] args) {
    int number = 0;
    int total = 0;
    do {
      System.out.print("Enter a number or 0 to quit: ");
      number = Utility.readInt();
      System.out.println("You entered: " + number);
      if (number != 0) {
        total += number;
        System.out.println("Total is now " + total);
      }
    } while (number != 0);
    System.out.println("Processing complete");
  }
}

class Utility {
  public static int readInt() {
    BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
    Integer result = null;
    while (result == null) {
      try {
        result = new Integer(kb.readLine());
      }
      catch(Exception err) {
        System.out.print("ERROR! Please try again: ");
      }
    }
    return result.intValue();
  }
}
