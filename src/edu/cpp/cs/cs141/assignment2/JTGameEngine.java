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
///**
// * @author
// *
// */
//public class GameEngine {
//	/**
//	 * 
//	 */
//	public UserInterface uiClass;
//
//	/**
//	 * @param userInterface
//	 */
//	public GameEngine(UserInterface userInterface) {
//		uiClass = userInterface;
//	}
//
//	/**
//	 * 
//	 */
//	private String[][] map = new String[9][9];
//	/**
//	 * 
//	 */
//	private ActiveAgents player = new ActiveAgents();
//	private Enemy[] enemies = new Enemy[6];
////	private Enemy enemy1;
////	private Enemy enemy2;
////	private Enemy enemy3;
////	private Enemy enemy4;
////	private Enemy enemy5;
////	private Enemy enemy6;
//	private PowerUps aB = new PowerUps();
//	private PowerUps invin = new PowerUps();
//	private PowerUps rad = new PowerUps();
//
//	private boolean debugMode = true;
//
//	public void debugging() {
//		debugMode = true;
//		uiClass.runDebug();
//		showMap();
//	}
//
//	// incomplete b/c does not consider looking view
//	public void showMap() {
//		if (debugMode)
//			uiClass.printMap();
//		else {
//			uiClass.printBasicMap();
//		}
//	}
//
//	public void newStart() {
//		// uiClass.lookOptions();
//		makeEnemies();
//		turns();
//	}
//
//	// uiClass.displayLocation(player.getArrayRowY(),
//	// player.getArrayColumnX());
//
//	public void turns() {
//		while (player.getArrayRowY() < 9) {
//			showMap();
//			looking();
//			movingEnemies(); // remember to fix this method chain/loop
//		}
//	}
//
//	// public void cycle() {
//	// // showMap();
//	// uiClass.printMap();
//	// uiClass.pickDirection();
//	// player.move(uiClass.getResponse());
//	// movingEnemies();
//	// }
//
//	public void looking() {
//		lookingOptions(uiClass.lookOptions());
//	}
//
//	public void lookingOptions(int n) {
//		switch (n) {
//		case 1:
//			uiClass.pickDirection();
//			// insert method here showing map of direction chosen using
//			// (uiClass.getResponse())
//			mRs();
//			break;
//		case 2:
//			mRs();
//			break;
//		case 3:
//			// insert saving method HERE
//			break;
//		case 4:
//			debugging();
//			looking();
//			break;
//		}
//	}
//
//	public void mRs() {
//		movingOrShooting(uiClass.moveOrShoot());
//	}
//
//	public void movingOrShooting(int n) {
//		switch (n) {
//		case 1:
//			move();
//			break;
//		case 2:
//			// insert check for enemy when shooting Here
//			break;
//		case 3:
//			// insert saving method HERE
//			break;
//		case 4:
//			debugging();
//			mRs();
//			break;
//		}
//	}
//
//	public void move() {
//		player.move(uiClass.pickDirection());
//		// insert method to check position for powerups & boundaries HERE
//	}
//
//	public void shoot(){
//		//insert method for check direction to see if there is an enemy
//		//if there is return turn for uiClass.
//	}
//	public void setBasicMap(int i, int j) {
//		if (i == player.getArrayRowY() && j == player.getArrayColumnX()) {
//			map[i][j] = "[P]";
//		} else if (i == 1 || i == 4 || i == 7) {
//			if (j == 1 || j == 4 || j == 7)
//				map[i][j] = "[R]";
//			else
//				map[i][j] = "[*]";
//		} else
//			map[i][j] = "[*]";
//	}
//
//	public void setMap(int i, int j) {
//		// to be replaced with class constructor loop?
//		if (i == player.getArrayRowY() && j == player.getArrayColumnX()) {
//			map[i][j] = "[P]";
//		} else if (i == enemies[0].getArrayRowY() && j == enemies[0].getArrayColumnX())
//			map[i][j] = "[A]";
//		else if (i == enemies[1].getArrayRowY() && j == enemies[1].getArrayColumnX())
//			map[i][j] = "[A]";
//		else if (i == enemies[2].getArrayRowY() && j == enemies[2].getArrayColumnX())
//			map[i][j] = "[A]";
//		else if (i == enemies[3].getArrayRowY() && j == enemies[3].getArrayColumnX())
//			map[i][j] = "[A]";
//		else if (i == enemies[4].getArrayRowY() && j == enemies[4].getArrayColumnX())
//			map[i][j] = "[A]";
//		else if (i == enemies[5].getArrayRowY() && j == enemies[5].getArrayColumnX())
//			map[i][j] = "[A]";
//		else if (i == aB.getArrayRowY() && j == aB.getArrayColumnX())
//			map[i][j] = "[b]";
//		else if (i == invin.getArrayRowY() && j == invin.getArrayColumnX())
//			map[i][j] = "[i]";
//		else if (i == rad.getArrayRowY() && j == rad.getArrayColumnX())
//			map[i][j] = "[r]";
//		else if (i == 1 || i == 4 || i == 7) {
//			if (j == 1 || j == 4 || j == 7)
//				map[i][j] = "[R]";
//			else
//				map[i][j] = "[*]";
//		} else
//			map[i][j] = "[*]";
//	}
//
//	public int getMapLength() {
//		return map.length;
//	}
//
//	public int getMapLength(int n) {
//		return map[n].length;
//	}
//
//	public String getMap(int a, int b) {
//		return map[a][b];
//	}
//	public void makeEnemies() {
//	for (int i = 0; i < enemies.length; i++){
//		enemies[i] = new Enemy();
//		checkEnemy(i);
//	}
//}
//
//public void checkEnemy(int i){
//	if (enemies[i].getArrayRowY() == 1 || enemies[i].getArrayRowY() == 4 || enemies[i].getArrayRowY() == 7)
//		if (enemies[i].getArrayColumnX() == 1 || enemies[i].getArrayColumnX() == 4 || enemies[i].getArrayColumnX() == 7)
//		remakeEnemies(i);
//	if (i != 0)
//		for (int j = 0; j < i; j++){
//			if (enemies[i].getArrayRowY() == enemies[i-1].getArrayRowY())
//				if (enemies[i].getArrayColumnX() == enemies[i-1].getArrayColumnX())
//					remakeEnemies(i);
//	}
//}
//
//public void remakeEnemies(int i){
//	enemies[i] = new Enemy();
//	checkEnemy(i);
//}
//
//	
//	
//	
////	public void makeEnemies() {
////		enemy1 = new Enemy();
////		makeEnemy2();
////		makeEnemy3();
////		makeEnemy4();
////		makeEnemy5();
////		makeEnemy6();
////	}
////
////	public void makeEnemy2() {
////		enemy2 = new Enemy();
////		checkEnemy2();
////	}
////
////	public void checkEnemy2() {
////		if (enemy2.getArrayRowY() == enemy1.getArrayRowY()) {
////			if (enemy2.getArrayColumnX() == enemy1.getArrayColumnX()) {
////				makeEnemy2();
////			}
////		}
////	}
////
////	public void makeEnemy3() {
////		enemy3 = new Enemy();
////		checkEnemy3();
////	}
////
////	public void checkEnemy3() {
////		if (enemy3.getArrayRowY() == enemy1.getArrayRowY()) {
////			if (enemy3.getArrayColumnX() == enemy1.getArrayColumnX()) {
////				makeEnemy3();
////			}
////		}
////		if (enemy3.getArrayRowY() == enemy2.getArrayRowY()) {
////			if (enemy3.getArrayColumnX() == enemy2.getArrayColumnX()) {
////				makeEnemy3();
////			}
////		}
////	}
////
////	public void makeEnemy4() {
////		enemy4 = new Enemy();
////		checkEnemy4();
////	}
////
////	public void checkEnemy4() {
////		if (enemy4.getArrayRowY() == enemy1.getArrayRowY()) {
////			if (enemy4.getArrayColumnX() == enemy1.getArrayColumnX()) {
////				makeEnemy4();
////			}
////		}
////		if (enemy4.getArrayRowY() == enemy2.getArrayRowY()) {
////			if (enemy4.getArrayColumnX() == enemy2.getArrayColumnX()) {
////				makeEnemy4();
////			}
////		}
////		if (enemy4.getArrayRowY() == enemy3.getArrayRowY()) {
////			if (enemy4.getArrayColumnX() == enemy3.getArrayColumnX()) {
////				makeEnemy4();
////			}
////		}
////	}
////
////	public void makeEnemy5() {
////		enemy5 = new Enemy();
////		checkEnemy5();
////	}
////
////	public void checkEnemy5() {
////		if (enemy5.getArrayRowY() == enemy1.getArrayRowY()) {
////			if (enemy5.getArrayColumnX() == enemy1.getArrayColumnX()) {
////				makeEnemy5();
////			}
////		}
////		if (enemy5.getArrayRowY() == enemy2.getArrayRowY()) {
////			if (enemy5.getArrayColumnX() == enemy2.getArrayColumnX()) {
////				makeEnemy5();
////			}
////		}
////		if (enemy5.getArrayRowY() == enemy3.getArrayRowY()) {
////			if (enemy5.getArrayColumnX() == enemy3.getArrayColumnX()) {
////				makeEnemy5();
////			}
////		}
////		if (enemy5.getArrayRowY() == enemy4.getArrayRowY()) {
////			if (enemy5.getArrayColumnX() == enemy4.getArrayColumnX()) {
////				makeEnemy5();
////			}
////		}
////	}
////
////	public void makeEnemy6() {
////		enemy6 = new Enemy();
////		checkEnemy6();
////	}
////
////	public void checkEnemy6() {
////		if (enemy6.getArrayRowY() == enemy1.getArrayRowY()) {
////			if (enemy6.getArrayColumnX() == enemy1.getArrayColumnX()) {
////				makeEnemy6();
////			}
////		}
////		if (enemy6.getArrayRowY() == enemy2.getArrayRowY()) {
////			if (enemy6.getArrayColumnX() == enemy2.getArrayColumnX()) {
////				makeEnemy6();
////			}
////		}
////		if (enemy6.getArrayRowY() == enemy3.getArrayRowY()) {
////			if (enemy6.getArrayColumnX() == enemy3.getArrayColumnX()) {
////				makeEnemy6();
////			}
////		}
////		if (enemy6.getArrayRowY() == enemy4.getArrayRowY()) {
////			if (enemy6.getArrayColumnX() == enemy4.getArrayColumnX()) {
////				makeEnemy6();
////			}
////		}
////		if (enemy6.getArrayRowY() == enemy5.getArrayRowY()) {
////			if (enemy6.getArrayColumnX() == enemy5.getArrayColumnX()) {
////				makeEnemy6();
////			}
////		}
////	}
//
//	//
//	// /**
//	// * Handles the random placement of enemies, items and briefcase on the
//	// * playing board array.
//	// */
//	// public void randomPlacement() {
//	// }
//	//
//	// // Is there a shorter way to do this?
//	// currently does not check for boundaries
//	public void movingEnemies() {
//		enemies[0].moveEnemy();
//		moveEnemy1();
//		moveEnemy2();
//		moveEnemy3();
//		moveEnemy4();
//		moveEnemy5();
//	}
//
//	public void moveEnemy1() {
//		enemies[1].moveEnemy();
//		checkMoveEnemy1();
//	}
//
//	public void checkMoveEnemy1() {
//		if (enemies[1].getArrayRowY() == enemies[0].getArrayRowY()) {
//			if (enemies[1].getArrayColumnX() == enemies[0].getArrayColumnX()) {
//				moveEnemy1();
//			}
//		}
//	}
//
//	public void moveEnemy2() {
//		enemies[2].moveEnemy();
//		checkMoveEnemy2();
//	}
//
//	public void checkMoveEnemy2() {
//		if (enemies[2].getArrayRowY() == enemies[0].getArrayRowY()) {
//			if (enemies[2].getArrayColumnX() == enemies[0].getArrayColumnX()) {
//				moveEnemy2();
//			}
//		}
//		if (enemies[2].getArrayRowY() == enemies[1].getArrayRowY()) {
//			if (enemies[2].getArrayColumnX() == enemies[1].getArrayColumnX()) {
//				moveEnemy2();
//			}
//		}
//	}
//
//	public void moveEnemy3() {
//		enemies[3].moveEnemy();
//		checkMoveEnemy3();
//	}
//
//	public void checkMoveEnemy3() {
//		if (enemies[3].getArrayRowY() == enemies[0].getArrayRowY()) {
//			if (enemies[3].getArrayColumnX() == enemies[0].getArrayColumnX()) {
//				moveEnemy3();
//			}
//		}
//		if (enemies[3].getArrayRowY() == enemies[1].getArrayRowY()) {
//			if (enemies[3].getArrayColumnX() == enemies[1].getArrayColumnX()) {
//				moveEnemy3();
//			}
//		}
//		if (enemies[3].getArrayRowY() == enemies[2].getArrayRowY()) {
//			if (enemies[3].getArrayColumnX() == enemies[2].getArrayColumnX()) {
//				moveEnemy3();
//			}
//		}
//	}
//
//	public void moveEnemy4() {
//		enemies[4].moveEnemy();
//		checkMoveEnemy4();
//	}
//
//	public void checkMoveEnemy4() {
//		if (enemies[4].getArrayRowY() == enemies[0].getArrayRowY()) {
//			if (enemies[4].getArrayColumnX() == enemies[0].getArrayColumnX()) {
//				moveEnemy4();
//			}
//		}
//		if (enemies[4].getArrayRowY() == enemies[1].getArrayRowY()) {
//			if (enemies[4].getArrayColumnX() == enemies[1].getArrayColumnX()) {
//				moveEnemy4();
//			}
//		}
//		if (enemies[4].getArrayRowY() == enemies[2].getArrayRowY()) {
//			if (enemies[4].getArrayColumnX() == enemies[2].getArrayColumnX()) {
//				moveEnemy4();
//			}
//		}
//		if (enemies[4].getArrayRowY() == enemies[3].getArrayRowY()) {
//			if (enemies[4].getArrayColumnX() == enemies[3].getArrayColumnX()) {
//				moveEnemy4();
//			}
//		}
//	}
//
//	public void moveEnemy5() {
//		enemies[5].moveEnemy();
//		checkMoveEnemy5();
//	}
//
//	public void checkMoveEnemy5() {
//		if (enemies[5].getArrayRowY() == enemies[0].getArrayRowY()) {
//			if (enemies[5].getArrayColumnX() == enemies[0].getArrayColumnX()) {
//				moveEnemy5();
//			}
//		}
//		if (enemies[5].getArrayRowY() == enemies[1].getArrayRowY()) {
//			if (enemies[5].getArrayColumnX() == enemies[1].getArrayColumnX()) {
//				moveEnemy5();
//			}
//		}
//		if (enemies[5].getArrayRowY() == enemies[2].getArrayRowY()) {
//			if (enemies[5].getArrayColumnX() == enemies[2].getArrayColumnX()) {
//				moveEnemy5();
//			}
//		}
//		if (enemies[5].getArrayRowY() == enemies[3].getArrayRowY()) {
//			if (enemies[5].getArrayColumnX() == enemies[3].getArrayColumnX()) {
//				moveEnemy5();
//			}
//		}
//		if (enemies[5].getArrayRowY() == enemies[4].getArrayRowY()) {
//			if (enemies[5].getArrayColumnX() == enemies[4].getArrayColumnX()) {
//				moveEnemy5();
//			}
//		}
//	}
//
//}
