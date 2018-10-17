/**
 * Author: Alexander Belanger
 *  I pledge that this submission is solely my work,
 *  and that I have neither given to nor received help from anyone other than the instructor or TAs.
 *  1-31-2018
 */
public class PasswordVerifier {
	private static int MIN_PASSWORD_LENGTH = 6;
	
	public static boolean isValid(String str){
		boolean upper = hasUpperCase(str);
		boolean lower = hasLowerCase(str);
		boolean digit = hasDigit(str);
		return (upper == true) && (lower == true) && (digit == true) && (str.length() >= MIN_PASSWORD_LENGTH);
	}
	
	private static boolean hasUpperCase(String str){
		for(int i = 0; i < str.length(); i++){//At each char,
			if(((int)(str.charAt(i)) >= 65) && (((int)str.charAt(i)) <= 90)){//consult the ASCII table
				return true;
			}
		}
		return false; //return false if proper char is not found
	}
	
	private static boolean hasLowerCase(String str){
		for(int i = 0; i < str.length(); i++){//At each char,
			if((str.charAt(i) >= 97) && (str.charAt(i) <= 122)){//consult the ASCII table
				return true;
			}
		}
		return false; //return false if proper char is not found
	}
	
	private static boolean hasDigit(String str){
		for(int i = 0; i < str.length(); i++){//At each char,
			if((str.charAt(i) >= 48) && (str.charAt(i) <= 57)){//consult the ASCII table
				return true;
			}
		}
		return false; //return false if proper char is not found
	}
}
