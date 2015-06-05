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

//import java.util.Random;

/**
 * @author
 *
 */
public class Enemy extends ActiveAgents {
	// Changing this number requires to also change the enemies array in the
	// GameEngine class
	int enemyCount = 6;

	/**
	 * Initializes an enemy.
	 */
	public Enemy() {
		createEnemy();
	}

	public void createEnemy() {
		createLocation();
		// checkNotNearStart();
		// checkNotAtRooms();
	}

	// // Jordan's modified solution
	// public void checkNotNearStart() {
	// if (getArrayRowY() > 5) {
	// if (getArrayColumnX() < 3) { // hope this part is correct, where
	// // enemies are spawn outside of the
	// // safe zone
	// createEnemy();
	// }
	// }
	// }

	public void lossEnemy() {
		enemyCount--;
	}

	public int getEnemyCount() {
		return enemyCount;
	}

	public int directionGenerator() {
		int number;
		Random rN = new Random();
		number = rN.nextInt(3);
		return number;
	}

	public int moveEnemy() {
		int n = directionGenerator();
		n++;
		move(n);
		return n;
	}

	/**
	 * Handles the killing of an enemy. In this case, the enemy is sent so far
	 * off the map that it will most likely not return.
	 */
	public void die() {
		for (int i = 0; i < 999; i++)
			move(4);
	}

}
