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

/**
 * @author
 *
 */
public class PowerUps extends ActiveAgents {
	/**
	 * 
	 */
	public PowerUps() {
		createPowerup();
	}

	public void createPowerup() {
		createLocation();
		checkNotAtStart();
		checkNotAtRooms();
	}

	public void checkNotAtStart() {
		if (getArrayRowY() == 8) {
			if (getArrayColumnX() == 0) {
				createPowerup();
			}
		}
	}

	// /**
	// *
	// */
	// public void loseLife() {
	// }

	/**
	 * 
	 */
	public void invincible() {
	}

	/**
	 * Getter for health
	 * 
	 * @return
	 */
	public int getHealth() {
		return 0;
	}

	/**
	 * Getter for powerup status?
	 * 
	 * @return
	 */
	public String getStatus() {
		return null;
	}

}
