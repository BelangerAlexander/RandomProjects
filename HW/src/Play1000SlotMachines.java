/**
 * Alexander Belanger
 * 1/10/2018
 * I pledge that this submission is solely my work, and that I have neither
 * given to nor received help from anyone other than the instructor or TAs.
 * Signed,
 * Alexander Belanger
 */
public class Play1000SlotMachines {
	public static void main (String[] args){
		SlotMachine[] play1000 = new SlotMachine[1000];// Array with space for 1000 slot machines
		for(int i = 0; i < 999; i++){// In the given index:
			play1000[i] = new SlotMachine();// Place a slot machine.
		}
		int wins = 0;// Wins counter
		for(int i = 0; i < 999; i++){// In the given index:
			play1000[i].playMachine();// Play that slot machine and
			boolean win = play1000[i].isWinner();// Determine whether it is a winner
			if(win){// If it won:
				wins++;// Increment the wins counter
			}
		}
		System.out.printf("From 1000 slot machines, %d were winners.",wins); // Print Result
	}
}