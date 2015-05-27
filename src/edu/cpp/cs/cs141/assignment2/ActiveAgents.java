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
		createPlayer();
	}

	public void createPlayer() {
		location[0] = 8;
		location[1] = 0;
	}
	
//	//to be used for loading purposes
//	public void setPlayer() {
//		location[0] = ?;
//		location[1] = ?;
//	}
	
	//If EQ was writing from scatch, EQ would probably use nested if instead of this unfamilar loop
//	public void moveCheck(int n) {
//		move(n);
//		  do {
//			   if (location[0] < 0){
//			    location[0]++;
//			    move(n);
//			   }
//			   else if (location[0] > 8){
//			    location[0]--;
//			    move(n);
//			   }
//			  } while (location[0] < 0 || location[0] > 8);
//			  do {
//			   if (location[1] < 0){
//			    location[1]++;
//			    move(n);
//			   }
//			   else if (location[1] > 8){
//			    location[1]--;
//			    move(n);
//			   }
//			  } while (location[1] < 0 || location[1] > 8);
//	}
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
	
//	public int upArrayRowY() {
//		location[0]--;
//		return location[0];
//	}
//
//	public int downArrayRowY() {
//		location[0]++;
//		return location[0];
//	}
//
//	public int rightArrayColumnX() {
//		location[1]++;
//		return location[1];
//	}
//
//	public int leftArrayColumnX() {
//		location[1]--;
//		return location[1];
//	}
//	public void move(int n) {
//		switch (n) {
//		case 1:
//			upArrayRowY();
//			break;
//		case 2:
//			leftArrayColumnX();
//			break;
//		case 3:
//			downArrayRowY();
//			break;
//		case 4:
//			rightArrayColumnX();
//			break;
//		}
//	}

	public int directionGenerator() {
		int number;
		Random rN = new Random();
		number = rN.nextInt(3);
		return number;
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
		if (n == 1 || n == 4 | n == 7) {
			// and checking for columnX
			if (m == 1 || m == 4 | m == 7) {
				createLocation();
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
