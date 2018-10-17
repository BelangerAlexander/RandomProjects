/**
 * Alexander Belanger
 * 1/10/2018
 * I pledge that this submission is solely my work, and that I have neither
 * given to nor received help from anyone other than the instructor or TAs.
 * Signed,
 * Alexander Belanger
 */
import java.util.Random;

public class SlotMachine {
	private int[][] rows = new int[3][3];
	// A two dimensional array takes up less space and requires less code to operate
	
	public SlotMachine(){} //No need for any complex construction
	
	public void playMachine(){//Nested for loop to operate two dimensional array
		for(int i = 0; i < 3; i++){//Row Number
			for(int j = 0; j < 3; j++){//Space in row
				rows[i][j] = (new Random().nextInt(9))+1;//Stick a random number (1-9) in the index
			}
		}
	}
	
	public boolean isWinner(){// Nested for loop to operate two dimensional array
		for(int i = 0; i < 3; i++){// In given row:
			if((rows[i][0] == rows[i][1]) && (rows[i][1] == rows[i][2])){// Is each element is equivalent?
				return true; // If so, return true
			}// However,
		}// If none win:
		return false; // Return False.
	}
}