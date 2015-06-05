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
	private ActiveAgents briefcase = new ActiveAgents();
	private Player player = new Player();
	// private Enemy eClass = new Enemy();
	private Enemy[] enemies = new Enemy[6];
	// private Enemy[] enemies;
	private PowerUps replacementBullet = new PowerUps();
	private PowerUps invincibility = new PowerUps();
	private PowerUps radar = new PowerUps();

	// remember to change back to "false" <-------------------------------------
	private boolean debugMode = true;

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
		// while (player.checkLife()=true) {
		while (player.getArrayRowY() < 9) {
			// if (player.checkLife()){
			// }
			showMap();
			looking();
			moveEnemies(); // remember to fix this method chain/loop
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
			uiClass.roomResult(checkRoom());
		case 4:
			// insert saving method HERE
			uiClass.gameStart();
			break;
		case 5:
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
			uiClass.gameStart();
			break;
		case 4:
			debugging();
			mRs();
			break;
		}
	}

	public int checkRoom() {
		int n;
		player.move(3);
		int i = player.getArrayRowY();
		int j = player.getArrayColumnX();
		if (i == 1 || i == 4 || i == 7) {
			if (j == 1 || j == 4 || j == 7) {
				if (i == briefcase.getArrayRowY()
						&& j == briefcase.getArrayColumnX()) {
					n = 3;
				} else
					n = 2;
			} else
				n = 1;
		} else
			n = 1;
		player.unMove(3);
		return n;
	}

	public void move() {
		player.move(uiClass.pickDirection());
		// insert method to check position for powerups & boundaries HERE
		isPlayerOnTopOfEnemy();
		// isPlayerInRoom(); <----------------------------------------------
		// isPlayerOutofMap(); <--------------------------------------------
		// these (not all) have to be under a single conditional statement
		// to prevent overlap of the reMovePlayer method?
		isPlayerOnPowerUps(); // <------------------------------------------
	}

	public void reMovePlayer() {
		move();
	}

	public void isPlayerOnPowerUps() {
		
	}

	public void shoot() {
		// insert method for check direction to see if there is an enemy
		// if there is return turn for uiClass.
	}

	// reread method, it seems to check for player at enemies current position
	// (i == player.getArrayRowY() && j == player.getArrayColumnX())
	public void isPlayerOnTopOfEnemy() {
		for (int i = 0; i < enemies.length; i++) {
			for (int j = 0; j < i; j++) {
				if (player.getArrayRowY() == enemies[i - 1].getArrayRowY())
					if (player.getArrayColumnX() == enemies[i - 1]
							.getArrayColumnX()) {
						stabbed();
						break; // Is this statement necessary?
					}
			}
		}
	}

	// Alternative method version for previous method
	// // change to die by walking into enemy
	// public void checkForEnemy() {
	// int i = player.getArrayRowY();
	// int j = player.getArrayColumnX();
	// if (i == enemies[0].getArrayRowY() && j == enemies[0].getArrayColumnX())
	// reMovePlayer();
	// else if (i == enemies[1].getArrayRowY()
	// && j == enemies[1].getArrayColumnX())
	// reMovePlayer();
	// else if (i == enemies[2].getArrayRowY()
	// && j == enemies[2].getArrayColumnX())
	// reMovePlayer();
	// else if (i == enemies[3].getArrayRowY()
	// && j == enemies[3].getArrayColumnX())
	// reMovePlayer();
	// else if (i == enemies[4].getArrayRowY()
	// && j == enemies[4].getArrayColumnX())
	// reMovePlayer();
	// else if (i == enemies[5].getArrayRowY()
	// && j == enemies[5].getArrayColumnX())
	// stabbed();
	// }

	private void stabbed() {
		player.lostLife();
		uiClass.gotstabbed(player.checkLife());
		player.createPlayer();
		makeEnemies(); // enemies will be repositioned as the
		// player respawns
		turns();
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
		// not sure how to shorten this
		if (i == briefcase.getArrayRowY() && j == briefcase.getArrayColumnX())
			map[i][j] = "[C]";
		else if (i == replacementBullet.getArrayRowY()
				&& j == replacementBullet.getArrayColumnX())
			map[i][j] = "[b]";
		else if (i == invincibility.getArrayRowY()
				&& j == invincibility.getArrayColumnX())
			map[i][j] = "[i]";
		else if (i == radar.getArrayRowY() && j == radar.getArrayColumnX())
			map[i][j] = "[r]";
		else if (i == player.getArrayRowY() && j == player.getArrayColumnX()) {
			map[i][j] = "[P]";
		} else if (i == enemies[0].getArrayRowY()
				&& j == enemies[0].getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemies[1].getArrayRowY()
				&& j == enemies[1].getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemies[2].getArrayRowY()
				&& j == enemies[2].getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemies[3].getArrayRowY()
				&& j == enemies[3].getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemies[4].getArrayRowY()
				&& j == enemies[4].getArrayColumnX())
			map[i][j] = "[A]";
		else if (i == enemies[5].getArrayRowY()
				&& j == enemies[5].getArrayColumnX())
			map[i][j] = "[A]";
		// else if (i == enemies[6].getArrayRowY()
		// && j == enemies[6].getArrayColumnX())
		// map[i][j] = "[A]";
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

	// public void makeEnemies() {
	// enemies = new Enemy[eClass.getEnemyCount()];
	// for (int i = 0; i < enemies.length; i++) {
	// enemies[i] = new Enemy();
	// checkEnemy(i);
	// }
	// }
	//
	// public void checkEnemy(int i) {
	// if (enemies[i].getArrayRowY() == 1 || enemies[i].getArrayRowY() == 4
	// || enemies[i].getArrayRowY() == 7)
	// if (enemies[i].getArrayColumnX() == 1
	// || enemies[i].getArrayColumnX() == 4
	// || enemies[i].getArrayColumnX() == 7)
	// remakeEnemies(i);
	// if (i != 0)
	// for (int j = 0; j < i; j++) {
	// if (enemies[i].getArrayRowY() == enemies[i - 1].getArrayRowY())
	// if (enemies[i].getArrayColumnX() == enemies[i - 1]
	// .getArrayColumnX())
	// remakeEnemies(i);
	// }
	// }
	//
	// public void remakeEnemies(int i) {
	// enemies[i] = new Enemy();
	// }

	public void moveEnemies() {
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].moveEnemy();
			checkMoveEnemy(i);
		}
	}

	public void checkMoveEnemy(int i) {
		if (enemies[i].getArrayRowY() == 1 || enemies[i].getArrayRowY() == 4
				|| enemies[i].getArrayRowY() == 7)
			if (enemies[i].getArrayColumnX() == 1
					|| enemies[i].getArrayColumnX() == 4
					|| enemies[i].getArrayColumnX() == 7)
				reMoveEnemies(i);
		// change this if condition
		if (i != 0)
			for (int j = 0; j < i; j++) {
				if (enemies[i].getArrayRowY() == enemies[i - 1].getArrayRowY())
					if (enemies[i].getArrayColumnX() == enemies[i - 1]
							.getArrayColumnX())
						reMoveEnemies(i);
			}
	}

	public void reMoveEnemies(int i) {
		enemies[i].moveEnemy();
	}

	public void makeEnemies() {
		for (int i = 0; i < enemies.length; i++) {
			enemies[i] = new Enemy();
			checkEnemyBoundary(i);
			checkOverlappingEnemy(i);
		}
	}

	public void checkEnemyBoundary(int i) {
		if (enemies[i].getArrayRowY() > 5) {
			if (enemies[i].getArrayColumnX() < 3) {
				remakeEnemies(i);
			}
		}
		if (enemies[i].getArrayColumnX() < 3) {
			if (enemies[i].getArrayRowY() > 5) {
				remakeEnemies(i);
			}
		}
	}

	public void checkOverlappingEnemy(int i) {
		if (enemies[i].getArrayRowY() == 1 || enemies[i].getArrayRowY() == 4
				|| enemies[i].getArrayRowY() == 7)
			if (enemies[i].getArrayColumnX() == 1
					|| enemies[i].getArrayColumnX() == 4
					|| enemies[i].getArrayColumnX() == 7)
				remakeEnemies(i);
		if (i != 0)
			for (int j = 0; j < i; j++) {
				if (enemies[i].getArrayRowY() == enemies[i - 1].getArrayRowY())
					if (enemies[i].getArrayColumnX() == enemies[i - 1]
							.getArrayColumnX())
						remakeEnemies(i);
			}
	}

	public void remakeEnemies(int i) {
		enemies[i] = new Enemy();
		checkEnemyBoundary(i);
		checkOverlappingEnemy(i);
	}

}
