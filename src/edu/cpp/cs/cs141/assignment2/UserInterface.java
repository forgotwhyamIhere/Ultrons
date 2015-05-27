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

	/**
	 * Handles how the movement will be controlled and the array is being moved
	 * in. Can be a switch case or anything else.
	 */
	public void playControl() {
	}

	/**
	 * Controls the usage and effects of powerups hidden around the map.
	 */
	public void powerUps() {
	}

	/**
	 * Controls the enemy’s actions, duh. Includes what happens when caught by
	 * them, change in behavior when player is sighted, etc.
	 */
	public void enemyActions(int n) {

	}

	/**
	 * Getter for location of player and objects on the board
	 * 
	 * @return
	 */
	public int[][] getLocation() {
		return null;
	}

	public void gameStart() {
		geClass.start();
	}

	public void printMap() {
		geClass.makeEnemies();
		for (int i = 0; i < geClass.getMapLength(); i++) {
			for (int j = 0; j < geClass.getMapLength(i); j++) {
				geClass.setMap(i, j);
				System.out.print(geClass.getMap(i, j));
			}
			System.out.println();
		}
	}

	// // will place in enemy class as constructor
	// public void enemyG1() {
	// positionChecking();
	// eLocation1[0] = eLocation0[0];
	// eLocation1[1] = eLocation0[1];
	// }
	// public void enemyG2() {
	// positionChecking();
	// eLocation2[0] = eLocation0[0];
	// eLocation2[1] = eLocation0[1];
	// }
	// public void enemyG3() {
	// positionChecking();
	// eLocation3[0] = eLocation0[0];
	// eLocation3[1] = eLocation0[1];
	// }
	// public void enemyG4() {
	// positionChecking();
	// eLocation4[0] = eLocation0[0];
	// eLocation4[1] = eLocation0[1];
	// }
	// public void enemyG5() {
	// positionChecking();
	// eLocation5[0] = eLocation0[0];
	// eLocation5[1] = eLocation0[1];
	// }
	// public void enemyG6() {
	// positionChecking();
	// eLocation6[0] = eLocation0[0];
	// eLocation6[1] = eLocation0[1];
	// }

	// public void positionChecking() {
	// int a = coordinateGenerater();
	// int b = coordinateGenerater();
	// if (a <= map.length - 4) {
	// eLocation0[0] = a;
	// eLocation0[1] = b;
	// } else if (a > map.length - 3) {
	// if (b <= map.length - 3) {
	// positionChecking();
	// } else if (b > map[a].length - 3)
	// eLocation0[1] = b;
	// }
	// if (a == 1 || a == 4 | a == 7) {
	// if (b == 1 || b == 4 | b == 7)
	// positionChecking();
	// else
	// positionChecking();
	// }
	// }

	// public void additionalBullet() {
	// positionChecking();
	// aB[0] = eLocation0[0];
	// aB[1] = eLocation0[1];
	// }
	//
	// public void invincibility() {
	// positionChecking();
	// invin[0] = eLocation0[0];
	// invin[1] = eLocation0[1];
	// }
	//
	// public void radar() {
	// positionChecking();
	// rad[0] = eLocation0[0];
	// rad[1] = eLocation0[1];
	// }

	// public int ninjaSpawning(int n) {
	// int n = coordinateGenerater();
	//
	// return n;
	// }

	// public int coordinateGenerater() {
	// int number;
	// Random rN = new Random();
	// number = rN.nextInt(map.length - 1);
	// return number;
	// }

	public int getResponse() {
		return response;
	}

	public void pickDirection() {
		System.out
				.println("In which direction, would you like to move toward? \n"
						+ "1. Up \n"
						+ "2. Left \n"
						+ "3. Down \n"
						+ "4. Right");
		response = kb.nextInt();
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
}
