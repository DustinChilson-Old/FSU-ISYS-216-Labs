/**
 *
 * @author dustinchilson
 * @creation_date Jan 21, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab04C {
    public static void main(String[] args) {
        final double TAX_RATE = .06;
        final double SHIPPING = 5.00;
        double regularPrice = 7.95;
        short quantity = 3;
        double pctOff = .15;
        double salesPrice = regularPrice*(1-pctOff);   // Regular price times 1 minus percent off
        double extendedPrice = salesPrice*quantity;   // Sales price times quantity ordered
        double tax = extendedPrice*TAX_RATE;        // Extended price times tax rate
        double totalDue = extendedPrice+tax+SHIPPING;   // Sum of extended price, tax, & shipping
        System.out.println("-------------INVOICE-----------------");
        System.out.println("Quantity ordered: " + quantity);
        System.out.println(" Regular price: " + regularPrice);
        System.out.println(" Sales price: " + salesPrice);
        System.out.println(" Extended price: " + extendedPrice);
        System.out.println(" Sales tax: " + tax);
        System.out.println(" Shipping charge: " + SHIPPING);
        System.out.println("-------------------------------------");
        System.out.println("Total amount due: " + totalDue);
    }
}
