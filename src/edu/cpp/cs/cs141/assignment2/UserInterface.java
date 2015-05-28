/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment #N
 *
 * <description-of-assignment>
 *
 * Team Ultrons
 *   <Jordan Tien, Jaime Lopez, Justin Galloway, Edward Quach>
 */
package edu.cpp.cs.cs141.assignment2;

//import java.util.Random;
import java.util.Scanner;

/**
 * @author
 *
 */
public class UserInterface {
	/**
	 *
	 */
	private Scanner kb = new Scanner(System.in);
	/**
	 * 
	 */
	private GameEngine geClass = new GameEngine(this);
	private int response;

	// /**
	// * Handles how the movement will be controlled and the array is being
	// moved
	// * in. Can be a switch case or anything else.
	// */
	// public void playControl() {
	// }
	//
	// /**
	// * Controls the usage and effects of powerups hidden around the map.
	// */
	// public void powerUps() {
	// }
	//
	// /**
	// * Controls the enemy’s actions, duh. Includes what happens when caught by
	// * them, change in behavior when player is sighted, etc.
	// */
	// public void enemyActions(int n) {
	//
	// }
	//
	// /**
	// * Getter for location of player and objects on the board
	// *
	// * @return
	// */
	// public int[][] getLocation() {
	// return null;
	// }

	public void gameStart() {
		printGameDetails();
		pickMainOptions(mainOptions());
	}

	private void printGameDetails() {
		System.out.println("(insert game description here)");
	}

	public int mainOptions() {
		System.out.println("1. New Game \n2. Load Game");
		return kb.nextInt();
	}

	public void pickMainOptions(int n) {
		switch (n) {
		case 1:
			geClass.newStart();
			break;
		case 2:
			// load game method HERE
			break;
		}
	}

	public void printBasicMap() {
		for (int i = 0; i < geClass.getMapLength(); i++) {
			for (int j = 0; j < geClass.getMapLength(i); j++) {
				geClass.setBasicMap(i, j);
				System.out.print(geClass.getMap(i, j));
			}
			System.out.println();
		}
	}

	public void printMap() {
		for (int i = 0; i < geClass.getMapLength(); i++) {
			for (int j = 0; j < geClass.getMapLength(i); j++) {
				geClass.setMap(i, j);
				System.out.print(geClass.getMap(i, j));
			}
			System.out.println();
		}
	}

	public int lookOptions() {
		System.out.println("What would you like to do?");
		System.out.println("1. Look,");
		System.out.println("2. Don't Look.");
		System.out.println("3. Save and Quit");
		System.out.println("4. Activate (Warning can not be undone)");
		return kb.nextInt();
	}

	public int moveOrShoot() {
		System.out.println("What would you like to do?");
		System.out.println("1. Move");
		System.out.println("2. Shoot");
		System.out.println("3. Save and Quit");
		System.out.println("4. Activate (Warning can not be undone)");
		return kb.nextInt();
	}

	// method thaaeat checks if enemy is present at the location and returns
	// true or false?
	// Status: not used
	public void shotEnemy(boolean t) {
		if (t) {
			System.out.println("You hit the ninja. It had to be done.");
		} else {
			System.out
					.println("You thought it was a ninja, but it was just some dust or something.");
		}
	}

	public int pickDirection() {
		System.out.println("in which direction? \n" + "1. Up \n" + "2. Left \n"
				+ "3. Down \n" + "4. Right");
		// response = kb.nextInt();
		return kb.nextInt();
	}

	public int getResponse() {
		return response;
	}

	// method not complete
	public void hitEnterToContinue() {
		System.out.println("Please press Enter to continue.");
	}

	/**
	 * Idea for saving and loading: Start-generates new values Save-records
	 * current values Load-set values according to the save date Hows this
	 * works, requires the rest of the program to be written
	 */

	// displays current location values for array
	public void displayLocation(int a, int b) {
		System.out.println();
		System.out.println(a);
		System.out.println(b);
	}

	public void runDebug() {
		System.out.println("Debug Mode: ON");
	}

}
