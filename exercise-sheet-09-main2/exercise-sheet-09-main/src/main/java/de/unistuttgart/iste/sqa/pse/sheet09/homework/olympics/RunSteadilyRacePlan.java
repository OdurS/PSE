package de.unistuttgart.iste.sqa.pse.sheet09.homework.olympics;

/**
 * Implements a Race Plan in which the the RunnerHamster runs steadily
 *
 * @author Schweikert
 */
public final class RunSteadilyRacePlan implements RacePlan {
	/**
	 * Uses Strategy Design Pattern  to make the hamster run steady
	 * @param hamster the hamster that executed this race plan
	 */
	/*@
	@ requires hamster is valid && runSteadily is implemented;
	@ ensures runSteadly has been executed
	@ ensures hamster has moved
	@*/
	@Override
	public void nextStep(final RunnerHamster hamster) {
		if (hamster.getEnergyRemaining()>0) {
			hamster.runSteadily();
		}else {
			hamster.runSlowly();
		}
	}
}
