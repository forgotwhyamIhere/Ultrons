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
//import java.util.Scanner;

/**
 * @author
 *
 */
public class dummy {

	// combine this into Interface/GameEngine, reorganize ActiveAgents
	// super/subclasses
	public void playerTurn() {	// renamed to turns
		String direction; 
		switch (menuOptions()){
		case 1:
			printMap();
			
//			switch (getMoveDirection()) {
//			case 1:
//				x = (insert current position of player from getPosition method in Player or ActiveAgents);
//				y = (insert current position of player from getPosition method in Player or ActiveAgents) + 1;
//				break;
//			case 2:
//				x = (insert current position of player from getPosition method in Player or ActiveAgents) + 1;
//				y = (insert current position of player from getPosition method in Player or ActiveAgents);
//				break;
//			case 3:
//				x = (insert current position of player from getPosition method in Player or ActiveAgents);
//				y = (insert current position of player from getPosition method in Player or ActiveAgents) - 1;
//				break;
//			case 4:
//				x = (insert current position of player from getPosition method in Player or ActiveAgents) - 1;
//				y = (insert current position of player from getPosition method in Player or ActiveAgents);
//				break;
//			}
			
			if (insert method that checks if the space is valid for the position i.e. not a room or whatever){
				(code that sets the new coordinates found in the switch case from (x,y));
			}
			
			PowerUps p;
			if (insert method that checks if player has landed on a letter that designates a powerup){
				switch (p.getSymbol()){ //The PowerUps class is going to need a method that checks what powerup you receive fromthe board.
				case 'A': //Assuming A is going to be the Ammo powerup
					p.powerUse(); //There is going to need to be a method that designates the usage of each powerup
					geClass.(whatever method will add Ammo to the player count of ammo.)
					break;
				case 'I': //Assuming I is going to be the Invincibility powerup
					p.powerUse();
					geClass.(whatever method will add Invincibility to the player effect)
					break;
				case 'R': //Assuming R is going to be the Radar powerup
					p.powerUse();
					(insert method that is going to handle radar vision)
					break;
				}
			}
		case 2:
			printMap();
//			switch (getShotDirection()) {
//			case 1:
//				direction = north;
//				break;
//			case 2:
//				direction = east;
//				break;
//			case 3:
//				direction = south;
//				break;
//			case 4:
//				direction = west;
//				break;
//			}
			
			if (direction != null) {
//				if (method thaaeat checks if enemy is present at the location and returns true or false?) {
//					System.out.println("You hit the ninja. It had to be done.");
//				} else {
//					System.out.println("You thought it was a ninja, but it was just some dust or something.");
//				}
			}
		case 3:
			System.out.println("Enter the save name: ")
			String saveName = kb.nextLine();
			System.out.println("Just kidding, this feature isn't available yet.")
			geClass.quit();
		}
	}

	public int menuOptions() {
		System.out.println("Options");
		System.out.println("1. Move!");
		System.out.println("2. Shoot!");
		System.out.println("3. Save!");
		return kb.nextInt();
	}

	// public int getMoveDirection() {
	// System.out.println("Where to move...?");
	// System.out.println("1. North");
	// System.out.println("2. East");
	// System.out.println("3. South");
	// System.out.println("4. West");
	// return this.kb.nextInt();
	// }

	public int getShotDirection() {
		System.out.println("Where to shoot...?");
		System.out.println("1. North");
		System.out.println("2. East");
		System.out.println("3. South");
		System.out.println("4. West");
		return this.kb.nextInt();
	}

	// System.out
	// .println("In which direction, would you like to move toward? \n"
	// + "1. Up \n"
	// + "2. Left \n"
	// + "3. Down \n"
	// + "4. Right");
	// response = kb.nextInt();

	// method not complete
	public void hitEnterToContinue() {
		System.out.println("Please press Enter to continue.");
	}
	/**
	 * Idea for saving and loading: Start-generates new values Save-records
	 * current values Load-set values according to the save date Hows this
	 * works, requires the rest of the program to be written
	 */

	// Comments and past statements....................................

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

	// public int upArrayRowY() {
	// location[0]--;
	// return location[0];
	// }
	//
	// public int downArrayRowY() {
	// location[0]++;
	// return location[0];
	// }
	//
	// public int rightArrayColumnX() {
	// location[1]++;
	// return location[1];
	// }
	//
	// public int leftArrayColumnX() {
	// location[1]--;
	// return location[1];
	// }
	// public void move(int n) {
	// switch (n) {
	// case 1:
	// upArrayRowY();
	// break;
	// case 2:
	// leftArrayColumnX();
	// break;
	// case 3:
	// downArrayRowY();
	// break;
	// case 4:
	// rightArrayColumnX();
	// break;
	// }
	// }// public int upArrayRowY() {
	// location[0]--;
	// return location[0];
	// }
	//
	// public int downArrayRowY() {
	// location[0]++;
	// return location[0];
	// }
	//
	// public int rightArrayColumnX() {
	// location[1]++;
	// return location[1];
	// }
	//
	// public int leftArrayColumnX() {
	// location[1]--;
	// return location[1];
	// }
	// public void move(int n) {
	// switch (n) {
	// case 1:
	// upArrayRowY();
	// break;
	// case 2:
	// leftArrayColumnX();
	// break;
	// case 3:
	// downArrayRowY();
	// break;
	// case 4:
	// rightArrayColumnX();
	// break;
	// }
	// }

	// int[] aB = new int[2];
	// int[] invin = new int[2];
	// int[] rad = new int[2];
	//
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
	//
	// else if (i == 1 || i == 4 | i == 7) {
	// // and checking for columnX
	// if (j == 1 || j == 4 | j == 7) {
	// map[i][j] = "[R]"; }
	// }
	// else if(){
	//
	// for (int a = 0; a < roomCoordinate.length; a++) {
	// if (i == roomCoordinate[a]) {
	// for (int b = 0; b < roomCoordinate.length; b++) {
	// if (j == roomCoordinate[b]) {
	// map[i][j] = "[R]";
	// break;

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

	// public int upArrayRowY() {
	// location[0]--;
	// return location[0];
	// }
	//
	// public int downArrayRowY() {
	// location[0]++;
	// return location[0];
	// }
	//
	// public int rightArrayColumnX() {
	// location[1]++;
	// return location[1];
	// }
	//
	// public int leftArrayColumnX() {
	// location[1]--;
	// return location[1];
	// }
	// public void move(int n) {
	// switch (n) {
	// case 1:
	// upArrayRowY();
	// break;
	// case 2:
	// leftArrayColumnX();
	// break;
	// case 3:
	// downArrayRowY();
	// break;
	// case 4:
	// rightArrayColumnX();
	// break;
	// }
	// }

}
