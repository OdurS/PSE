package de.unistuttgart.iste.sqa.pse.sheet06.homework.painter.spiral;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Describe the purpose of this class here.
 *
 * @author Schweikert
 * @version (a version number or a date)
 */
public class PainterPauleSpiralHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new PainterPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public PainterPauleSpiralHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/PainterPauleTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	@Override
	protected void run() {
		spiral();
	}
	private void turnRight() {
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
	}
	private int lengthOfLine = 0;
	private void paintFirstLineAndGetLength(){
		while (paule.frontIsClear()) { 
			paule.putGrain();
			paule.move();
			lengthOfLine = lengthOfLine +1;
		}
		turnRight();

	}
	private void PaintLineLength(){
		for (int i = 0; i < lengthOfLine; i++) {
			paule.putGrain();
			paule.move();
		}

	}
	private void PaintNextLength(){
		for (int i = 0; i < 2; i++) {
			PaintLineLength();
			turnRight();
		}
		lengthOfLine = lengthOfLine -2;
	}


	/**
	 * TODO insert JavaDoc here.
	 */
	private void spiral() {
			paintFirstLineAndGetLength();
		while (!paule.mouthEmpty()) { 
			PaintNextLength();
		}
		
	}
}
