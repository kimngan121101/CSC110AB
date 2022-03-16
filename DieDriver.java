/*
 * Author - Ngan Hoang
 * Course - CSC 110AB
 * Date - 12/5/2019
 * Program - Die Driver
 * Program Purpose - To test all cases of the dice
 * The program should be run through Die.java, DieDriver.java
 */
package NganHoang;

public class DieDriver {

	public static void main(String[] args) { // Start Main
		System.out.println("Die Driver - H.Ngan\n");
		System.out.println("1. Creation of Die\n");
		
		// The Test Cases marked with an asterisk (*) should produce an error and keep going.
		// dice format [value : side]
		
		// Start test cases
		
		// 1.a Create a default Die, print it
		Die game = new Die();
		System.out.print("	a)");
		game.print();
		
		// 1.b Create a die with 4 side, print it
		Die game1 = new Die(4);
		System.out.print("\n	b)");
		game1.print();
		
		// 1.c Create a default Die, print it
		Die game2 = new Die(10);
		System.out.print("\n	c)");
		game2.print();
		
		System.out.println("\n\n2. Setting Value of Die\n");
		System.out.println("*** Attempted to set value to 5, assumed 1.");
		System.out.println("*** Attempted to set value to 0, assumed 1.\n");
		
		// 2.a set to 3, print it 
		Die game3 = new Die();
		game3.setValue(3);
		System.out.print("	a)");
		game3.print();
		System.out.println();
		
		// 2.b* set to 5, print it (with the given 4 sides) 
		Die game4 = new Die(4);
		game4.setValue(5);
		System.out.print("	b)");
		game4.print();
		System.out.println();
		
		// 2.c* set to 0, print it (with the given 10 sides)
		Die game5 = new Die(10);
		game5.setValue(0);
		System.out.print("	c)");
		game5.print();
		
		System.out.println("\n\n3. Freezing a Die\n");
		
		// 3.a freeze it, set the value to 5, print it
		Die game6 = new Die();
		game6.freeze();
		game6.setValue(5);
		System.out.print("	a)");
		game6.print();
		System.out.println();
		
		// 3.b unfreeze it, set the value to 5, print it
		Die game7 = new Die();
		game7.unfreeze();
		game7.setValue(5);
		System.out.print("	b)");
		game7.print();
		
		System.out.println("\n\n4. Drawing a Die\n");
		
		// 4.a Draw it
		Die game8 = new Die(5);
		System.out.print("   a)\n");
		game8.draw();
		
		// 4.b Draw it
		Die game9 = new Die(2);
		System.out.print("   b)\n");
		game9.draw();
		
		// 4.c Draw it 
		Die game10 = new Die(10);
		System.out.print("   c)\n");
		game10.draw();
		
		System.out.println("\n\n5. Rolling a Die\n");
		
		// 5.a Roll and print it 10 times.
		Die game11 = new Die(6);
		System.out.print("  a)");
		for (int i = 0; i < 10; i++) {
			game11.roll();
			game11.print();
		}
		System.out.println();
		
		// 5.b Roll and draw it 3 times.
		Die game12 = new Die(4);
		System.out.print("  b)\n");
		for (int i = 0; i <3 ; i++) {
			game12.roll();
			game12.draw();
		}
		
		// 5.c Roll and print it 10 times.
		Die game13 = new Die(10);
		System.out.print("  c)");
		for (int i = 0; i < 10; i++) {
			game13.roll();
			game13.print();
		}
	}// End main

}// End class --- Done Testing
