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
	private int mapColumn = map.length;
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
		if (i == map.length - 1 && j == 0) {
			map[i][j] = "[S]";
		} 
		else if (i == 2 && j == 2)
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
		else if ()
			map[i][j] = "[A]";
		else if ()
			map[i][j] = "[A]";
		else if ()
			map[i][j] = "[A]";
		else if ()
			map[i][j] = "[A]";
		else if ()
			map[i][j] = "[A]";
		else if ()
			map[i][j] = "[A]";
		else if ()
			map[i][j] = "[I]";
		else if ()
			map[i][j] = "[B]";
		else if ()
			map[i][j] = "[R]";
		else {
//			for (int a = 0; a < roomCoordinate.length; a++) {
//				if (i == roomCoordinate[a]) {
//					for (int b = 0; b < roomCoordinate.length; b++) {
//						if (j == roomCoordinate[b]) {
//							map[i][j] = "[R]";
//							break;
//						}
//					}
//				} else
					map[i][j] = "[*]";
//			}
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

	// will place in enemy class as constructor 
	public void enemyG1(){
        int[] eLocation= new int[2];
        eLocation[0] = position 

	}
		
		
	
	public boolean positionChecking(int a, int b){
		if (a == map.length -1 && j == 0){
			map[i][j] = "[S]";
		}}
	}

	public int ninjaSpawning(int n) {
		int n = coordinateGenerater();
		if (n >= map.length - 4) {
			if (n <= 5) {
				ninjaSpawning();
			}
		}
		return n;
	}

	public int coordinateGenerater() {
		int number;
		Random rN = new Random();
		number = rN.nextInt(map.length - 1);
		return number;
	}
}
