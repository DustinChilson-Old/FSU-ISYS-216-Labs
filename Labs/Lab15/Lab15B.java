/**
 *
 * @author dustinchilson
 * @creation_date Feb 17, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */

public class Lab15B {
  public static void main(String[] args) {
    double amount = 1000;
    double rate = .06;
    int years = 10;
    double result = amount * Math.pow((1+rate),years);
    System.out.println("Compounded amount is " + result);
  }
}
