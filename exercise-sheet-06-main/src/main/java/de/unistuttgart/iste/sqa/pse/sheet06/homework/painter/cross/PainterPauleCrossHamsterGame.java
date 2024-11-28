package de.unistuttgart.iste.sqa.pse.sheet06.homework.painter.cross;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Hamster places a cross made of grains in a square field of any size
 *
 * @author Schweikert
 * @version (a version number or a date)
 */
public class PainterPauleCrossHamsterGame extends SimpleHamsterGame {

	public PainterPauleCrossHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/PainterPauleTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	@Override
	protected void run() {
		cross();
	}

	
	private void turnRight() {
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
	}
	private void paintLineDirgonalUp (){
		while(paule.frontIsClear()){
			paule.putGrain();
			paule.move();
			turnRight();
			if (paule.frontIsClear()) {
				paule.move();
				paule.turnLeft();
			}
		}
	}
	private  void paintLineDirgonalDown(){
		while (paule.frontIsClear()) { 
			paule.putGrain();
			paule.move();
		
		paule.turnLeft();
		if (paule.frontIsClear()) {
			paule.move();
			turnRight();
		}
		}
	}
	private void walkeStraitLine(){
		while (paule.frontIsClear()) { 
			paule.move();
		}
	}
	/**
	 * Hamster places a cross made of grains in a square field of any size
	 * @requires It must be a square field
	 * @requires default hamster must be created at the bottom left and facing north
	 * @ensures A cross made of grains exists
	 */
	private void cross() {
		 paintLineDirgonalUp();
		 paule.putGrain();
		 paule.turnLeft();
		 walkeStraitLine();
		 paule.turnLeft();
		 paintLineDirgonalDown();
		 paule.putGrain();

		
	
}
}