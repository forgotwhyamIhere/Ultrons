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
	// private GameEngine geClass = new GameEngine(this);
	/**
	 * 
	 */
	private Scanner kb = new Scanner(System.in);
	/**
	 * 
	 */
	private String[][] map = new String[9][9];
	private Enemy enemy1;
	private Enemy enemy2;
	private Enemy enemy3;
	private Enemy enemy4;
	private Enemy enemy5;
	private Enemy enemy6;
	// int[] aB = new int[2];
	// int[] invin = new int[2];
	// int[] rad = new int[2];
	private ActiveAgents aB = new ActiveAgents();
	private ActiveAgents invin = new ActiveAgents();
	private ActiveAgents rad = new ActiveAgents();

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

	public void setMap(int i, int j) {
		// to be replaced with Player class constructor
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
		// checking for rowY

		// else if (i == 1 || i == 4 | i == 7) {
		// // and checking for columnX
		// if (j == 1 || j == 4 | j == 7) {
		// map[i][j] = "[R]"; }
		// }
		else if (i == enemy1.location[0] && j == enemy1.location[1])
			map[i][j] = "[A]";
		else if (i == enemy2.location[0] && j == enemy2.location[1])
			map[i][j] = "[A]";
		else if (i == enemy3.location[0] && j == enemy3.location[1])
			map[i][j] = "[A]";
		else if (i == enemy4.location[0] && j == enemy4.location[1])
			map[i][j] = "[A]";
		else if (i == enemy5.location[0] && j == enemy5.location[1])
			map[i][j] = "[A]";
		else if (i == enemy6.location[0] && j == enemy6.location[1])
			map[i][j] = "[A]";
		else if (i == aB.location[0] && j == aB.location[1])
			map[i][j] = "[b]";
		else if (i == invin.location[0] && j == invin.location[1])
			map[i][j] = "[i]";
		else if (i == rad.location[0] && j == rad.location[1])
			map[i][j] = "[r]";
		// else if(){
		// for (int a = 0; a < roomCoordinate.length; a++) {
		// if (i == roomCoordinate[a]) {
		// for (int b = 0; b < roomCoordinate.length; b++) {
		// if (j == roomCoordinate[b]) {
		// map[i][j] = "[R]";
		// break;
		else if (i == 1 || i == 4 || i == 7) {
			if (j == 1 || j == 4 || j == 7)
				map[i][j] = "[R]";
			else
				map[i][j] = "[*]";
		} else
			map[i][j] = "[*]";
	}

	public void printMap() {
		makeEnemies();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				setMap(i, j);
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	// // will place in enemy class as constructor
	// public void enemyG1() {
	// positionChecking();
	// eLocation1[0] = eLocation0[0];
	// eLocation1[1] = eLocation0[1];
	// }
	// public void enemyG2() {
	// positionChecking();
	// eLocation2[0] = eLocation0[0];
	// eLocation2[1] = eLocation0[1];
	// }
	// public void enemyG3() {
	// positionChecking();
	// eLocation3[0] = eLocation0[0];
	// eLocation3[1] = eLocation0[1];
	// }
	// public void enemyG4() {
	// positionChecking();
	// eLocation4[0] = eLocation0[0];
	// eLocation4[1] = eLocation0[1];
	// }
	// public void enemyG5() {
	// positionChecking();
	// eLocation5[0] = eLocation0[0];
	// eLocation5[1] = eLocation0[1];
	// }
	// public void enemyG6() {
	// positionChecking();
	// eLocation6[0] = eLocation0[0];
	// eLocation6[1] = eLocation0[1];
	// }

	// public void positionChecking() {
	// int a = coordinateGenerater();
	// int b = coordinateGenerater();
	// if (a <= map.length - 4) {
	// eLocation0[0] = a;
	// eLocation0[1] = b;
	// } else if (a > map.length - 3) {
	// if (b <= map.length - 3) {
	// positionChecking();
	// } else if (b > map[a].length - 3)
	// eLocation0[1] = b;
	// }
	// if (a == 1 || a == 4 | a == 7) {
	// if (b == 1 || b == 4 | b == 7)
	// positionChecking();
	// else
	// positionChecking();
	// }
	// }

	// public void additionalBullet() {
	// positionChecking();
	// aB[0] = eLocation0[0];
	// aB[1] = eLocation0[1];
	// }
	//
	// public void invincibility() {
	// positionChecking();
	// invin[0] = eLocation0[0];
	// invin[1] = eLocation0[1];
	// }
	//
	// public void radar() {
	// positionChecking();
	// rad[0] = eLocation0[0];
	// rad[1] = eLocation0[1];
	// }

	// public int ninjaSpawning(int n) {
	// int n = coordinateGenerater();
	//
	// return n;
	// }

	// public int coordinateGenerater() {
	// int number;
	// Random rN = new Random();
	// number = rN.nextInt(map.length - 1);
	// return number;
	// }

	// Is there a shorter way to do this?
	public void makeEnemies() {
		enemy1 = new Enemy();
		makeEnemy2();
		makeEnemy3();
		makeEnemy4();
		makeEnemy5();
		makeEnemy6();
	}

	// Is it IF or IF ELSE? to prevent overlap. Probably should be in GameEngine
	// class, somehow
	public void makeEnemy2() {
		enemy2 = new Enemy();
		checkEnemy2();
	}

	public void checkEnemy2() {
		if (enemy2.location[0] == enemy1.location[0]) {
			if (enemy2.location[1] == enemy1.location[1]) {
				makeEnemy2();
			}
		}
	}

	public void makeEnemy3() {
		enemy3 = new Enemy();
		checkEnemy3();
	}

	public void checkEnemy3() {
		if (enemy3.location[0] == enemy1.location[0]) {
			if (enemy3.location[1] == enemy1.location[1]) {
				makeEnemy3();
			}
		}
		if (enemy3.location[0] == enemy2.location[0]) {
			if (enemy3.location[1] == enemy2.location[1]) {
				makeEnemy3();
			}
		}
	}

	public void makeEnemy4() {
		enemy4 = new Enemy();
		checkEnemy4();
	}

	public void checkEnemy4() {
		if (enemy4.location[0] == enemy1.location[0]) {
			if (enemy4.location[1] == enemy1.location[1]) {
				makeEnemy4();
			}
		}
		if (enemy4.location[0] == enemy2.location[0]) {
			if (enemy4.location[1] == enemy2.location[1]) {
				makeEnemy4();
			}
		}
		if (enemy4.location[0] == enemy3.location[0]) {
			if (enemy4.location[1] == enemy3.location[1]) {
				makeEnemy4();
			}
		}
	}

	public void makeEnemy5() {
		enemy5 = new Enemy();
		checkEnemy5();
	}

	public void checkEnemy5() {
		if (enemy5.location[0] == enemy1.location[0]) {
			if (enemy5.location[1] == enemy1.location[1]) {
				makeEnemy5();
			}
		}
		if (enemy5.location[0] == enemy2.location[0]) {
			if (enemy5.location[1] == enemy2.location[1]) {
				makeEnemy5();
			}
		}
		if (enemy5.location[0] == enemy3.location[0]) {
			if (enemy5.location[1] == enemy3.location[1]) {
				makeEnemy5();
			}
		}
		if (enemy5.location[0] == enemy4.location[0]) {
			if (enemy5.location[1] == enemy4.location[1]) {
				makeEnemy5();
			}
		}
	}

	public void makeEnemy6() {
		enemy6 = new Enemy();
		checkEnemy6();
	}

	public void checkEnemy6() {
		if (enemy6.location[0] == enemy1.location[0]) {
			if (enemy6.location[1] == enemy1.location[1]) {
				makeEnemy6();
			}
		}
		if (enemy6.location[0] == enemy2.location[0]) {
			if (enemy6.location[1] == enemy2.location[1]) {
				makeEnemy6();
			}
		}
		if (enemy6.location[0] == enemy3.location[0]) {
			if (enemy6.location[1] == enemy3.location[1]) {
				makeEnemy6();
			}
		}
		if (enemy6.location[0] == enemy4.location[0]) {
			if (enemy6.location[1] == enemy4.location[1]) {
				makeEnemy6();
			}
		}
		if (enemy6.location[0] == enemy5.location[0]) {
			if (enemy6.location[1] == enemy5.location[1]) {
				makeEnemy6();
			}
		}
	}

	// method not complete
	public void hitEnterToContinue() {
		System.out.println("Please press Enter to continue.");
	}
	/**
	 * Idea for saving and loading: Start-generates new values Save-records
	 * current values Load-set values according to the save date Hows this
	 * works, requires the rest of the program to be written
	 */
}
