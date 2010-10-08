/**
 *
 * @author dustinchilson
 * @creation_date Jan 24, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab11A {
  public static void main(String[] args) {
      int dn = 99;
      int up = 1;
      while (up <= dn) {
        dn--;
        up++;
        System.out.println("up = " + up + ", dn = " + dn);
      }
      System.out.println("Processing complete");
  }
}

