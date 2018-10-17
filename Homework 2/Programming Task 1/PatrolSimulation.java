/**
 * Author: Alexander Belanger
 *  I pledge that this submission is solely my work,
 *  and that I have neither given to nor received help from anyone other than the instructor or TAs.
 *  1-31-2018
 */
public class PatrolSimulation {

	public static void main(String[] args) {
		ParkedCar[] cars = new ParkedCar[2]; // Create space for two cars
		cars[0] = new ParkedCar("Volkswagen", "Jetta 2004", "black", "BAKBE44", 90); // Fill [0] with a car
		cars[1] = new ParkedCar("Honda", "Civic 2007", "silver", "HC2345", 120); // Fill [1] with a car
		
		ParkingMeter[] meters = new ParkingMeter[2]; // Create Space for 2 parking meters
		meters[0] = new ParkingMeter(120); // Fill [0] with the first car's limit
		meters[1] = new ParkingMeter(90); // Fill [1] with the second car's limit
		
		PoliceOfficer officer = new PoliceOfficer("Steven Wickland", "8072"); // Create a police officer.
		
		ParkingTicket[] tickets = new ParkingTicket[2]; // Create 2 instances of a Ticket
		tickets[0] = new ParkingTicket(cars[0], officer, meters[0].getMinutesPurchased()); //Fill [0] with information about the first car
		tickets[1] = new ParkingTicket(cars[1], officer, meters[1].getMinutesPurchased()); //Fill [1] with information about the second car
		
		tickets[0].calculateFine(); // Calculate the first car's situation
		tickets[1].calculateFine(); // Calculate the second car's situation
		
		System.out.println("Car/Parking Meter 1:\n"+tickets[0].toString()); //Print the first car's situation
		System.out.println("Car/Parking Meter 2:\n"+tickets[1].toString()); //Print the second car's situation
	}

}
