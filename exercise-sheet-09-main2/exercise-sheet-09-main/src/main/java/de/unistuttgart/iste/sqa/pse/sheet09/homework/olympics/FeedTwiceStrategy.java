package de.unistuttgart.iste.sqa.pse.sheet09.homework.olympics;
/**
 * Implements a strategy where the hamster eats once
 * Only returns true, when it hasnt already eaten twice.
 */
/*
 * implements a strategy in which the Hamster eat twice
 * @autor Schweikert
 */
public final class FeedTwiceStrategy implements FeedingStrategy {
	int feedTwice = 2;
	/*@
	@ feedTwice is implemented;
	@ ensures returned true when feedOnce >=1
	@ ensures otherwise return false
	@*/
	@Override
	public boolean isFeedingRequired() {
		if ( feedTwice>= 1) {
			feedTwice--;
			return true;
		}else {
			feedTwice = 2;
			return false;
		}
	}
}