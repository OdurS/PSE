package de.unistuttgart.iste.sqa.pse.sheet05.homework;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * In this hamster-game {@code paule} gets four new friends.
 *
 * @author Schweikert
 * @version (A date or a version number)
 */
public class HamsterPartyGame extends SimpleHamsterGame {
	
	public HamsterPartyGame() {
		this.loadTerritoryFromResourceFile("/territories/territory-hamsterparty.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}
		Hamster adam= new Hamster(game.getTerritory(),new Location(0,0),Direction.EAST,0);
		Hamster eva= new Hamster(game.getTerritory(),new Location(0,1),Direction.EAST,0);
		Hamster erik= new Hamster(game.getTerritory(),new Location(4,2),Direction.EAST,0);
		Hamster lupin= new Hamster(game.getTerritory(),new Location(4,4),Direction.WEST,0);
	/**
	 * Starts the HamsterPartyGame.
	 *
	 */
	protected void run() {}
}
