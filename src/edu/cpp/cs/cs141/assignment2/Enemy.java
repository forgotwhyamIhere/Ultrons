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
public class Enemy extends ActiveAgents {
	/**
	 * Initializes an enemy.
	 */
	public Enemy() {
		createEnemy();
	}

	public void createEnemy() {
		crateLocation();
		checkNotNearStart();
		checkNotAtRooms();
	}

	// Jordan's modified solution
	public void checkNotNearStart() {
		if (location[0] > 5) {
			if (location[1] < 4) {
				createEnemy();
			}
		}
	}

	/**
	 * Handles the killing of an enemy.
	 */
	public void die() {
	}

}
