package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * Describe the class HomeworkHamsterGame here.
 *
 * @author Schweikert,Fritsche
 */
public class HomeworkHamsterGame extends InternalHomeworkHamsterGame {

	/*
	 * Confused Paule! Help Paule to walk through the territory and to bring all the
	 * grains into his cave. In the process Paule should collect all grains on the
	 * field and deposit them in his cave (lower left corner - row 4 * column 1 and
	 * indexing starts with 0).
	 */
	@Override
	protected void hamsterRun() {
		// EXERCISE 2:
		// Help Paule to walk through the territory and to bring all the grains
		// into his cave.

		// Walk to the first grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the first grain
		paule.pickGrain();

		// Turn in the direction of the second grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		// You can remove this line
		paule.write("I do not know how to continue:'(");

		// Move to the second grain
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the second grain
		paule.pickGrain();

		// Add further steps (comment + code) to collect all grains!

		//läuft zur 3ten Nuss
		paule.turnLeft();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();

		//nimmt nuss auf
		paule.pickGrain();

		//läuft zu den letzten nüssen
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();

		//hebt 3 nüsse auf
		paule.pickGrain();
		paule.pickGrain();
		paule.pickGrain();

		//läuft zur hölle
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();

		//theoretisch die eine Nuss aufheben, damit er alle hat
		paule.pickGrain();

		//alle Nüsse hinlegen
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();

	}
}
