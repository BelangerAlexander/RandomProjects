/**
 * Author: Alexander Belanger
 *  I pledge that this submission is solely my work,
 *  and that I have neither given to nor received help from anyone other than the instructor or TAs.
 *  1-31-2018
 */
public class PoliceOfficer {
	private String name;
	private String badgeNumber;
	
	public PoliceOfficer(String officerName, String badgeNumber){
		name = officerName;
		this.badgeNumber = badgeNumber;
	}
	
	public PoliceOfficer(PoliceOfficer officer){ //Copy the fields
		this.badgeNumber = officer.badgeNumber;
		this.name = officer.name;
	}
	
	public String toString(){
		return "\nOfficer Data:\n"
				+ "    Name: " +name+ "\n"
				+ "    Licence Number: " +badgeNumber+ "\n";
	}
}
