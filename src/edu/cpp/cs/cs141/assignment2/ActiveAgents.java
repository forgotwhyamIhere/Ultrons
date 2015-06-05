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
	// Should this be protected or private?
	private int[] location = new int[2];

	// /**
	// *
	// */
	// private int health;

	/**
	 * 
	 */
	public ActiveAgents() {
		createBriefcasee();
	}

	public void createBriefcasee() {
		int n = coordinateGenerator();
		if (n < 9) {
			switch (n) {
			case 0:
				location[0] = 1;
				location[1] = 1;
				break;
			case 1:
				location[0] = 1;
				location[1] = 4;
				break;
			case 2:
				location[0] = 1;
				location[1] = 7;
				break;
			case 3:
				location[0] = 4;
				location[1] = 1;
				break;
			case 4:
				location[0] = 4;
				location[1] = 4;
				break;
			case 5:
				location[0] = 4;
				location[1] = 7;
				break;
			case 6:
				location[0] = 7;
				location[1] = 1;
				break;
			case 7:
				location[0] = 7;
				location[1] = 4;
				break;
			case 8:
				location[0] = 7;
				location[1] = 7;
				break;
			}
		} else
			createBriefcasee();
	}

	// Although this method states to create the player, it actually set the
	// player's location to the starting coordinates which allows this method to
	// be more reusable 
	public void createPlayer() {
		location[0] = 8;
		location[1] = 0;
	}

	// to be used for loading purposes?
	public void setPlayer(int b, int c) {
		location[0] = b;
		location[1] = c;
	}

	// Jordan's part to fix to check for boundaries and maybe rooms too
	// public void moveCheck(int n) {
	// move(n);
	// do {
	// if (location[0] < 0){
	// location[0]++;
	// move(n);
	// }
	// else if (location[0] > 8){
	// location[0]--;
	// move(n);
	// }
	// } while (location[0] < 0 || location[0] > 8);
	// do {
	// if (location[1] < 0){
	// location[1]++;
	// move(n);
	// }
	// else if (location[1] > 8){
	// location[1]--;
	// move(n);
	// }
	// } while (location[1] < 0 || location[1] > 8);
	// }
	//
	public void move(int n) {
		switch (n) {
		case 1:
			location[0]--;
			break;
		case 2:
			location[1]--;
			break;
		case 3:
			location[0]++;
			break;
		case 4:
			location[1]++;
			break;
		}
	}

	public void unMove(int n) {
		switch (n) {
		case 1:
			location[0]++;
			break;
		case 2:
			location[1]++;
			break;
		case 3:
			location[0]--;
			break;
		case 4:
			location[1]--;
			break;
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

	public void createLocation() {
		location[0] = coordinateGenerator();
		location[1] = coordinateGenerator();
	}

	public void checkNotAtRooms() {
		int n = location[0];
		int m = location[1];
		// checking for rowY
		if (n == 1 || n == 4 || n == 7) {
			// and checking for columnX
			if (m == 1 || m == 4 || m == 7) {
				createLocation();
			}
		}
	}

}
