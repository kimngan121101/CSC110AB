/*
 * Author - Ngan Hoang
 * Course - CSC 110AB
 * Date - 12/5/2019
 * Program - Dice
 * Program Purpose - Create code to calculate the possibility for each case of the dice
 * The program should be run through Die.java, Dice.java
 */
package NganHoang;

public class Dice { // Start Main
	
	// Declare some variables and arrays
	private long [] cases = new long[7];
	private int [] testNum = {1,2,3,4,5,6};
	private long numTrials;
	private Die dice = new Die (6);
	private int [] randomNum = new int [5];
	private int [] repitition = new int [6];
	private int distinctTrack = 0;
	
	// Constructor with parameter
	public Dice (long numTrials) {
		this.numTrials = numTrials;
		collection();
	}
	
	// Collection method (Algorithms for distinct value and number it repeats)
	public void collection () {
		for (long index = 0; index < numTrials; index++) {
		
			for (int i = 0; i < 5; i++) { // Roll the dice 5 times
				dice.roll();
				randomNum[i] = dice.random_num;
			}
			
			for (int i = 0; i<5 ; i++) { // Compare the random value to count how many times it repeats
				for (int i1 = 0; i1 < 6; i1++) {
					if (randomNum[i] == testNum[i1])
						repitition [i1] += 1;
				}
				}
			for (int i = 0; i < 6; i++) { // Checking how many distinct values of 5 dices
				if ( repitition[i] >0)
					distinctTrack +=1;
			}
			
			if (distinctTrack == 5) // None alike hand
				cases[0] += 1;
			
			if (distinctTrack == 4 ) // One Pair hand
				cases[1] += 1;
			
			if (distinctTrack == 1) // Five of a kind hand
				cases[6] += 1;
			
			for (int i = 0; i < 6; i++) { // Check for Two Pairs Case
				if (repitition[i] == 2) {
					twoPairs(); // Call method
					break;
				}
			}
			for (int i = 0; i < 6; i++) { // Check if it is either three of a kind or full house
				if (repitition[i] == 3) {
					threeOfaKind_fullHouse(); // Call method
				}
			}
			for (int i = 0; i < 6; i++) { // Four of a kind hand
				if (repitition[i] == 4) {
					cases[5] += 1;
				}
			}
			
		for (int i = 0; i < 6; i++) { // Clear the value preventing from increasing
				repitition [i] = 0;
			}
		distinctTrack = 0; // Clear the value preventing from increasing
		}
	}
	// Two Pairs hand
	public void twoPairs() { 
		if (distinctTrack == 3)
			cases[2] += 1;
	}
	public void threeOfaKind_fullHouse() {
		if (distinctTrack == 3) // Three of a Kind
			cases[3] += 1;
		else
			cases[4] += 1; // Full House
	}
	// Getter 
	public double getNoneAlike() {
		return (double) cases[0] / (double) numTrials; // algorithms for possibility
	}
	public double getOnePair() {
		return (double) cases[1] / (double) numTrials;
	}
	public double getTwoPairs() {
		return (double) cases[2] / (double) numTrials;
}
	public double getThreeOfaKind() {
		return (double) cases[3] / (double) numTrials;
}
	public double getFullHouse() {
		return (double) cases[4]/ (double) numTrials;
}
	public double getFourOfaKind() {
		return (double) cases[5] / (double) numTrials;
	}
	public double getFiveOfaKind() {
		return (double) cases[6] / (double) numTrials;
}
	public void close() { // Method preventing increment once reopen the file
		for (int i = 0; i < 7; i++) 
			cases[i] = 0;
	}
}
