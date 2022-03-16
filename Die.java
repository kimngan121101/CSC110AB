/*
 * Author - Ngan Hoang
 * Course - CSC 110AB
 * Date - 12/5/2019
 * Program - Die
 * Program Purpose - Create some code to run the dice
 */
package NganHoang;
import java.util.Random;
public class Die { // Start coding
	// Declare private instances
	private char one; 
	private char two;
	private char three;
	private char four;
	private char five;
	private char six;
	private char seven;
	private char eight;
	private char nine;
	private String status = "unfreeze" ;
	public int random_num;
	private int numSides;
	private int diceValue;
	
	// Constructor with number of side parameter
	public Die(int numSides) {
		if (!status.equalsIgnoreCase("freeze") && numSides > 1) // not frozen status number of side = user's input and number of side should be larger than 1
			this.numSides = numSides;
		else
			this.numSides = 6; // If not number of side will be 6
		setValue(1); // Initial value of dice = 1	
	}
	// Default constructor
	public Die() {
		this.numSides = 6; // default number of sides is 6 if there is no user's input
		setValue(1); // Initial value of dice = 1
		System.out.println("No user's side input");
	}
	// Setter method
	public void setValue(int v) {
		if (!status.equalsIgnoreCase("freeze")) { // if it's not frozen status 
			if (v > 0 && v <= this.numSides) // number of side should be in range from 1 to assigned number of side
				diceValue = v;
			else { // If not the value will be 1
				System.out.println("The value of dice is not in range from 0...number of sides");
				diceValue = 1;
				}
		}
		else // If the status of dice is frozen
			diceValue = 3; // Assuming the value of dice is 3 when it's frozen
	}
	// Getter method
	public int getValue() { 
		return diceValue;
	}
	// Random roll method
	public void roll() {
		Random r = new Random(); // It will throw a random value of the dice when rolling 
		if (!status.equalsIgnoreCase("freeze")) { // If the status of the dice is not frozen
		random_num = r.nextInt(this.numSides)+1;
		setValue(random_num);
		}
	}
	// Print method
	public void print() { // Format of the dice [value : number of side]
		System.out.print("["+ getValue()+ ":"+ this.numSides + "]");
	}
	// Draw method
	public void draw() {
		Random r = new Random(); // Random value of the dice in range of number of side
		diceValue = r.nextInt(this.numSides)+1;
		switch (diceValue) { // Drawing format of the dice from any value 1 to 6 
		case 1:
			one = ' ';
			two = ' ';
			three = ' ';
			four = ' ';
			five = '*';
			six = ' ';
			seven = ' ';
			eight = ' ';
			nine = ' ';
			break;
		case 2:
			one = ' ';
			two = ' ';
			three = '*';
			four = ' ';
			five = ' ';
			six = ' ';
			seven = '*';
			eight = ' ';
			nine = ' ';
			break;
		case 3:
			one = ' ';
			two = ' ';
			three = '*';
			four = ' ';
			five = '*';
			six = ' ';
			seven = '*';
			eight = ' ';
			nine = ' ';
			break;
		case 4:
			one = '*';
			two = ' ';
			three = '*';
			four = ' ';
			five = ' ';
			six = ' ';
			seven = '*';
			eight = ' ';
			nine = '*';
			break;
		case 5:
			one = '*';
			two = ' ';
			three = '*';
			four = ' ';
			five = '*';
			six = ' ';
			seven = '*';
			eight = ' ';
			nine = '*';
			break;
		case 6:
			one = '*';
			two = ' ';
			three = '*';
			four = '*';
			five = ' ';
			six = '*';
			seven = '*';
			eight = ' ';
			nine = '*';
			break;
		} // no default case
		if (this.numSides <= 6) { // Restriction if the dice in range of 6 sides
		System.out.println("......."); // figure of dice 
		System.out.println(".     .");
		System.out.println(". "+ one + two + three +" .");
		System.out.println(". "+ four + five + six +" .");
		System.out.println(". "+ seven + eight + nine +" .");
		System.out.println(".     .");
		System.out.println(".......");
		}
		else // If the number of sides is larger than 6, the format will be [value : side]
			print();
		
	}
	// Freeze method 
	public void freeze() {
		status = "freeze";
	}
	// Unfreeze method
	public void unfreeze() {
		status = "unfreeze";
	} 
}// End class ---- End of the program
