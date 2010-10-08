/**
 *
 * @author dustinchilson
 * @creation_date Feb 16, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab13A {
  public static void main(String[] args) {
    byte pointsEarned = 37;
    byte pointsPossible = 50;
    double pct = percent(pointsEarned, pointsPossible);  // USE 'PERCENT' METHOD TO CALCULATE PERCENTAGE
    System.out.println("Percent: " + pct);
    System.out.println("Grade: " + Other.grade(pct));  // USE 'GRADE' METHOD TO GET LETTER GRADE
  }
  public static double percent(double score, int possible) {
    if (possible > 0)
      return 100 * (score / possible);
    else
      return 0;
  }
}
class Other {
  public static char grade(double percent) {
    if (percent >= 90)
      return 'A';
    else if (percent >= 80)
      return 'B';
    else if (percent >= 70)
      return 'C';
    else if (percent >= 60)
      return 'D';
    else
      return 'F';
  }
}


