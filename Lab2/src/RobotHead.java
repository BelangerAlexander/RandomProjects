/**
 * Alexander Belanger
 * 1/10/2018
 * I pledge that I have neither given nor received help from anyone
 * other than the instructor for all program components included here.
 * Signed,
 * Alexander Belanger
 */
import java.util.Random;

public class RobotHead {
	private String eyeColor = "";
	
	public RobotHead(){ // When the Robot's head is created:
		int eyeDesignator = new Random().nextInt(5);
		if(eyeDesignator == 0){ // Determine its Eye Color
			eyeColor = "blue";
		}else if(eyeDesignator == 1){
			eyeColor = "green";
		}else if(eyeDesignator == 2){
			eyeColor = "evil red";
		}else if(eyeDesignator == 3){
			eyeColor = "creepy yellow";
		}else if(eyeDesignator == 4){
			eyeColor = "black";
		}
	}
	
	public String toString(){
		return "Eye Color: "+eyeColor;
	}
}