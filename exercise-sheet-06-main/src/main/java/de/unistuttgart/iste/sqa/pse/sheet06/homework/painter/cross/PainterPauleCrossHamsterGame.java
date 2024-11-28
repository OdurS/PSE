package de.unistuttgart.iste.sqa.pse.sheet06.homework.painter.cross;

import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 *  Hamster legt ein Kreutz aus Körnern in ein belibig großes quadratisches Feld
 *
 * @author Schweikert
 * @version (a version number or a date)
 */
public class PainterPauleCrossHamsterGame extends SimpleHamsterGame {

	Hamster paule= new Hamster();
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
	 * Hamster legt ein Kreutz aus Körnern in ein belibig großes quadratisches Feld
	 * @requires Es muss ein Quadratisches Feld sein
	 * @requires default Hamster muss unten links erstellt werden und nach Norden schauen
	 * @ensures Es éxistier ein Kreuz aus Körnern
	 */
	private void cross() {
		 paintLineDirgonalUp();
		 paule.turnLeft();
		 walkeStraitLine();
		 paule.turnLeft();
		paintLineDirgonalDown();

		
	
}
}