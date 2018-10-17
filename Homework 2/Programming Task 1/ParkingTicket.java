/**
 * Author: Alexander Belanger
 *  I pledge that this submission is solely my work,
 *  and that I have neither given to nor received help from anyone other than the instructor or TAs.
 *  1-31-2018
 */
public class ParkingTicket {
	private ParkedCar car;
	private PoliceOfficer officer;
	private double fine;
	private int minutes;
	public double BASE_FINE = 25.0;
	public double HOURLY_FINE = 10.0;
	
	public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int meterMins){
		car = new ParkedCar(aCar);
		officer = new PoliceOfficer(anOfficer);
		minutes = meterMins;
	}
	
	public ParkingTicket(ParkingTicket ticket){// Copyy the fields
		this.car = new ParkedCar(ticket.car);
		this.officer = new PoliceOfficer(ticket.officer);
		this.fine = ticket.fine;
		this.minutes = ticket.minutes;
	}
	
	public void calculateFine(){
		if(car.getMinutesParked() >= minutes){ // If the car over-stayed its time
			fine = BASE_FINE + 10*(Math.ceil((car.getMinutesParked()/60)-(minutes/60))); // calculate the fine
		}else{
			fine = 0.00;
		}
	}
	
	public String toString(){
		int minIllParked = 0;
		if(car.getMinutesParked() > minutes){ // If the car over-stayed its time
			minIllParked = car.getMinutesParked()-minutes; // calculate how many minutes it over-stayed
			return  car.toString()+officer.toString()//print everything
			+"\nTicket Data: \n"
			+ "    Minutes Illegally Parked: " +minIllParked+ "\n"
			+ "    Fine: $" +fine+ "0\n";
		}
		return  "No Ticket Issued.\n"; // if it didn't over-stay, return this instead.
	}
}
