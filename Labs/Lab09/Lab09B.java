/**
 *
 * @author dustinchilson
 * @creation_date Jan 24, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab09B {
  public static void main(String[] args) {
    double temp = 32.0;
    char scale = 'F';
    switch (scale) {
        case 'F':
            System.out.println("Result is " + (5 * (temp - 32) / 9) + 'C');
            break;
        case 'f':
            System.out.println("Result is " + (5 * (temp - 32) / 9) + 'C');
            break;
        case 'C':
            System.out.println("Result is " + ((9 * temp / 5) + 32) + 'F');
            break;
        case 'c':
            System.out.println("Result is " + ((9 * temp / 5) + 32) + 'F');
            break;
        default:
            System.out.println("Invalid scale");
            break;
    }
  }
}

