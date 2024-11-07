package de.unistuttgart.iste.sqa.pse.sheet03.presence;

import java.io.PrintStream;

import de.hamstersimulator.objectsfirst.external.model.Territory;

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
		//String a =Size.toString(territory.getTerritorySize());
		//String b= Integer.toString(territory.getTotalGrainCount());
		//String c= Integer.toString(territory.getTotalHamsterCount());
		
		//paule.write("Größe des Territory: " + a);
		//paule.write("Anzahl an Körnern: " + b);
		//paule.write("Anzahl an Hamstern: " + c);
		//paule.write(c);

	}
}
