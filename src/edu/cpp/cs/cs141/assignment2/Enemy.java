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
		createLocation();
		checkNotNearStart();
		checkNotAtRooms();
	}

	// Jordan's modified solution
	public void checkNotNearStart() {
		if (getArrayRowY() > 5) {
			if (getArrayColumnX() < 3) {
				createEnemy();
			}
		}
	}


	public void moveEnemy() {
		int n = directionGenerator();
		n++;
		moveCheck(n);
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
