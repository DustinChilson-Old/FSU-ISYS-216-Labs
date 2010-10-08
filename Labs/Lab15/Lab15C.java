/**
 *
 * @author dustinchilson
 * @creation_date Feb 17, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */

public class Lab15C {
  public static void main(String[] args) {
    double distance = 70;
    double angleInDegrees = 35;
    double angleInRadians = Math.toRadians(angleInDegrees);  // CONVERT ANGLE TO RADIANS
    double tangentOfAngle = Math.tan(angleInRadians);  // GET THE TANGENT OF THE ANGLE
    double height = tangentOfAngle * distance;
    System.out.println("Height is " + height);
  }
}
