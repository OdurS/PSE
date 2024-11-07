package de.unistuttgart.iste.sqa.pse.sheet03.homework;

/**
 * Describe the class TwoHamstersHamsterGame here.
 *
 * @author Schweikert
 *
 */
public class TwoHamstersHamsterGame extends InternalTwoHamstersHamsterGame {

	@Override
	/**
	 * Paule and Tiffeny run to collect all the grains and meet in the middle and put all the grains down
	 */
	void hamsterRun() {
		tiffany.move(); 
		controllerTiffany.pickAllGrains();
		tiffany.turnLeft();
		controllerTiffany.moveNTimes(2);
		controllerTiffany.pickAllGrains();
		controllerTiffany.turnLeftNTimes(3);
		controllerTiffany.moveNTimes(2);
		controllerTiffany.pickAllGrains();
		controllerTiffany.turnLeftNTimes(3);
		controllerTiffany.moveNTimes(3);
		//Tiffeny is at the meeting point with all the grains
		paule.move();
		controllerPaule.pickUpGainsBehinde();
		controllerPaule.pickAllGrains();
		controllerPaule.turnLeftNTimes(3);
		paule.move();
		controllerPaule.pickAllGrains();
		paule.move();
		controllerPaule.turnLeftNTimes(3);
		controllerPaule.pickUpGainsBehinde();
		paule.turnLeft();
		paule.move();
		controllerPaule.pickAllGrains();
		controllerPaule.turnLeftNTimes(1);
		controllerPaule.moveNTimes(3);
		//Paule is at the meeting point with all the grains
		controllerTiffany.putAllGrains();
		controllerPaule.putAllGrains();

	}
}
