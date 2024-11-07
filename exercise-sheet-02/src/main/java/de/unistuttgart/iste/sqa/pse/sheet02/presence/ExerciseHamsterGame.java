package de.unistuttgart.iste.sqa.pse.sheet02.presence;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * A simple HamsterGame where paule can walk a path of grains
 */
public class ExerciseHamsterGame extends InternalExerciseHamsterGame {
	/**
	 * Make Paule turn right, e.g., if Paule looks to the north, he should look to
	 * the east after this operation got executed.
	 */
	public void turnRight() {
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
	}

	public Hamster getHamster() {
		return paule;
	}

	@Override
	/**
	 * Paule läuft bis zur nächsten wand, habt dann 5 Ganins auf und legt alle an die selbe stelle und Sagt, das er Paule heißt
	 */
	void hamsterRun() {
		while(paule.frontIsClear())
		{
			paule.move();
		}
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		for (int i = 0; i < 5; i++)
		{
			paule.move();
			paule.pickGrain();
		}

		paule.write("My name is Paule!");
		
	}
}
//fragen, 1 wieso kann ich Turn Rigth nicht benutzen, kann nichts mehr ausführen und habe oben hamster implamentiert
