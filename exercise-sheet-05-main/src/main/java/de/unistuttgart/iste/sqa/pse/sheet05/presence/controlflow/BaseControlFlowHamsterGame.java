package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflow;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * A new HamsterGame to try out some control flow structures.
 *
 * @author Schweikert
 * @version (version number or date)
 */
public abstract class BaseControlFlowHamsterGame extends SimpleHamsterGame {

	/**
	 * Constructor for the BaseControlFlowHamsterGame class.
	 * Do not modify!
	 *
	 * @param territoryFile file-path to the .ter file specifying the game territory
	 */
	public BaseControlFlowHamsterGame(final String territoryFile) {
		this.loadTerritoryFromResourceFile(territoryFile);
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Move paule to the next wall.
	 *
	 * Ensures that paule's front is not clear.
	 *
	 * This is an example for an operation with pre- and postconditions and
	 * loop(in)variants in natural language.
	 */
	protected void moveToWall() {
		/*@
		@ loop_invariant paule moved number of already executed loop iterations steps.
		@ decreasing number of tiles between paule and the next wall.
		@*/
		while (paule.frontIsClear()) {
			paule.move();
		}
	}

	/*
	 * Please implement your solutions into the following methods.
	 * Remember to add the appropriate JavaDoc documentation and pre-post conditions for each operation
	 * as well as the variants and loop invariants for any loops that are part of your implementation.
	 */
/** 
 * pick up Grain, if Grain is avalible
 * @encures Grains count at location of paule -1 of bevore
*/
	protected void pickGrainIfAvailable() {
		if(paule.grainAvalible())
		{
			paule.pickUpGrain();
		}
	}
/**
 * pick ups all grains until all are picked up
 * @encures Grains count at location of paule is 0
 * @loop-invariante war richtig gemacht
 * @decreasing Number of Grains Availible != 0, i--
 */
	protected void pickAllGrains() {
		while (paule.grainAvalible()) {
			paule.pickUpGrain();
		}
	}
/**
 * moves parameter times
 * @requires Front is clear, every step 
 * @param times number of steps
 * @encures moved times times
 * @loop-invariante  paule has moved i times
 * @decreasing times -i 
 *  */
	protected void multiMove(Integer times) {
			for(i = 1; i <= times; i++)
			{
				paule.move();
			}
	}
	/**
	 * pick up Grain or moves
	 * @requires Grain is avalible or front is clear
	 * @encures has pickt up a grain or moved
	 */
	protected void pickGrainOrMove() {
		if(paule.grainAvalible())
		{
			paule.pickUpGrain();
		}
		else
		{
			paule.move();
		}
	}

	/**
	 * pick up all Grains, on an not empty Tile
	 * @requires Tile is not emty
	 * @encures Tile is emty
	 * @loop-invariante Number of Grains paule has picked , i++
	* @decreasing Number of Grains Availible on the Tile to 0, i--
	 */
	protected void pickAllGrainsOnNonEmptyTile() {
		do 
		{
			paule.pickUpGrain();	
		}
		while (paule.grainAvalible());
		{
			paule.pickUPGrain();
		}
	}

	protected void putGrains(Integer amountOfGrains) {
		// TODO: Please implement according to exercise 2 (a)
	}

	protected void emptyMouth() {
		// TODO: Please implement according to exercise 2 (b)
	}

	protected void cleanTerritory() {
		// TODO: Please implement according to exercise 2 (c)/(d)
	}
}
