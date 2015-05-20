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
	private String[][] map = new String[9][9];

	int[] roomCoordinate = new int[] { 2, 4, 6 };

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
	public void enemyActions() {

	}

	/**
	 * Getter for location of player and objects on the board
	 * 
	 * @return
	 */
	public int[][] getLocation() {
		return null;
	}

	public void setRooms(int i, int j) {
		if (i == map.length -1 && j == 0){
			map[i][j] = "[S]";
		}
		else{
			for (int a = 0; a < roomCoordinate.length; a++) {
				if (i == roomCoordinate[a]) {
					for (int b = 0;b < roomCoordinate.length;b++) {
						if (j == roomCoordinate[b]) {
							map[i][j] = "[R]";
							break;
						}
					}
				} else
					map[i][j] = "[*]";
			}
		}
	}

	public void printMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				setRooms(i, j);
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

}
