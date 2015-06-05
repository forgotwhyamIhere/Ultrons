/**
 * 
 */
package edu.cpp.cs.cs141.assignment2;

/**
 * @author EQ iii
 *
 */
public class Player extends ActiveAgents {
	private int gunAmmo;
	private int lives;

	/**
	 * 
	 */
	public Player() {
		createPlayer();
		setAmmo();
	}

	// for loading purposes?
	public Player(int a, int b, int c) {
		gunAmmo = a;
		setPlayer(b, c);
		setLives();
	}

	
	
	public void setLives() {
		lives = 3;
	}

	public void lostLife() {
		lives--;
	}

	public void gainLife() {
		lives++;
	}
	public boolean checkLife() {
		boolean b = false;
		if (lives == 0)
			b = true;
		return b;
	}

	public void setAmmo() {
		gunAmmo = 1;
	}

	// for powerup usage only
	// return n is for changing the display message
	public int checkAmmo() {
		int n;
		if (gunAmmo == 1)
			n = 1;
		else {
			setAmmo();
			n = 0;
		}
		return n;
	}

	public int getAmmo() {
		return gunAmmo;
	}

}
