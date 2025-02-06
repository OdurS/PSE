package de.unistuttgart.iste.sqa.pse.sheet13.presence.memory;

import java.util.LinkedList;
import java.util.Queue;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Hamstergame for solving an exercise.
 */
public class MemoryHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new MemoryHamsterGame.<br>
	 * Do not modify!
	 */
	public MemoryHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/order.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	@Override
	protected void run() {
		// Comment any operation call out, to run the others on their own.
		this.inOrder();
		this.reverseOrder();
		this.sort();

		// TODO implement
	}

	/**
	 * TODO add documentation here.
	 */
	private Integer NumberOfGrainsAtLocation;
	private void reverseOrder() {
		Queue<Integer> numberOfGrains = new LinkedList<>();
		pickAllGrains();
		while (paule.frontIsClear()) {
			numberOfGrains.add(NumberOfGrainsAtLocation);
			paule.move();
			pickAllGrains();
		}
		numberOfGrains.add(NumberOfGrainsAtLocation);

		paule.turnLeft();
		paule.turnLeft();

		putNumberOfGrains(numberOfGrains.peek());
		numberOfGrains.poll();

		while (!numberOfGrains.isEmpty()) { 
			paule.move();
			putNumberOfGrains(numberOfGrains.peek());
			numberOfGrains.poll();
		}

		paule.turnLeft();
		paule.turnLeft();
	}

	private void putNumberOfGrains(Integer number){
		for (int idx = 0; idx < number; idx++) {
			paule.putGrain();
			
		}
	}
	private void pickAllGrains(){
		NumberOfGrainsAtLocation = 0;
		while (paule.grainAvailable()) {
			paule.pickGrain();
			NumberOfGrainsAtLocation = NumberOfGrainsAtLocation + 1; 
		}
	}

	/**
	 * TODO add documentation here.
	 */
	private void inOrder() {
		// TODO implement
	}

	/**
	 * TODO add documentation here.
	 */
	private void sort() {
		// TODO implement
	}

	// TODO Add additional Operations here
}
