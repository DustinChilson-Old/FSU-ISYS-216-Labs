/**
 *
 * @author dustinchilson
 * @creation_date Feb 11, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
import java.io.*;
public class Project1 {
  public static void main(String[] args) {
    int scoreTotal = 0;
	int count = 0;
	int output = 0;
	char letterGrade = ' ';
	char outputLetterGrade = ' ';
	
	
	while (true) {
    	
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("You may enter a score from 1 to 100.");
        System.out.println("A request for 0 will average your scores and quit.");
      
		int score = Utility.readInt();
		if (score != 0) {
			scoreTotal += score;
			//System.out.println("test:" + scoreTotal);
			count++;
			//System.out.println("test:" + count);
			output = scoreTotal/count;
			//System.out.println("test:" + output);
		}
		
		// Convert Grade scores to letter grades
		if (score < 60) {
			letterGrade = 'F';
		} else if (score >= 60 && score < 70) {	
			letterGrade = 'D';
		} else if (score >= 70 && score < 80) {
			letterGrade = 'C';
		} else if (score >= 80 && score < 90) {
			letterGrade = 'B';
		} else if (score >= 90 && score < 100) {	
			letterGrade = 'A';								
		}
		
		if (output < 60) {
			outputLetterGrade = 'F';
		} else if (output >= 60 && output < 70) {	
			outputLetterGrade = 'D';
		} else if (output >= 70 && output < 80) {
			outputLetterGrade = 'C';
		} else if (output >= 80 && output < 90) {
			outputLetterGrade = 'B';
		} else if (output >= 90 && output < 100) {	
			outputLetterGrade = 'A';								
		}
		
    	if (score == 0) {
    		System.out.println("Your average grade equals an " + output + "%.\nThis equates to a / an - " + outputLetterGrade + "\n\n"); // average
			break; //quit
    	} else if (score < 0 || score > 100) {
        	//Error catch
			System.out.println("Invalid score! Must be greater than 0 and less than 100.\n\n");
        	continue;    // Start over
    	} else {
			System.out.println("Your Entry was - " + score + "%.\nThis equates to a / an - " + letterGrade + "\n\n");
			continue;    // Start over
      }
    }
    System.out.println("Processing complete");
  }
}

class Utility {
  public static int readInt() {
    BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
    Integer result = null;
    while (result == null) {
      try {
        result = new Integer(kb.readLine());
      }
      catch(Exception err) {
        System.out.print("ERROR! Please try again: ");
      }
    }
    return result.intValue();
  }
}

