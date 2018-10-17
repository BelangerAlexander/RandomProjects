/**
 * Author: Alexander Belanger
 *  I pledge that this submission is solely my work,
 *  and that I have neither given to nor received help from anyone other than the instructor or TAs.
 *  1-31-2018
 */
public class ParkingMeter {
	private int minutesPurchased;
	
	public ParkingMeter(int numMinPurchased){
		minutesPurchased = numMinPurchased;
	}
	
	public String toString(){
		return "Minutes Purchased: "+minutesPurchased;
	}
	
	public int getMinutesPurchased(){
		return minutesPurchased;
	}
	public void setMinutesPurchased(int minutesPurchased){
		this.minutesPurchased = minutesPurchased;
	}
	
}
