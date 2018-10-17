/**
 * Alexander Belanger
 * 1/10/2018
 * I pledge that I have neither given nor received help from anyone
 * other than the instructor for all program components included here.
 * Signed,
 * Alexander Belanger
 */
import java.util.Random;

public class RobotTorso {
	private int numArms = new Random().nextInt(10)+1; // Create a number of arms from 1 - 10
	
	public RobotTorso(){} // No need for complex startup
	
	public String toString(){
		return "Arm Count: "+numArms;
	}
}