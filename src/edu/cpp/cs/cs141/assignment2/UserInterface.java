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
	int[] roomCoordinate = new int[] { 1, 4, 7 };
	int[] eLocation0 = new int[2];
	int[] eLocation1 = new int[2];
	int[] eLocation2 = new int[2];
	int[] eLocation3 = new int[2];
	int[] eLocation4 = new int[2];
	int[] eLocation5 = new int[2];
	int[] eLocation6 = new int[2];
	int[] aB = new int[2];
	int[] invin = new int[2];
	int[] rad = new int[2];

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
		// else if (i == 2 && j == 2)
		// map[i][j] = "[R]";
		// else if (i == 2 && j == 2)
		// map[i][j] = "[R]";
		// else if (i == 2 && j == 4)
		// map[i][j] = "[R]";
		// else if (i == 2 && j == 6)
		// map[i][j] = "[R]";
		// else if (i == 4 && j == 2)
		// map[i][j] = "[R]";
		// else if (i == 4 && j == 4)
		// map[i][j] = "[R]";
		// else if (i == 4 && j == 6)
		// map[i][j] = "[R]";
		// else if (i == 6 && j == 2)
		// map[i][j] = "[R]";
		// else if (i == 6 && j == 4)
		// map[i][j] = "[R]";
		// else if (i == 6 && j == 6)
		// map[i][j] = "[R]";
		else if (i == eLocation1[0] && j == eLocation1[1])
			map[i][j] = "[A]";
		else if (i == eLocation2[0] && j == eLocation2[1])
			map[i][j] = "[A]";
		else if (i == eLocation3[0] && j == eLocation3[1])
			map[i][j] = "[A]";
		else if (i == eLocation4[0] && j == eLocation4[1])
			map[i][j] = "[A]";
		else if (i == eLocation5[0] && j == eLocation5[1])
			map[i][j] = "[A]";
		else if (i == eLocation6[0] && j == eLocation6[1])
			map[i][j] = "[A]";
		else if (i == aB[0] && j == aB[1])
			map[i][j] = "[b]";
		else if (i == invin[0] && j == invin[1])
			map[i][j] = "[i]";
		else if (i == rad[0] && j == rad[1])
			map[i][j] = "[r]";
		// else if(){
		// for (int a = 0; a < roomCoordinate.length; a++) {
		// if (i == roomCoordinate[a]) {
		// for (int b = 0; b < roomCoordinate.length; b++) {
		// if (j == roomCoordinate[b]) {
		// map[i][j] = "[R]";
		// break;
		else if (i == 1 || i == 4 | i == 7) {
			if (j == 1 || j == 4 | j == 7)
				map[i][j] = "[R]";
			else
				map[i][j] = "[*]";
		} else
			map[i][j] = "[*]";
	}

	public void printMap() {
		enemyG1();
		enemyG2();
		enemyG3();
		enemyG4();
		enemyG5();
		enemyG6();
		additionalBullet();
		invincibility();
		radar();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				setRooms(i, j);
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	// will place in enemy class as constructor
	public void enemyG1() {
		positionChecking();
		eLocation1[0] = eLocation0[0];
		eLocation1[1] = eLocation0[1];
	}

	public void enemyG2() {
		positionChecking();
		eLocation2[0] = eLocation0[0];
		eLocation2[1] = eLocation0[1];
	}

	public void enemyG3() {
		positionChecking();
		eLocation3[0] = eLocation0[0];
		eLocation3[1] = eLocation0[1];
	}

	public void enemyG4() {
		positionChecking();
		eLocation4[0] = eLocation0[0];
		eLocation4[1] = eLocation0[1];
	}

	public void enemyG5() {
		positionChecking();
		eLocation5[0] = eLocation0[0];
		eLocation5[1] = eLocation0[1];
	}

	public void enemyG6() {
		positionChecking();
		eLocation6[0] = eLocation0[0];
		eLocation6[1] = eLocation0[1];
	}

	public void positionChecking() {
		int a = coordinateGenerater();
		int b = coordinateGenerater();
		if (a <= map.length - 4) {
			eLocation0[0] = a;
			eLocation0[1] = b;
		} else if (a > map.length - 4) {
			if (b <= 5) {
				positionChecking();
			} else
				eLocation0[1] = b;
		}
	}

	public void additionalBullet() {
		aB[0] = coordinateGenerater();
		aB[1] = coordinateGenerater();
	}

	public void invincibility() {
		invin[0] = coordinateGenerater();
		invin[1] = coordinateGenerater();
	}

	public void radar() {
		rad[0] = coordinateGenerater();
		rad[1] = coordinateGenerater();
	}

	// public int ninjaSpawning(int n) {
	// int n = coordinateGenerater();
	// return n;
	// }

	public int coordinateGenerater() {
		int number;
		Random rN = new Random();
		number = rN.nextInt(map.length - 1);
		return number;
	}
}
