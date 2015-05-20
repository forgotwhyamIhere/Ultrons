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

	public void setRooms(int i, int j){
		if (i == 2 && j == 2)
			map[i][j] = "[R]";
		else if (i == 2 && j == 2)
			map[i][j] = "[R]";
		else if (i == 2 && j == 4)
			map[i][j] = "[R]";
		else if (i == 2 && j == 6)
			map[i][j] = "[R]";
		else if (i == 4 && j == 2)
			map[i][j] = "[R]";
		else if (i == 4 && j == 4)
			map[i][j] = "[R]";
		else if (i == 4 && j == 6)
			map[i][j] = "[R]";
		else if (i == 6 && j == 2)
			map[i][j] = "[R]";
		else if (i == 6 && j == 4)
			map[i][j] = "[R]";
		else if (i == 6 && j == 6)
			map[i][j] = "[R]";
		else
			map[i][j] = "[*]";
	}

	public void printMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				setRooms(i,j);
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
}
