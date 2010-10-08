/**
 *
 * @author dustinchilson
 * @creation_date Jan 23, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab08A {
  public static void main(String[] args) {
    final double NORMAL_TEMP = 98.6;
    double temp = 98.5;
    if (temp > NORMAL_TEMP) {
      System.out.println("You have a fever");
      System.out.println("Take two aspirin and go to bed");
    }
    System.out.println("Processing complete");
  }
}

