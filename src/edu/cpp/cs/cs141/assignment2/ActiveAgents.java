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

import java.util.Random;

/**
 * @author
 *
 */
public class ActiveAgents {
	// Should this be protected?
	//probably should add an addition get methods between this and the other classes
	protected int[] location = new int[2];
	/**
	 * 
	 */
	private int health;

	/**
	 * 
	 */
	public ActiveAgents() {
		createPowerup();
	}

	public void createPowerup() {
		crateLocation();
		checkNotAtStart();
		checkNotAtRooms();
	}

	public void checkNotAtStart() {
		if (location[0] == 8) {
			if (location[1] == 0) {
				createPowerup();
			}
		}
	}

	public int getArrayRowY() {
		return location[0];
	}

	public int getArrayColumnX() {
		return location[1];
	}

	public int coordinateGenerator() {
		int number;
		Random rN = new Random();
		number = rN.nextInt(9);
		return number;
	}

	public void crateLocation() {
		location[0] = coordinateGenerator();
		location[1] = coordinateGenerator();
	}

	public void checkNotAtRooms() {
		int n = location[0];
		int m = location[1];
		// checking for rowY
		if (n == 1 || n == 4 | n == 7) {
			// and checking for columnX
			if (m == 1 || m == 4 | m == 7) {
				crateLocation();
			}
		}
	}

	// // Jordan's solution with this class's fields
	// public void positionChecking() {
	// int a = coordinateGenerator();
	// int b = coordinateGenerator();
	// if (a <= 5) {
	// location[0] = a;
	// location[1] = b;
	// } else if (b >= 4) {
	// location[0] = a;
	// location[1] = b;
	// }
	// }
	//
	// // Jordan's original solution
	// public void positionChecking() {
	// int a = coordinateGenerator();
	// int b = coordinateGenerator();
	// if (a <= map.length - 4) {
	// eLocation0[0] = a;
	// eLocation0[1] = b;
	// } else if (b >= map.length - 5) {
	// eLocation0[0] = a;
	// eLocation0[1] = b;
	// }
	// }
}
