/**
 *
 * @author dustinchilson
 * @creation_date Jan 24, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab09A {
  public static void main(String[] args) {
    int number = 1;
    char letter = '?';
    switch (number) {
      case 1:
        letter = 'A';
        break;
      case 2:
        letter = 'B';
        break;
      case 3:
        letter = 'C';
        break;
      default:
        letter = '-';
        break;
    }
    System.out.println(number + " corresponds with " + letter);
  }
}

