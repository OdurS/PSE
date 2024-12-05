package de.unistuttgart.iste.sqa.pse.sheet07.homework.exceptions;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * A SimpleHamsterGame with exceptions
 *
 * @author Schweikert
 */
public class LazyHamsterGame extends SimpleHamsterGame {

	/**
	 * This constructor is used for loading a territory for the game and for displaying it.
	 * Do not modify.
	 */
	public LazyHamsterGame(final String territoryFile) {
		this.loadTerritoryFromResourceFile(territoryFile);
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Do not modify this operation.
	 */
	@Override
	protected void run() {
		moveMultipleSteps(5);
	}

	/**
	 * paule moves with a probability of 75%
	 * @requires paule.front is clear
	 * @ensures paule has moved or was to Lazy
	 */
	public boolean hasWalked;
	public void tryToMove() {
	    int a = (int) Math.random()*4;
		if (a <= 1){
			hasWalked = false;
			throw new TooLazyException();
		}
		else{
			paule.move();
			hasWalked = true;
		}
	}


	// TODO add documentation with contracts here
	public void moveMultipleSteps(int numberOfSteps) {
		for (int i = 0; i < numberOfSteps; i++) {
			if (isCaged()) {
				throw new NoWayToGoException();
			}
			else{
				while (!paule.frontIsClear()) { 
					paule.turnLeft();
				}
				tryToMove();
				if (hasWalked) {
					
				}
				
			}
		}
	}

	/**
	 * if paule is Caged true
	 * @return if paule is Caged
	 */
	public boolean isCaged() {
		int wallCounter = 0;
		for (int i = 0; i < 4; i++) {
			if (paule.frontIsClear()){
				wallCounter++;
			} 
			paule.turnLeft();
		}
		if (wallCounter == 4){
		return true; 
		}
		else {
			return false;
		}
	}
}