package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * Describe the class TwoHamstersHamsterGame here.
 *
 * @author Schweikert
 *
 */
public class TwoHamstersHamsterGame extends InternalTwoHamstersHamsterGame {

	@Override
	void hamsterRun() {
		tiffany.move(); 
		controllerTiffany.pickAllGrains();
		tiffany.turnLeft();
		controllerTiffany.moveNTimes(2);
		controllerTiffany.pickAllGrains();
		controllerTiffany.turnLeftNTimes(3);
		controllerTiffany.moveNTimes(2);
		controllerTiffany.pickAllGrains();
		controllerTiffany.turnLeftNTimes(2);
		controllerTiffany.moveNTimes(3);
		controllerTiffany.putAllGrains();

	}
}
