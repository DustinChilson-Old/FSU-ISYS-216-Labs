/**
 *
 * @author dustinchilson
 * @creation_date Jan 23, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab07C {
  public static void main(String[] args) {
    int ordered = 5;
    int inStock = 12;
    boolean isHeld = false;
    boolean canShip = ordered <= inStock & isHeld != true;
    System.out.println("ORDERED: " + ordered);
    System.out.println("IN STOCK: " + inStock);
    System.out.println("IS HELD: " + isHeld);
    System.out.println("CAN SHIP: " + canShip);
  }
}

