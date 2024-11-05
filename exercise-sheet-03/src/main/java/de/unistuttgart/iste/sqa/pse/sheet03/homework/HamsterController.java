package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 *
 * A control unit to control a hamster.
 *
 * A HamsterController knows some behavioural patterns for hamsters and makes
 * the controlled hamsters act according to those patterns.
 *
 * @author Schweikert
 *
 */
public class HamsterController {

	private Hamster controlledHamster;

	/**
	 * Create a new controller for the controlling the given hamster.
	 *
	 * @param hamster The hamster that will be controlled, must not be null.
	 */
	public HamsterController(Hamster hamster) {
		this.controlledHamster = hamster;
	}

	/**
	 * Pick all grains on the controlled hamster's tile.
	 *
	 * Ensures that the tile is empty.
	 */
	void pickAllGrains() {
		controlledHamster.write("Executing pickAllGrains:");
		Integer counter = 0;
		while (controlledHamster.grainAvailable()) {
			controlledHamster.pickGrain();
			counter++;
		}
		controlledHamster.write(String.format("%d available grains on my Tile. I picked all of them!", counter));
	}

	/**
	 * Put all the controlled hamster's grain on the current tile.
	 *
	 * Ensures that the controlled hamster's mouth is empty.
	 */
	void putAllGrains() {
		controlledHamster.write("Executing putAllGrains:");
		Integer counter = 0;
		while (!controlledHamster.mouthEmpty()) {
			controlledHamster.putGrain();
			counter++;
		}
		controlledHamster.write(String.format("I had %d grains in my mouth. I put all of them on my Tile!", counter));
	}
/**
 * läuft einen Halbkreis
 * 
 *(@requires: er läuft gegen keine Wand)
 @ensures er läuft tatsächlich einen Halbkreis
 "@requires ist nicht implamentiert" 
 */
	void doHalfCircle() {
		controlledHamster.write("Executing helper0:");
		controlledHamster.turnLeft();
		controlledHamster.move();
		controlledHamster.turnLeft();
		controlledHamster.write("I ran a half circle!");
	}
/**
 * Habt alle Gains auf und läuft eins nach vorne
 * @requires Vor ihm ist keine Wand
 * @ensures er macht das was er soll
 * 
 * "Fehler": er gibt letzen Text aus auch wehn while nicht erfüllt

 * 
 */
	void pickUpGainsBehinde() {
		controlledHamster.write("Executing helper1:");
		while (controlledHamster.frontIsClear()) {
			pickAllGrains();
			controlledHamster.move();
		}
		controlledHamster.write("I picked all grains, on the tile behind me!");
	}

	/**
	 * Er dreht sich eine anzugebdende Anzahl offt nach links
	 * @ensures er führt den Befehl richtig aus
	 * @param turns gibt an wieoft er sich nach links drehen soll
	 */
	void turnLeftNTimes(Integer turns) {
		controlledHamster.write("Executing helper2:");
		for (Integer i = 0; i < turns; i++) {
			controlledHamster.turnLeft();
		}
		controlledHamster.write(String.format("I turned %d times!", turns));
	}

	/**
	 * Er läuf anzugebende Anzahl Vorwehrts
	 * @requires, solang Vor ihm nichts ist
	 * dann gibt er aus, wieviele der Schritte er gemacht hat
	 * @param steps
	 */
	void moveNTimes(Integer steps) {
		controlledHamster.write("Executing helper3:");
		Integer counter = 0;
		for (; counter < steps && controlledHamster.frontIsClear(); counter++) {
			controlledHamster.move();
		}
		controlledHamster.write(String.format("I moved %d out of %d steps!", counter, steps));
	}
}
