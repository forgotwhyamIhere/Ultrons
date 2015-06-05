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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 * @author
 *
 */
public class GameEngine implements Serializable {
	/**
	 * 
	 */
	public UserInterface uiClass;

	/**
	 * Needs to be transient to avoid being caught in Serialization.
	 */
	private transient Scanner kb = new Scanner(System.in);

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
	private ActiveAgents briefcase;
	private Player player;
	// private Enemy eClass = new Enemy();
	private Enemy[] enemies;
	// private Enemy[] enemies;
	private PowerUps replacementBullet;
	private PowerUps invincibility;
	private PowerUps radar;

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
			uiClass.printMap(invincibility.getInvincibleDuration());
		else {
			uiClass.printBasicMap(invincibility.getInvincibleDuration());
		}
	}

	public void newStart() {
		briefcase = new ActiveAgents();
		player = new Player();
		// enemies = new Enemy[6];
		enemies = new Enemy[6];
		// enemies = new Enemy[eClass.getEnemyCount()];
		replacementBullet = new PowerUps();
		invincibility = new PowerUps();
		radar = new PowerUps();
		makeEnemies();
		turns();
	}

	// uiClass.displayLocation(player.getArrayRowY(),
	// player.getArrayColumnX());

	public void turns() {
		// while (player.checkLife()=true) {
		while (player.getArrayRowY() < 9) {
			// remember to unComment the following line <--------------------
			// invincibility.decreaseInvincibity();
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
			System.out.println("Enter game save name: ");
			String saveName = kb.nextLine();
			save(saveName);
			uiClass.gameStart();
			break;
		case 4:
			debugging();
			looking();
			break;
		}
	}

	public void save(String fileName) {
		if (fileName.equals(null) | fileName.length() < 1) {
			return;
		}

		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(fileName + ".dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		oos = null;
	}

	public void load(String fileName) throws ClassNotFoundException,
			IOException {
		FileInputStream fis = null;
		GameEngine ge = new GameEngine(uiClass);
		UserInterface ui = new UserInterface();
		try {
			fis = new FileInputStream(fileName + ".dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ge = (GameEngine) ois.readObject();
			// ui = (UserInterface) ois.readObject();
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " not found.");
		}
		// ObjectInputStream ois = new ObjectInputStream(fis);
		// UserInterface ui = (UserInterface) ois.readObject();
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
			uiClass.shotEnemy(shoot(uiClass.lookOptions()));
			break;
		case 3:
			uiClass.roomResult(checkRoom());
			break;
		case 4:
			System.out.println("Enter game save name: ");
			uiClass.gameStart();
			String saveName = kb.nextLine();
			save(saveName);
			uiClass.gameStart();
			break;
		case 5:
			debugging();
			mRs();
			break;
		}
	}

	public int shoot(int n) {
		int r = 6;
		player.move(n);
		int i = player.getArrayRowY();
		int j = player.getArrayColumnX();
		player.move(n);
		int a = player.getArrayRowY();
		int b = player.getArrayColumnX();
		player.unMove(n);
		player.unMove(n);
		if (player.checkAmmo() == 1) {
			if (i == enemies[0].getArrayRowY()
					&& j == enemies[0].getArrayColumnX()) {
				r = 1;
				shotEnemy(0);
			} else if (i == enemies[1].getArrayRowY()
					&& j == enemies[1].getArrayColumnX()) {
				r = 1;
				shotEnemy(1);
			} else if (i == enemies[2].getArrayRowY()
					&& j == enemies[2].getArrayColumnX()) {
				r = 1;
				shotEnemy(2);
			} else if (i == enemies[3].getArrayRowY()
					&& j == enemies[3].getArrayColumnX()) {
				r = 1;
				shotEnemy(3);
			} else if (i == enemies[4].getArrayRowY()
					&& j == enemies[4].getArrayColumnX()) {
				r = 1;
				shotEnemy(4);
			} else if (i == enemies[5].getArrayRowY()
					&& j == enemies[5].getArrayColumnX()) {
				r = 1;
				shotEnemy(5);
			} else {
				if (i == 1 || i == 4 || i == 7) {
					if (j == 1 || j == 4 || j == 7) {
						r = 2;
					} else {
//not done
					}
				}
			}
		} else
			r = 5;
		return r;
	}

	public void shotEnemy(int e) {
		enemies[e].die();
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
		checkOnTopOf();
	}

	// public void reMovePlayer() {
	// move();
	// }

	public void checkOnTopOf() {
		// insert method to check position for powerups & boundaries HERE
		isPlayerOnTopOfEnemy();
		// isPlayerInRoom(); <----------------------------------------------
		// isPlayerOutofMap(); <--------------------------------------------
		// these (not all) have to be under a single conditional statement
		// to prevent overlap of the reMovePlayer method?
		isPlayerOnPowerUps(); // <------------------------------------------
	}

	public void isPlayerOnPowerUps() {
		int i = player.getArrayRowY();
		int j = player.getArrayColumnX();
		if (i == invincibility.getArrayRowY()
				&& j == invincibility.getArrayColumnX()) {
			uiClass.displayInvincibility();
			invincibility.setInvincible();
		} else if (i == replacementBullet.getArrayRowY()
				&& j == replacementBullet.getArrayColumnX()) {
			uiClass.getBullet(player.checkAmmo());
			player.setAmmo();
			replacementBullet.remove();
		} else if (i == radar.getArrayRowY() && j == radar.getArrayColumnX()) {
			uiClass.radarMap();
			radar.remove();
		}
	}

	// reread method, it seems to check for player at enemies current position
	// (i == player.getArrayRowY() && j == player.getArrayColumnX())
	public void isPlayerOnTopOfEnemy() {
		for (int i = 0; i < enemies.length; i++) {
			for (int j = 0; j < i; j++) {
				if (player.getArrayRowY() == enemies[i - 1].getArrayRowY())
					if (player.getArrayColumnX() == enemies[i - 1]
							.getArrayColumnX()) {
						if (invincibility.getInvincibleDuration() > 0) {
							player.unMove(uiClass.getResponse());
							uiClass.intoInvincibility();
							move();
						} else {
							stabbed();
							break; // Is this statement necessary?
						}
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

	public void radarMap(int i, int j) {
		if (i == player.getArrayRowY() && j == player.getArrayColumnX()) {
			map[i][j] = "[P]";
		}
		if (i == briefcase.getArrayRowY() && j == briefcase.getArrayColumnX()) {
			map[i][j] = "[C]";
		} else if (i == 1 || i == 4 || i == 7) {
			if (j == 1 || j == 4 || j == 7)
				map[i][j] = "[R]";
			else
				map[i][j] = "[*]";
		} else
			map[i][j] = "[*]";
	}

	public void setDebugMap(int i, int j) {
		// not sure how to shorten this
		if (i == briefcase.getArrayRowY() && j == briefcase.getArrayColumnX())
			map[i][j] = "[C]";
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
		else if (i == replacementBullet.getArrayRowY()
				&& j == replacementBullet.getArrayColumnX())
			map[i][j] = "[b]";
		else if (i == invincibility.getArrayRowY()
				&& j == invincibility.getArrayColumnX())
			map[i][j] = "[i]";
		else if (i == radar.getArrayRowY() && j == radar.getArrayColumnX())
			map[i][j] = "[r]";
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
			int enemyMovement = enemies[i].moveEnemy();
			checkMoveEnemy(i, enemyMovement);
		}
	}

	public void checkMoveEnemy(int i, int enemyMovement) {
		if (enemies[i].getArrayRowY() == 1 || enemies[i].getArrayRowY() == 4
				|| enemies[i].getArrayRowY() == 7)
			if (enemies[i].getArrayColumnX() == 1
					|| enemies[i].getArrayColumnX() == 4
					|| enemies[i].getArrayColumnX() == 7) {
				reMoveEnemies(i, enemyMovement);
			}
		for (int j = 0; j < i; j++) {
			if (enemies[i].getArrayRowY() == enemies[j].getArrayRowY()) {
				if (enemies[i].getArrayColumnX() == enemies[j]
						.getArrayColumnX()) {
					reMoveEnemies(i, enemyMovement);
				}
			}
		}
		for (int z = 0; z <= i; z++) {
			if (enemies[i].getArrayRowY() < 0 || enemies[i].getArrayRowY() > 8) {
				reMoveEnemies(i, enemyMovement);
			}
			if (enemies[i].getArrayColumnX() < 0
					|| enemies[i].getArrayColumnX() > 8) {
				reMoveEnemies(i, enemyMovement);
			}
		}
	}

	public void reMoveEnemies(int i, int enemyMovement) {
		enemies[i].unMove(enemyMovement);
		enemies[i].moveEnemy();
		checkMoveEnemy(i, enemyMovement);
	}

	// public void moveEnemies() {
	// for (int i = 0; i < enemies.length; i++) {
	// enemies[i].moveEnemy();
	// checkMoveEnemy(i);
	// }
	// }
	//
	// public void checkMoveEnemy(int i) {
	// if (enemies[i].getArrayRowY() == 1 || enemies[i].getArrayRowY() == 4
	// || enemies[i].getArrayRowY() == 7)
	// if (enemies[i].getArrayColumnX() == 1
	// || enemies[i].getArrayColumnX() == 4
	// || enemies[i].getArrayColumnX() == 7)
	// reMoveEnemies(i);
	// // change this if condition
	// if (i != 0)
	// for (int j = 0; j < i; j++) {
	// if (enemies[i].getArrayRowY() == enemies[i - 1].getArrayRowY())
	// if (enemies[i].getArrayColumnX() == enemies[i - 1]
	// .getArrayColumnX())
	// reMoveEnemies(i);
	// }
	// }
	//
	// public void reMoveEnemies(int i) {
	// enemies[i].moveEnemy();
	// }

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
