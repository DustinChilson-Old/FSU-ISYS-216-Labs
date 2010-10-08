/**
 *
 * @author dustinchilson
 * @creation_date Jan 24, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab11B {
  public static void main(String[] args) {
      int dn = 99;
      int up = 1;
      do {
        dn--;
        up++;
        System.out.println("up = " + up + ", dn = " + dn);
      } while (up <= dn);
      System.out.println("Processing complete");
  }
}

