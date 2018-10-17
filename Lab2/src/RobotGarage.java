/**
 * Alexander Belanger
 * 1/10/2018
 * I pledge that I have neither given nor received help from anyone
 * other than the instructor for all program components included here.
 * Signed,
 * Alexander Belanger
 */
import java.util.Random;

public class RobotGarage {

	public static void main(String[] args) throws CloneNotSupportedException {
		Robot[] garage = new Robot[3]; // Create an array with space for 3 Robots
		garage[0] = new Robot(); //Place a new robot in garage[0]
		garage[1] = new Robot(); //Place a new robot in garage[1]
		int pos = new Random().nextInt(2); // Generate a random number between 0 and 2 to determine which robot will be copied
		garage[2] = garage[pos].copy(); //Copy and place the robot in garage[2]
		for(int i = 0; i < 3; i++){
			System.out.printf("Robot %d:%n\t%s %n",(i+1),garage[i].toString());
		}
		System.out.printf("%nNumber of total Robots: %d %n",Robot.numRobots); 
		if(garage[2].equals(garage[0])){
		  	System.out.println("Robots 1 and 3 have the same ID");
		}else if(garage[2].equals(garage[1])){
		  	System.out.println("Robots 2 and 3 have the same ID");
		}
	}
}