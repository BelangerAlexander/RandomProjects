/**
 * Alexander Belanger
 * 1/10/2018
 * I pledge that I have neither given nor received help from anyone
 * other than the instructor for all program components included here.
 * Signed,
 * Alexander Belanger
 */
import java.util.Random;

public class Robot {
	static int numRobots = 0;
	
	private RobotHead robotHead = new RobotHead();
	private RobotTorso robotTorso = new RobotTorso();
	private String serialID = "Johnny"+new Random().nextInt(100000);
	
	public Robot(){// When a robot is created:
		numRobots++;// Increment the static counter field by one.
	}
	
	public static int getRobotCount(){
		return numRobots;
	}
	
	public Robot copy(){
		Robot newRobot = new Robot(); // Create a new robot and:
		newRobot.setSerialID(this.serialID); // Set its serial ID to the one being copied.
		return newRobot;
	}
	
	public void setSerialID(String serial){
		serialID = serial;
	}
	
	public boolean equals(Robot aRobot){
		return this.serialID.equals(aRobot.serialID); // In one line, compare the Strings and return the boolean value.
	}
	
	public String getSerialID(){
		return serialID;
	}
	
	public String toString(){
		return "Serial ID: " + serialID + "\n\t" + 
				robotHead.toString() +"\n\t"+ robotTorso.toString() ; 
	}
}