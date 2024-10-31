package de.unistuttgart.iste.sqa.pse.sheet02.presence;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * A simple HamsterGame where paule can walk a path of grains
 */
public class ExerciseHamsterGame extends InternalExerciseHamsterGame {
	private Hamster hamster;
	/**
	 * Make Paule turn right, e.g., if Paule looks to the north, he should look to
	 * the east after this operation got executed.
	 */
	public void turnRight() {
		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();
	}

	public Hamster getHamster() {
		return paule;
	}

	@Override
	/**
	 * Paule läuft bis zur nächsten wand, habt dann 5 Ganins auf und legt alle an die selbe stelle und Sagt, das er Paule heißt
	 */
	void hamsterRun() {
		if (hamster.frontIsClear()) 
		{
			hamster.move();
		}
		//hamster.turnRight();
		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();
		hamster.move();
		//hamster.turnRight();
		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();
		for (int i = 0; i < 5; i++)
		{
			hamster.move();
			hamster.pickGrain();
		}

		hamster.write("My name is Paule!");
		
	}
}
//fragen, 1 wieso kann ich Turn Rigth nicht benutzen, kann nichts mehr ausführen und habe oben hamster implamentiert
