/**
 * This program displays a greeting for the reader
 * @version 1.20 2014-02-27
 * @author Cay Horstmann
 */

public class Welcome {
	public static void main(String[] args) {
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting);
		for(int i = 0; i < greeting.length(); i++) 
			System.out.println("=");
		System.out.println();
	}
}
