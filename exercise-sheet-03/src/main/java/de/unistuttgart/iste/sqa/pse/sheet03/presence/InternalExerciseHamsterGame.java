package de.unistuttgart.iste.sqa.pse.sheet03.presence;

import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;

/**
 * This class is used to prepare and run a game.
 * You do not need to alter anything in this class.
 */
public abstract class InternalExerciseHamsterGame extends InspectableSimpleHamsterGame {

	/**
	 * This constructor is used for loading a territory for the game and for displaying it.
	 */
	public InternalExerciseHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/territory.ter");
		this.displayInNewGameWindow();
	}

	@Override
	protected void run() {
		game.startGame();
		hamsterRun();
		game.stopGame();
	}

	/**
	 * This method contains everything that the hamster is supposed to do.
	 */
	abstract void hamsterRun();
}
