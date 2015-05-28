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
public class GameEngine {
	/**
	 * 
	 */
	public UserInterface uiClass;

	/**
	 * @param userInterface
	 */
	public GameEngine(UserInterface userInterface) {
		uiClass = userInterface;
	}

	/**
	 * 
	 */
	private String[][] map = new String[9][9];
	/**
	 * 
	 */
	private ActiveAgents player = new ActiveAgents();
	private Enemy enemy1;
	private Enemy enemy2;
	private Enemy enemy3;
	private Enemy enemy4;
	private Enemy enemy5;
	private Enemy enemy6;
	private PowerUps aB = new PowerUps();
	private PowerUps invin = new PowerUps();
	private PowerUps rad = new PowerUps();

	private boolean debugMode = false;

	public void debugging() {
		debugMode = true;
		uiClass.runDebug();
		showMap();
	}

	// incomplete b/c does not consider looking view
	public void showMap() {
		if (debugMode)
			uiClass.printMap();
		else {
			uiClass.printBasicMap();
		}
	}

	public void newStart() {
		// uiClass.lookOptions();
		makeEnemies();
		turns();
	}

	// uiClass.displayLocation(player.getArrayRowY(),
	// player.getArrayColumnX());

	public void turns() {
		while (player.getArrayRowY() < 9) {
			showMap();
			looking();
			movingEnemies(); // remember to fix this method chain/loop
		}
	}

	// public void cycle() {
	// // showMap();
	// uiClass.printMap();
	// uiClass.pickDirection();
	// player.move(uiClass.getResponse());
	// movingEnemies();
	// }

	public void looking() {
		lookingOptions(uiClass.lookOptions());
	}

	public void lookingOptions(int n) {
		switch (n) {
		case 1:
			uiClass.pickDirection();
			// insert method here showing map of direction chosen using
			// (uiClass.getResponse())
			mRs();
			break;
		case 2:
			mRs();
			break;
		case 3:
			// insert saving method HERE
			break;
		case 4:
			debugging();
			looking();
			break;
		}
	}

	public void mRs() {
		movingOrShooting(uiClass.moveOrShoot());
	}

	public void movingOrShooting(int n) {
		switch (n) {
		case 1:
			move();
			break;
		case 2:
			// insert check for enemy when shooting Here
			break;
		case 3:
			// insert saving method HERE
			break;
		case 4:
			debugging();
			mRs();
			break;
		}
	}

	public void move() {
		player.move(uiClass.pickDirection());
		// insert method to check position for powerups & boundaries HERE
	}

	public void shoot(){
		//insert method for check direction to see if there is an enemy
		//if there is return turn for uiClass.
	}
	public void setBasicMap(int i, int j) {
		if (i == player.getArrayRowY() && j == player.getArrayColumnX()) {
			map[i][j] = "[P]";
		} else if (i == 1 || i == 4 || i == 7) {
			if (j == 1 || j == 4 || j == 7)
				map[i][j] = "[R]";
			else
				map[i][j] = "[*]";
		} else
			map[i][j] = "[*]";
	}

	public void setMap(int i, int j) {
		// to be replaced with class constructor loop?
		if (i == player.getArrayRowY() && j == player.getArrayColumnX()) {
			map[i][j] = "[P]";
		} else if (i == enemy1.getArrayRowY() && j == enemy1.getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemy2.getArrayRowY() && j == enemy2.getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemy3.getArrayRowY() && j == enemy3.getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemy4.getArrayRowY() && j == enemy4.getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemy5.getArrayRowY() && j == enemy5.getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemy6.getArrayRowY() && j == enemy6.getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == aB.getArrayRowY() && j == aB.getArrayColumnX())
			map[i][j] = "[b]";
		else if (i == invin.getArrayRowY() && j == invin.getArrayColumnX())
			map[i][j] = "[i]";
		else if (i == rad.getArrayRowY() && j == rad.getArrayColumnX())
			map[i][j] = "[r]";
		else if (i == 1 || i == 4 || i == 7) {
			if (j == 1 || j == 4 || j == 7)
				map[i][j] = "[R]";
			else
				map[i][j] = "[*]";
		} else
			map[i][j] = "[*]";
	}

	public int getMapLength() {
		return map.length;
	}

	public int getMapLength(int n) {
		return map[n].length;
	}

	public String getMap(int a, int b) {
		return map[a][b];
	}

	// Is there a shorter way to do this?
	public void makeEnemies() {
		enemy1 = new Enemy();
		makeEnemy2();
		makeEnemy3();
		makeEnemy4();
		makeEnemy5();
		makeEnemy6();
	}

	public void makeEnemy2() {
		enemy2 = new Enemy();
		checkEnemy2();
	}

	public void checkEnemy2() {
		if (enemy2.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy2.getArrayColumnX() == enemy1.getArrayColumnX()) {
				makeEnemy2();
			}
		}
	}

	public void makeEnemy3() {
		enemy3 = new Enemy();
		checkEnemy3();
	}

	public void checkEnemy3() {
		if (enemy3.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy3.getArrayColumnX() == enemy1.getArrayColumnX()) {
				makeEnemy3();
			}
		}
		if (enemy3.getArrayRowY() == enemy2.getArrayRowY()) {
			if (enemy3.getArrayColumnX() == enemy2.getArrayColumnX()) {
				makeEnemy3();
			}
		}
	}

	public void makeEnemy4() {
		enemy4 = new Enemy();
		checkEnemy4();
	}

	public void checkEnemy4() {
		if (enemy4.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy4.getArrayColumnX() == enemy1.getArrayColumnX()) {
				makeEnemy4();
			}
		}
		if (enemy4.getArrayRowY() == enemy2.getArrayRowY()) {
			if (enemy4.getArrayColumnX() == enemy2.getArrayColumnX()) {
				makeEnemy4();
			}
		}
		if (enemy4.getArrayRowY() == enemy3.getArrayRowY()) {
			if (enemy4.getArrayColumnX() == enemy3.getArrayColumnX()) {
				makeEnemy4();
			}
		}
	}

	public void makeEnemy5() {
		enemy5 = new Enemy();
		checkEnemy5();
	}

	public void checkEnemy5() {
		if (enemy5.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy5.getArrayColumnX() == enemy1.getArrayColumnX()) {
				makeEnemy5();
			}
		}
		if (enemy5.getArrayRowY() == enemy2.getArrayRowY()) {
			if (enemy5.getArrayColumnX() == enemy2.getArrayColumnX()) {
				makeEnemy5();
			}
		}
		if (enemy5.getArrayRowY() == enemy3.getArrayRowY()) {
			if (enemy5.getArrayColumnX() == enemy3.getArrayColumnX()) {
				makeEnemy5();
			}
		}
		if (enemy5.getArrayRowY() == enemy4.getArrayRowY()) {
			if (enemy5.getArrayColumnX() == enemy4.getArrayColumnX()) {
				makeEnemy5();
			}
		}
	}

	public void makeEnemy6() {
		enemy6 = new Enemy();
		checkEnemy6();
	}

	public void checkEnemy6() {
		if (enemy6.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy1.getArrayColumnX()) {
				makeEnemy6();
			}
		}
		if (enemy6.getArrayRowY() == enemy2.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy2.getArrayColumnX()) {
				makeEnemy6();
			}
		}
		if (enemy6.getArrayRowY() == enemy3.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy3.getArrayColumnX()) {
				makeEnemy6();
			}
		}
		if (enemy6.getArrayRowY() == enemy4.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy4.getArrayColumnX()) {
				makeEnemy6();
			}
		}
		if (enemy6.getArrayRowY() == enemy5.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy5.getArrayColumnX()) {
				makeEnemy6();
			}
		}
	}

	//
	// /**
	// * Handles the random placement of enemies, items and briefcase on the
	// * playing board array.
	// */
	// public void randomPlacement() {
	// }
	//
	// // Is there a shorter way to do this?
	// currently does not check for boundaries
	public void movingEnemies() {
		enemy1.moveEnemy();
		moveEnemy2();
		moveEnemy3();
		moveEnemy4();
		moveEnemy5();
		moveEnemy6();
	}

	public void moveEnemy2() {
		enemy2.moveEnemy();
		checkMoveEnemy2();
	}

	public void checkMoveEnemy2() {
		if (enemy2.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy2.getArrayColumnX() == enemy1.getArrayColumnX()) {
				moveEnemy2();
			}
		}
	}

	public void moveEnemy3() {
		enemy3 = new Enemy();
		checkMoveEnemy3();
	}

	public void checkMoveEnemy3() {
		if (enemy3.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy3.getArrayColumnX() == enemy1.getArrayColumnX()) {
				moveEnemy3();
			}
		}
		if (enemy3.getArrayRowY() == enemy2.getArrayRowY()) {
			if (enemy3.getArrayColumnX() == enemy2.getArrayColumnX()) {
				moveEnemy3();
			}
		}
	}

	public void moveEnemy4() {
		enemy4 = new Enemy();
		checkMoveEnemy4();
	}

	public void checkMoveEnemy4() {
		if (enemy4.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy4.getArrayColumnX() == enemy1.getArrayColumnX()) {
				moveEnemy4();
			}
		}
		if (enemy4.getArrayRowY() == enemy2.getArrayRowY()) {
			if (enemy4.getArrayColumnX() == enemy2.getArrayColumnX()) {
				moveEnemy4();
			}
		}
		if (enemy4.getArrayRowY() == enemy3.getArrayRowY()) {
			if (enemy4.getArrayColumnX() == enemy3.getArrayColumnX()) {
				moveEnemy4();
			}
		}
	}

	public void moveEnemy5() {
		enemy5 = new Enemy();
		checkMoveEnemy5();
	}

	public void checkMoveEnemy5() {
		if (enemy5.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy5.getArrayColumnX() == enemy1.getArrayColumnX()) {
				moveEnemy5();
			}
		}
		if (enemy5.getArrayRowY() == enemy2.getArrayRowY()) {
			if (enemy5.getArrayColumnX() == enemy2.getArrayColumnX()) {
				moveEnemy5();
			}
		}
		if (enemy5.getArrayRowY() == enemy3.getArrayRowY()) {
			if (enemy5.getArrayColumnX() == enemy3.getArrayColumnX()) {
				moveEnemy5();
			}
		}
		if (enemy5.getArrayRowY() == enemy4.getArrayRowY()) {
			if (enemy5.getArrayColumnX() == enemy4.getArrayColumnX()) {
				moveEnemy5();
			}
		}
	}

	public void moveEnemy6() {
		enemy6 = new Enemy();
		checkMoveEnemy6();
	}

	public void checkMoveEnemy6() {
		if (enemy6.getArrayRowY() == enemy1.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy1.getArrayColumnX()) {
				moveEnemy6();
			}
		}
		if (enemy6.getArrayRowY() == enemy2.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy2.getArrayColumnX()) {
				moveEnemy6();
			}
		}
		if (enemy6.getArrayRowY() == enemy3.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy3.getArrayColumnX()) {
				moveEnemy6();
			}
		}
		if (enemy6.getArrayRowY() == enemy4.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy4.getArrayColumnX()) {
				moveEnemy6();
			}
		}
		if (enemy6.getArrayRowY() == enemy5.getArrayRowY()) {
			if (enemy6.getArrayColumnX() == enemy5.getArrayColumnX()) {
				moveEnemy6();
			}
		}
	}

}
