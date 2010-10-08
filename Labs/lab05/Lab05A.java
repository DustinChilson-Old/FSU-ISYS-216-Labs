/**
 *
 * @author dustinchilson
 * @creation_date Jan 23, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab05A {
  public static void main(String[] args) {
    final double MO_FINANCE_CHARGE = .015;
    double balance = 234.56;
    double payment = 125.00;
    double purchases = 75.63;
    System.out.println("Original balance = " + balance);
    balance -= payment;     // Subtract payment from balance.
    System.out.println("After deducting payment, balance = " + balance);
    balance *= MO_FINANCE_CHARGE+1;     // Multiply balance by 1 plus monthly finance charge.
    System.out.println("After adding finance charge, balance = " + balance);
    balance += purchases;     // Add purchases to balance.
    System.out.println("After adding purchases, balance = " + balance);
  }
}

