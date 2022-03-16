/*
 * Author - Ngan Hoang
 * Course - CSC110AB
 * Date - 12/5/2019
 * Program - Poker Dice
 * Program Purpose - Calculate the possibility of 5 different hands over number of trials
 * The program needs to be run through 3 files Dice.java, Die.java, PokerDice.java
 */

package NganHoang;
import java.util.Scanner;
public class PokerDice {

	public static void main(String[] args) { // Start Main
		Scanner scnr = new Scanner (System.in); 
		
		System.out.println("Poker Dice Probability Calculator - N. Hoang\n");
		System.out.println("Please enter number of Trials : ");
		long numofTrials = scnr.nextLong(); // Scanner for user's input (number of trials)
		
		Dice possibility = new Dice (numofTrials); // import Dice file 
		double [] value = new double [7]; // create an array to store possibility of each different hands
		
		// Assign each variables to each case's possibility
		value[0] = possibility.getNoneAlike();
		value[1] = possibility.getOnePair();
		value[2] = possibility.getTwoPairs();
		value[3] = possibility.getThreeOfaKind();
		value[4] = possibility.getFullHouse();
		value[5] = possibility.getFourOfaKind();
		value[6] = possibility.getFiveOfaKind();
		
		// Create an array for each type of hands
		String [] cases = { "None alike", "One Pair", "Two Pairs", "Three of a Kind", "Full House", "Four of a Kind", "Five of a Kind"};	
		
		System.out.println("Running " + numofTrials + " trials\n");
	
		for (int i = 0; i < 7; i++) // Display the result
		System.out.printf("Case %d,%16s, is %.6f\n", i + 1, cases[i], value[i]);
		
		possibility.close(); // Prevent increment once open the file again
		scnr.close(); // Prevent leak source
	} // End Main

} // End the Program
