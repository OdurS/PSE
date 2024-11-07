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
 * runs a semicircle
 * 
 *(@requires: he doesn't run into any walls)
 @ensures he actually runs in a semicircle
 "@requires is not implemented"   =>Also eigentlich keine Vorbedingung
 */
	void doHalfCircle() {
		controlledHamster.write("Executing helper0:");
		controlledHamster.turnLeft();
		controlledHamster.move();
		controlledHamster.turnLeft();
		controlledHamster.write("I ran a half circle!");
	}
/**
 * Picks up all the grains and move one step forward, until @requires is false
 * @requires There is no wall in front of him
 * @ensures he does what he's supposed to do
 * 
 * "Error": it outputs the last text even if while is not fulfilled

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
	 * It turns to the left a specified number of times
	 * @ensures it executes the command correctly
	 * @param turns indicates how often it should turn to the left
	 */
	void turnLeftNTimes(Integer turns) {
		controlledHamster.write("Executing helper2:");
		for (Integer i = 0; i < turns; i++) {
			controlledHamster.turnLeft();
		}
		controlledHamster.write(String.format("I turned %d times!", turns));
	}

	/**
	 * He moves stpes times, and add steps to counter
	 * @requires, as long as there is nothing before him
	 * then it reports how many of the steps it has taken
	 * @ensures has moved number of steps or moved to the next Wall and counted number of teken steps, write them
	 * @param steps number of taken steps
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
