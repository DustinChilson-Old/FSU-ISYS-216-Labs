/**
 *
 * @author dustinchilson
 * @creation_date Feb 17, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab14A {
  public static void main(String[] args) {
    System.out.println("32 F = " + convert(32, 'F') + " C");
    System.out.println("100 C = " + convert(100, 'C') + " F");
    System.out.println("100 Mi = " + convert('M', 100) + " Km");   // CHANGE
    System.out.println("1 Km = " + convert('K', 1) + " Mi");       // CHANGE
  }
  public static double convert(double temp, char scale) {
    if (scale == 'F')
      return (temp - 32) * 5 / 9;
    else
      return ((9 * temp) / 5) + 32;
  }
  public static double convert(char units, double dist) {          //CHANGE
    if (units == 'M')
      return (dist * 8) / 5;
    else
      return (dist / 8) * 5;
  }
}
