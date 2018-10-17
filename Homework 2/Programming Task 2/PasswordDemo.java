/**
 * Author: Alexander Belanger
 *  I pledge that this submission is solely my work,
 *  and that I have neither given to nor received help from anyone other than the instructor or TAs.
 *  1-31-2018
 */

import java.util.Scanner;

public class PasswordDemo {

	public static void main(String[] args) {
		System.out.println("The Password Must Contain:"
				+ "\nAt least 1 Upper Case letter."
				+ "\nAt least 1 Lower Case letter."
				+ "\nAt least 1 Digit.\n");
		System.out.print("Type in a password: ");
		Scanner password = new Scanner(System.in); //Take user input and
		boolean valid = PasswordVerifier.isValid(password.nextLine());//check it
		password.close();//Then close the Scanner.
		if(valid){//If the string was found to be valid
			System.out.println("The Password is Valid.");
		}else{//Otherwise...
			System.out.println("The Password is Invalid.");
		}
	}

}
