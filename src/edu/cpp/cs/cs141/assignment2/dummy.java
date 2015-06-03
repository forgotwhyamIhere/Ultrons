///**
// * CS 141: Introduction to Programming and Problem Solving
// * Professor: Edwin Rodr&iacute;guez
// *
// * Programming Assignment #N
// *
// * <description-of-assignment>
// *
// * Team Ultrons
// *   <Jordan Tien, Jaime Lopez, Justin Galloway, Edward Quach>
// */
//package edu.cpp.cs.cs141.assignment2;
//
////import java.util.Random;
////import java.util.Scanner;
//
///**
// * @author
// *
// */
//public class dummy {
//
//	// combine this into Interface/GameEngine, reorganize ActiveAgents
//	// super/subclasses
//	// create briefcase
//	public void playerTurn() {	// renamed to turns
//		String direction; 
//		switch (menuOptions()){
//		case 1:
//			printMap();
//			
////			switch (getMoveDirection()) {
////			case 1:
////				x = (insert current position of player from getPosition method in Player or ActiveAgents);
////				y = (insert current position of player from getPosition method in Player or ActiveAgents) + 1;
////				break;
////			case 2:
////				x = (insert current position of player from getPosition method in Player or ActiveAgents) + 1;
////				y = (insert current position of player from getPosition method in Player or ActiveAgents);
////				break;
////			case 3:
////				x = (insert current position of player from getPosition method in Player or ActiveAgents);
////				y = (insert current position of player from getPosition method in Player or ActiveAgents) - 1;
////				break;
////			case 4:
////				x = (insert current position of player from getPosition method in Player or ActiveAgents) - 1;
////				y = (insert current position of player from getPosition method in Player or ActiveAgents);
////				break;
////			}
//			
//			if (insert method that checks if the space is valid for the position i.e. not a room or whatever){
//				(code that sets the new coordinates found in the switch case from (x,y));
//			}
//			
//			PowerUps p;
//			if (insert method that checks if player has landed on a letter that designates a powerup){
//				switch (p.getSymbol()){ //The PowerUps class is going to need a method that checks what powerup you receive fromthe board.
//				case 'A': //Assuming A is going to be the Ammo powerup
//					p.powerUse(); //There is going to need to be a method that designates the usage of each powerup
//					geClass.(whatever method will add Ammo to the player count of ammo.)
//					break;
//				case 'I': //Assuming I is going to be the Invincibility powerup
//					p.powerUse();
//					geClass.(whatever method will add Invincibility to the player effect)
//					break;
//				case 'R': //Assuming R is going to be the Radar powerup
//					p.powerUse();
//					(insert method that is going to handle radar vision)
//					break;
//				}
//			}
//		case 2:
//			printMap();
////			switch (getShotDirection()) {
////			case 1:
////				direction = north;
////				break;
////			case 2:
////				direction = east;
////				break;
////			case 3:
////				direction = south;
////				break;
////			case 4:
////				direction = west;
////				break;
////			}
//			
//			if (direction != null) {
////				if (method thaaeat checks if enemy is present at the location and returns true or false?) {
////					System.out.println("You hit the ninja. It had to be done.");
////				} else {
////					System.out.println("You thought it was a ninja, but it was just some dust or something.");
////				}
//			}
//		case 3:
//			System.out.println("Enter the save name: ")
//			String saveName = kb.nextLine();
//			System.out.println("Just kidding, this feature isn't available yet.")
//			geClass.quit();
//		}
//	}
//
//	public int menuOptions() {
//		System.out.println("Options");
//		System.out.println("1. Move!");
//		System.out.println("2. Shoot!");
//		System.out.println("3. Save!");
//		return kb.nextInt();
//	}
//
//	// public int getMoveDirection() {
//	// System.out.println("Where to move...?");
//	// System.out.println("1. North");
//	// System.out.println("2. East");
//	// System.out.println("3. South");
//	// System.out.println("4. West");
//	// return this.kb.nextInt();
//	// }
//
//	public int getShotDirection() {
//		System.out.println("Where to shoot...?");
//		System.out.println("1. North");
//		System.out.println("2. East");
//		System.out.println("3. South");
//		System.out.println("4. West");
//		return this.kb.nextInt();
//	}
//
//	// System.out
//	// .println("In which direction, would you like to move toward? \n"
//	// + "1. Up \n"
//	// + "2. Left \n"
//	// + "3. Down \n"
//	// + "4. Right");
//	// response = kb.nextInt();
//
//	// method not complete
//	public void hitEnterToContinue() {
//		System.out.println("Please press Enter to continue.");
//	}
//	/**
//	 * Idea for saving and loading: Start-generates new values Save-records
//	 * current values Load-set values according to the save date Hows this
//	 * works, requires the rest of the program to be written
//	 */
//
//	// Comments and past statements....................................
//
//	// // will place in enemy class as constructor
//	// public void enemyG1() {
//	// positionChecking();
//	// eLocation1[0] = eLocation0[0];
//	// eLocation1[1] = eLocation0[1];
//	// }
//	// public void enemyG2() {
//	// positionChecking();
//	// eLocation2[0] = eLocation0[0];
//	// eLocation2[1] = eLocation0[1];
//	// }
//	// public void enemyG3() {
//	// positionChecking();
//	// eLocation3[0] = eLocation0[0];
//	// eLocation3[1] = eLocation0[1];
//	// }
//	// public void enemyG4() {
//	// positionChecking();
//	// eLocation4[0] = eLocation0[0];
//	// eLocation4[1] = eLocation0[1];
//	// }
//	// public void enemyG5() {
//	// positionChecking();
//	// eLocation5[0] = eLocation0[0];
//	// eLocation5[1] = eLocation0[1];
//	// }
//	// public void enemyG6() {
//	// positionChecking();
//	// eLocation6[0] = eLocation0[0];
//	// eLocation6[1] = eLocation0[1];
//	// }
//
//	// public void positionChecking() {
//	// int a = coordinateGenerater();
//	// int b = coordinateGenerater();
//	// if (a <= map.length - 4) {
//	// eLocation0[0] = a;
//	// eLocation0[1] = b;
//	// } else if (a > map.length - 3) {
//	// if (b <= map.length - 3) {
//	// positionChecking();
//	// } else if (b > map[a].length - 3)
//	// eLocation0[1] = b;
//	// }
//	// if (a == 1 || a == 4 | a == 7) {
//	// if (b == 1 || b == 4 | b == 7)
//	// positionChecking();
//	// else
//	// positionChecking();
//	// }
//	// }
//
//	// public void additionalBullet() {
//	// positionChecking();
//	// aB[0] = eLocation0[0];
//	// aB[1] = eLocation0[1];
//	// }
//	//
//	// public void invincibility() {
//	// positionChecking();
//	// invin[0] = eLocation0[0];
//	// invin[1] = eLocation0[1];
//	// }
//	//
//	// public void radar() {
//	// positionChecking();
//	// rad[0] = eLocation0[0];
//	// rad[1] = eLocation0[1];
//	// }
//
//	// public int ninjaSpawning(int n) {
//	// int n = coordinateGenerater();
//	//
//	// return n;
//	// }
//
//	// public int coordinateGenerater() {
//	// int number;
//	// Random rN = new Random();
//	// number = rN.nextInt(map.length - 1);
//	// return number;
//	// }
//
//	// public int upArrayRowY() {
//	// location[0]--;
//	// return location[0];
//	// }
//	//
//	// public int downArrayRowY() {
//	// location[0]++;
//	// return location[0];
//	// }
//	//
//	// public int rightArrayColumnX() {
//	// location[1]++;
//	// return location[1];
//	// }
//	//
//	// public int leftArrayColumnX() {
//	// location[1]--;
//	// return location[1];
//	// }
//	// public void move(int n) {
//	// switch (n) {
//	// case 1:
//	// upArrayRowY();
//	// break;
//	// case 2:
//	// leftArrayColumnX();
//	// break;
//	// case 3:
//	// downArrayRowY();
//	// break;
//	// case 4:
//	// rightArrayColumnX();
//	// break;
//	// }
//	// }// public int upArrayRowY() {
//	// location[0]--;
//	// return location[0];
//	// }
//	//
//	// public int downArrayRowY() {
//	// location[0]++;
//	// return location[0];
//	// }
//	//
//	// public int rightArrayColumnX() {
//	// location[1]++;
//	// return location[1];
//	// }
//	//
//	// public int leftArrayColumnX() {
//	// location[1]--;
//	// return location[1];
//	// }
//	// public void move(int n) {
//	// switch (n) {
//	// case 1:
//	// upArrayRowY();
//	// break;
//	// case 2:
//	// leftArrayColumnX();
//	// break;
//	// case 3:
//	// downArrayRowY();
//	// break;
//	// case 4:
//	// rightArrayColumnX();
//	// break;
//	// }
//	// }
//
//	// int[] aB = new int[2];
//	// int[] invin = new int[2];
//	// int[] rad = new int[2];
//	//
//	// else if (i == 2 && j == 2)
//	// map[i][j] = "[R]";
//	// else if (i == 2 && j == 2)
//	// map[i][j] = "[R]";
//	// else if (i == 2 && j == 4)
//	// map[i][j] = "[R]";
//	// else if (i == 2 && j == 6)
//	// map[i][j] = "[R]";
//	// else if (i == 4 && j == 2)
//	// map[i][j] = "[R]";
//	// else if (i == 4 && j == 4)
//	// map[i][j] = "[R]";
//	// else if (i == 4 && j == 6)
//	// map[i][j] = "[R]";
//	// else if (i == 6 && j == 2)
//	// map[i][j] = "[R]";
//	// else if (i == 6 && j == 4)
//	// map[i][j] = "[R]";
//	// else if (i == 6 && j == 6)
//	// map[i][j] = "[R]";
//	// checking for rowY
//	//
//	// else if (i == 1 || i == 4 | i == 7) {
//	// // and checking for columnX
//	// if (j == 1 || j == 4 | j == 7) {
//	// map[i][j] = "[R]"; }
//	// }
//	// else if(){
//	//
//	// for (int a = 0; a < roomCoordinate.length; a++) {
//	// if (i == roomCoordinate[a]) {
//	// for (int b = 0; b < roomCoordinate.length; b++) {
//	// if (j == roomCoordinate[b]) {
//	// map[i][j] = "[R]";
//	// break;
//
//	// // Jordan's solution with this class's fields
//	// public void positionChecking() {
//	// int a = coordinateGenerator();
//	// int b = coordinateGenerator();
//	// if (a <= 5) {
//	// location[0] = a;
//	// location[1] = b;
//	// } else if (b >= 4) {
//	// location[0] = a;
//	// location[1] = b;
//	// }
//	// }
//	//
//	// // Jordan's original solution
//	// public void positionChecking() {
//	// int a = coordinateGenerator();
//	// int b = coordinateGenerator();
//	// if (a <= map.length - 4) {
//	// eLocation0[0] = a;
//	// eLocation0[1] = b;
//	// } else if (b >= map.length - 5) {
//	// eLocation0[0] = a;
//	// eLocation0[1] = b;
//	// }
//	// }
//
//	// public int upArrayRowY() {
//	// location[0]--;
//	// return location[0];
//	// }
//	//
//	// public int downArrayRowY() {
//	// location[0]++;
//	// return location[0];
//	// }
//	//
//	// public int rightArrayColumnX() {
//	// location[1]++;
//	// return location[1];
//	// }
//	//
//	// public int leftArrayColumnX() {
//	// location[1]--;
//	// return location[1];
//	// }
//	// public void move(int n) {
//	// switch (n) {
//	// case 1:
//	// upArrayRowY();
//	// break;
//	// case 2:
//	// leftArrayColumnX();
//	// break;
//	// case 3:
//	// downArrayRowY();
//	// break;
//	// case 4:
//	// rightArrayColumnX();
//	// break;
//	// }
//	// }
//
//	// private Enemy enemy1;
//	// private Enemy enemy2;
//	// private Enemy enemy3;
//	// private Enemy enemy4;
//	// private Enemy enemy5;
//	// private Enemy enemy6;
//
//	// // Is there a shorter way to do this?
//	// public void makeEnemies() {
//	// enemy1 = new Enemy();
//	// makeEnemy2();
//	// makeEnemy3();
//	// makeEnemy4();
//	// makeEnemy5();
//	// makeEnemy6();
//	// }
//	//
//	// public void makeEnemy2() {
//	// enemy2 = new Enemy();
//	// checkEnemy2();
//	// }
//	//
//	// public void checkEnemy2() {
//	// if (enemy2.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy2.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// makeEnemy2();
//	// }
//	// }
//	// }
//	//
//	// public void makeEnemy3() {
//	// enemy3 = new Enemy();
//	// checkEnemy3();
//	// }
//	//
//	// public void checkEnemy3() {
//	// if (enemy3.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy3.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// makeEnemy3();
//	// }
//	// }
//	// if (enemy3.getArrayRowY() == enemy2.getArrayRowY()) {
//	// if (enemy3.getArrayColumnX() == enemy2.getArrayColumnX()) {
//	// makeEnemy3();
//	// }
//	// }
//	// }
//	//
//	// public void makeEnemy4() {
//	// enemy4 = new Enemy();
//	// checkEnemy4();
//	// }
//	//
//	// public void checkEnemy4() {
//	// if (enemy4.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy4.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// makeEnemy4();
//	// }
//	// }
//	// if (enemy4.getArrayRowY() == enemy2.getArrayRowY()) {
//	// if (enemy4.getArrayColumnX() == enemy2.getArrayColumnX()) {
//	// makeEnemy4();
//	// }
//	// }
//	// if (enemy4.getArrayRowY() == enemy3.getArrayRowY()) {
//	// if (enemy4.getArrayColumnX() == enemy3.getArrayColumnX()) {
//	// makeEnemy4();
//	// }
//	// }
//	// }
//	//
//	// public void makeEnemy5() {
//	// enemy5 = new Enemy();
//	// checkEnemy5();
//	// }
//	//
//	// public void checkEnemy5() {
//	// if (enemy5.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy5.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// makeEnemy5();
//	// }
//	// }
//	// if (enemy5.getArrayRowY() == enemy2.getArrayRowY()) {
//	// if (enemy5.getArrayColumnX() == enemy2.getArrayColumnX()) {
//	// makeEnemy5();
//	// }
//	// }
//	// if (enemy5.getArrayRowY() == enemy3.getArrayRowY()) {
//	// if (enemy5.getArrayColumnX() == enemy3.getArrayColumnX()) {
//	// makeEnemy5();
//	// }
//	// }
//	// if (enemy5.getArrayRowY() == enemy4.getArrayRowY()) {
//	// if (enemy5.getArrayColumnX() == enemy4.getArrayColumnX()) {
//	// makeEnemy5();
//	// }
//	// }
//	// }
//	//
//	// public void makeEnemy6() {
//	// enemy6 = new Enemy();
//	// checkEnemy6();
//	// }
//	//
//	// public void checkEnemy6() {
//	// if (enemy6.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// makeEnemy6();
//	// }
//	// }
//	// if (enemy6.getArrayRowY() == enemy2.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy2.getArrayColumnX()) {
//	// makeEnemy6();
//	// }
//	// }
//	// if (enemy6.getArrayRowY() == enemy3.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy3.getArrayColumnX()) {
//	// makeEnemy6();
//	// }
//	// }
//	// if (enemy6.getArrayRowY() == enemy4.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy4.getArrayColumnX()) {
//	// makeEnemy6();
//	// }
//	// }
//	// if (enemy6.getArrayRowY() == enemy5.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy5.getArrayColumnX()) {
//	// makeEnemy6();
//	// }
//	// }
//	// }
//
//	//
//	// /**
//	// * Handles the random placement of enemies, items and briefcase on the
//	// * playing board array.
//	// */
//	// public void randomPlacement() {
//	// }
//	//
//	// // // Is there a shorter way to do this?
//	// // currently does not check for boundaries
//	// public void movingEnemies() {
//	// enemy1.moveEnemy();
//	// moveEnemy2();
//	// moveEnemy3();
//	// moveEnemy4();
//	// moveEnemy5();
//	// moveEnemy6();
//	// }
//	//
//	// public void moveEnemy2() {
//	// enemy2.moveEnemy();
//	// checkMoveEnemy2();
//	// }
//	//
//	// public void checkMoveEnemy2() {
//	// if (enemy2.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy2.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// moveEnemy2();
//	// }
//	// }
//	// }
//	//
//	// public void moveEnemy3() {
//	// enemy3.moveEnemy();
//	// checkMoveEnemy3();
//	// }
//	//
//	// public void checkMoveEnemy3() {
//	// if (enemy3.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy3.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// moveEnemy3();
//	// }
//	// }
//	// if (enemy3.getArrayRowY() == enemy2.getArrayRowY()) {
//	// if (enemy3.getArrayColumnX() == enemy2.getArrayColumnX()) {
//	// moveEnemy3();
//	// }
//	// }
//	// }
//	//
//	// public void moveEnemy4() {
//	// enemy4.moveEnemy();
//	// checkMoveEnemy4();
//	// }
//	//
//	// public void checkMoveEnemy4() {
//	// if (enemy4.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy4.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// moveEnemy4();
//	// }
//	// }
//	// if (enemy4.getArrayRowY() == enemy2.getArrayRowY()) {
//	// if (enemy4.getArrayColumnX() == enemy2.getArrayColumnX()) {
//	// moveEnemy4();
//	// }
//	// }
//	// if (enemy4.getArrayRowY() == enemy3.getArrayRowY()) {
//	// if (enemy4.getArrayColumnX() == enemy3.getArrayColumnX()) {
//	// moveEnemy4();
//	// }
//	// }
//	// }
//	//
//	// public void moveEnemy5() {
//	// enemy5.moveEnemy();
//	// checkMoveEnemy5();
//	// }
//	//
//	// public void checkMoveEnemy5() {
//	// if (enemy5.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy5.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// moveEnemy5();
//	// }
//	// }
//	// if (enemy5.getArrayRowY() == enemy2.getArrayRowY()) {
//	// if (enemy5.getArrayColumnX() == enemy2.getArrayColumnX()) {
//	// moveEnemy5();
//	// }
//	// }
//	// if (enemy5.getArrayRowY() == enemy3.getArrayRowY()) {
//	// if (enemy5.getArrayColumnX() == enemy3.getArrayColumnX()) {
//	// moveEnemy5();
//	// }
//	// }
//	// if (enemy5.getArrayRowY() == enemy4.getArrayRowY()) {
//	// if (enemy5.getArrayColumnX() == enemy4.getArrayColumnX()) {
//	// moveEnemy5();
//	// }
//	// }
//	// }
//	//
//	// public void moveEnemy6() {
//	// enemy6.moveEnemy();
//	// checkMoveEnemy6();
//	// }
//	//
//	// public void checkMoveEnemy6() {
//	// if (enemy6.getArrayRowY() == enemy1.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy1.getArrayColumnX()) {
//	// moveEnemy6();
//	// }
//	// }
//	// if (enemy6.getArrayRowY() == enemy2.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy2.getArrayColumnX()) {
//	// moveEnemy6();
//	// }
//	// }
//	// if (enemy6.getArrayRowY() == enemy3.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy3.getArrayColumnX()) {
//	// moveEnemy6();
//	// }
//	// }
//	// if (enemy6.getArrayRowY() == enemy4.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy4.getArrayColumnX()) {
//	// moveEnemy6();
//	// }
//	// }
//	// if (enemy6.getArrayRowY() == enemy5.getArrayRowY()) {
//	// if (enemy6.getArrayColumnX() == enemy5.getArrayColumnX()) {
//	// moveEnemy6();
//	// }
//	// }
//	// }
//
//}
