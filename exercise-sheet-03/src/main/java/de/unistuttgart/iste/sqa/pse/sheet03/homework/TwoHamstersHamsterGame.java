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
	 * Paule und Tiffeny laufen sammeln alle Körner und treffen sich in der MItte und legen alle Körner ab
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
		//Tiffeny ist mit allen Körnern am Treffpunkt
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
		//Paule ist mit allen Körnern am Treffpunkt
		controllerTiffany.putAllGrains();
		controllerPaule.putAllGrains();

	}
}
