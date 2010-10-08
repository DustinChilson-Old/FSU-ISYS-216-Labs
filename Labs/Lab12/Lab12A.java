/**
 *
 * @author dustinchilson
 * @creation_date Jan 24, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab12A {
  public static void main(String[] args) {
    char theChar = 'a';
    while (true) {
      System.out.println(theChar);

      if (theChar == 'z') {
          break;
      }

      theChar++;
    }
    System.out.println("Processing complete");
  }
}

