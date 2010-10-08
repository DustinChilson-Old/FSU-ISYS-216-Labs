/**
 *
 * @author dustinchilson
 * @creation_date Feb 17, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab15Combined {
  public static void main(String[] args) {
    System.out.println("===== Lab A =====");
	double n1 = Math.random();  // GET FIRST RANDOM NUMBER
    double n2 = Math.random();  // GET SECOND RANDOM NUMBER
    System.out.println("First number = " + n1);
    System.out.println("Second number = " + n2);
    System.out.println("Larger number = " + Math.max(n1, n2));  // DISPLAY THE LARGER NUMBER

	System.out.println("\n===== Lab B =====");
	double amount = 1000;
    double rate = .06;
    int years = 10;
    double result = amount * Math.pow((1+rate),years);
    System.out.println("Compounded amount is " + result);

	System.out.println("\n===== Lab C =====");
	double distance = 70;
    double angleInDegrees = 35;
    double angleInRadians = Math.toRadians(angleInDegrees);  // CONVERT ANGLE TO RADIANS
    double tangentOfAngle = Math.tan(angleInRadians);  // GET THE TANGENT OF THE ANGLE
    double height = tangentOfAngle * distance;
    System.out.println("Height is " + height);
  }
}