/**
 *
 * @author dustinchilson
 * @creation_date Feb 16, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab13B {
  public static void main(String[] args) {
    int quantity = 4;
    double price = 7.50;
    boolean isTaxable = true;
    System.out.println("Amount due = " + Calc.due(quantity, price, isTaxable));
  }
}
class Calc {
  public static double due(int qty, double cost, boolean taxable) {
    if (qty > 0 && cost > 0) {
      double due = qty * cost;
      if (taxable)
        due *= 1.06;
      return due;
    }
    else
      return 0;
  }
}
