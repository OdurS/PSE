package de.unistuttgart.iste.sqa.pse.sheet04.exercise;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.external.model.Territory;

/**
 * In this hamster-game {@code paule} gets two new friends.
 *
 * @author Schweikert
 * @version (A date or a version number)
 */
public class PaulesFriendsGame extends InternalPaulesFriendsGame {


		
		
	 
	void createPaulesFriends() {
		
		// Local variables for Ronnie
		Location locationRonnie = new Location(8,8);
		Direction directionRonnie = Direction.EAST ;
		Territory territoryRonnie = game.getTerritory();
		Integer grainCountRonnie=0;
		Hamster ronnie= new Hamster(territoryRonnie,locationRonnie,directionRonnie,grainCountRonnie);
		// Local variables for Paula
		Location locationPaula = new Location(8,0);
		Direction directionPaula= Direction.WEST;
		Territory territoryPaula= game.getTerritory();
		Integer grainCountPaula=5;
		Hamster paula= new Hamster(territoryPaula,locationPaula,directionPaula,grainCountPaula);
		// TODO create hamsters according to exercise 1 of sheet 4

				

		// Hint: Be careful with the location of the new hamsters
	}

	/**
	 * Starts the PaulesFriendsGame to create {@code paule}s friends.
	 * Do <strong>not modify</strong> this operation!
	 */
	protected void run() {
		game.startGame();
		createPaulesFriends();
	}
}
