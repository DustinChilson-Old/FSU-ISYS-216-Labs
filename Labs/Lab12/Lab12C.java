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
public class Lab12C {
  public static void main(String[] args) {
    while (true) {
      System.out.println("::::::::::::::::::::::::::::::::::::::");
      System.out.println("You may withdraw from 1 to 500 dollars");
      System.out.println("A request for 0 dollars will exit");
      System.out.print("Enter withdrawal amount: ");
      int amount = Utility.readInt();
      if (amount == 0) {
        break;    // Terminate
      } else if (amount < 0 || amount > 500) {
        System.out.println("Invalid withdrawal amount");
        continue;    // Start over
      }
      else {
        int twenties = 0;
        int tens = 0;
        int fives = 0;
        int ones = 0;
        for (; amount >= 20; amount-= 20) {
          twenties++;
        }
        for (; amount >= 10; amount-= 10) {
          tens++;
        }
        for (; amount >= 5; amount-= 5) {
          fives++;
        }
        for (; amount >= 1; amount--) {
          ones++;
        }
        System.out.println("Twenties: " + twenties);
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Ones: " + ones);
        continue;    // Start over
      }
    }
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

