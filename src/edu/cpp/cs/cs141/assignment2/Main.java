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
import java.io.Serializable;
/**
 * @author
 *
 */
public class Main implements Serializable {

	/**
	 * Instantializes the game
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		UserInterface uiClass = new UserInterface();
		uiClass.gameStart();
//		uiClass.printMap();
//		// to soon be changed to maybe
//		// uiClass.startMenu();
	}

}
