package de.unistuttgart.iste.sqa.pse.sheet06.homework.maze;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Describe the purpose of this class here.
 *
 * @author Schweikert
 * @version (a version number or a date)
 */
public class AmazingPauleHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new AmazingPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public AmazingPauleHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/AmazingPauleTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Ignore this method.<br>
	 * Put your code in passTheMaze()!
	 */
	@Override
	protected void run() {
		passTheMaze();
	}
	/**
	 * Paule dreht sich nach rechts 
	 */
	private void turnRight() {
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
	}
	/**
	 * Wenn geprüft wird ob links frei ist, wenn links frei guckt er weiterhin in die Richtung, sonst dreht er sich wieder zurück
	 * @return Ob links frei ist
	 */
	private boolean isLeftFree() {
		paule.turnLeft();
		if(paule.frontIsClear()){
			return true;
		}
		else{
			turnRight();
			return false;
		}
	}
	/**
	 * Paule läuft, bis vor ihm eine Wand oder zur nächsten Stelle wo Links von ihm frei ist und führt dann isLeftFree aus, läuft dann weiter
	 * @ensures !paule.frontIsClear
	 * @invariante times paule has moved
	 */
	private void moveToNextPoint() {
		while(isLeftFree() || paule.frontIsClear()){
			paule.move();
		}
	}
	private  int turnCounter = 0;
	/**
	 * Findet den nächst möglichen weg der nicht direkt zurück ist, links präverenz
	 * @param turnCounter zählt immer wenn er beim suchen sich nach liks dreht, wenn gleich 2 dreht er sich einmal extra der COunter wird zurückgesetzt, damit paule nicht einfach zurücl läuft
	 * @ensures Paule guckt in die richtung des nächst möglichen Weges, links von ihm , den nach hinten ausgeschlossen, außer es existiert nur der weg zurück 
	 */
	private void findNextWayLeft(){
		turnCounter = 0;
		while (!paule.frontIsClear()) { 
			paule.turnLeft();
			turnCounter = turnCounter +1;
			if (turnCounter == 2) {
				paule.turnLeft();
				turnCounter = 0;
			}
		}
	}

/**
 * läuft durch das Labirint bis zum Korn
 * @requires Das Labirint muss möglich sein
 * @requires Es muss ein Korn exestiren
 * @ensures PAule hat ein Korn im Mund
 */
	void passTheMaze() {
		while (!paule.grainAvailable()) { 
			moveToNextPoint();
			findNextWayLeft();
		}
		paule.pickGrain();
		
	}
}
