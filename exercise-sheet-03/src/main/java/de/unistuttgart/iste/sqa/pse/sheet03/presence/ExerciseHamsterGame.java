package de.unistuttgart.iste.sqa.pse.sheet03.presence;

import de.hamstersimulator.objectsfirst.external.model.Territory;
import java.io.PrintStream;

/**
 * Please describe this class here.
 *
 * @author Schweikert
 * @version (a version number or a date)
 */
public final class ExerciseHamsterGame extends InternalExerciseHamsterGame {
	/**
	 * This {@link PrintStream} object is to be used for exercise 2b).
	 */
	protected final PrintStream output = System.out;

	@Override
	protected void hamsterRun() {
		final Territory territory = game.getTerritory();
		getTerritorySize();
		//getNumberOfGrainsAt(Location );
		hamster.write(getTerritorySize());
		hamster.write();
		hamster.write();

	}
}
