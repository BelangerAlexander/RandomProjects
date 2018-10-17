/**
 * Author: Alexander Belanger
 *  I pledge that this submission is solely my work,
 *  and that I have neither given to nor received help from anyone other than the instructor or TAs.
 *  1-31-2018
 */
public class ParkedCar {
	private String make;
	private String model;
	private String color;
	private String licenceNumber;
	private int minutesParked;
	
	public ParkedCar(String mk, String mdel, String col, String lic, int minParked){
		make = mk;
		model = mdel;
		color = col;
		licenceNumber = lic;
		minutesParked = minParked;
	}
	
	public ParkedCar(ParkedCar car2){
		this.make = car2.make;
		this.model = car2.model;
		this.color = car2.color;
		this.licenceNumber = car2.licenceNumber;
		this.minutesParked = car2.minutesParked;
	}
	
	public String toString(){
		return    "\nCar Data:\n"
				+ "    Make: "+make+"\n"
				+ "    Model: "+model+"\n"
				+ "    Color: "+color+"\n"
				+ "    Licence Number: "+licenceNumber+"\n"
				+ "    Minutes Parked: "+minutesParked+"\n";
	}
	
	public String getMake(){
		return make;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public String getLicenceNumber(){
		return licenceNumber;
	}
	public int getMinutesParked(){
		return minutesParked;
	}
	public void setMake(String make){
		this.make = make;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setLicenceNumber(String licenceNumber){
		this.licenceNumber = licenceNumber;
	}
	public void setMinutesParked(int minutesParked){
		this.minutesParked = minutesParked;
	}
}
