package de.unistuttgart.iste.sqa.pse.sheet09.homework.olympics;

/**
 * implements a Raceplan in wich the running hamster sprints
 *
 * @author Schweikert
 */
public final class SprinterRacePlan implements RacePlan {
	/**
	 *Uses Strategy Design Pattern to make the hamster run fast
	 * @param hamster the hamster that executed this race plan
	 */
	/*@
	@ requires hamster is valid && runHard is implemented;
	@ ensures runHard has been executed
	@ ensures hamster has moved
	@*/
	@Override
	public void nextStep(final RunnerHamster hamster) {
		if (hamster.getEnergyRemaining()>3) {
			hamster.runHard();
		} else if (hamster.getEnergyRemaining()>0) {
			hamster.runSteadily();
		}else {
			hamster.runSlowly();
		}
	}
}
