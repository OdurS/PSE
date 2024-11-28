package de.unistuttgart.iste.sqa.pse.sheet06.homework.maze;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Describe the purpose of this class here.
 *
 * @author Schweikert
 * @version (a version number or a date)
 */
public class AmazingPauleHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new AmazingPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public AmazingPauleHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/AmazingPauleTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Ignore this method.<br>
	 * Put your code in passTheMaze()!
	 */
	@Override
	protected void run() {
		passTheMaze();
	}
	/**
	 * Paule turns to the right 
	 */
	private void turnRight() {
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
	}
	/**
	 * When checking whether the left is free, if the left is free it continues to look in that direction, otherwise it turns back again
	 * @return Whether the left is free
	 */
	private boolean isLeftFree() {
		paule.turnLeft();
		if(paule.frontIsClear()){
			return true;
		}
		else{
			turnRight();
			return false;
		}
	}
	/**
	 * Paule runs until there is a wall in front of him or to the next place where his left is free and then executes isLeftFree and then continues running
	 * @ensures !paule.frontIsClear
	 * @invariante times paule has moved
	 */
	private void moveToNextPoint() {
		while(isLeftFree() || paule.frontIsClear()){
			paule.move();
		}
	}
	private  int turnCounter = 0;
	/**
	 * Find the next possible path that is not directly back, left preverence
	 * @param turnCounterIt always counts when he turns while looking for liks, if there are 2 he turns once extra, the counter is reset so that Paule doesn't just run back
	 * @ensures Paule looks in the direction of the next possible path to his left, which excludes the one to the rear, unless only the path back exists
	 */
	private void findNextWayLeft(){
		turnCounter = 0;
		while (!paule.frontIsClear()) { 
			paule.turnLeft();
			turnCounter = turnCounter +1;
			if (turnCounter == 2) {
				paule.turnLeft();
				turnCounter = 0;
			}
		}
	}

/**
 * runs through the labirint to the grain
 * @requires The Labirint must be possible
 * @requires A grain must exist
 * @ensures Paule has something in his mouth
 */
	void passTheMaze() {
		while (!paule.grainAvailable()) { 
			moveToNextPoint();
			findNextWayLeft();
		}
		paule.pickGrain();
		
	}
}
