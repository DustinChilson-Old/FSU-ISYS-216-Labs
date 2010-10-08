/**
 *
 * @author dustinchilson
 * @creation_date Jan 23, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab05B {
  public static void main(String[] args) {
    double rate = 5.25;
    rate /= 100;     // Convert rate to 0.0nnn form
    System.out.println("The rate in 0.0nnn form is " + rate);
    rate *= 100;     // Convert rate to n.nn form
    System.out.println("The rate in n.nn form is " + rate);
  }
}

