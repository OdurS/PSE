package de.unistuttgart.iste.sqa.pse.sheet09.homework.olympics;

/**
 * * Implements a strategy where the hamster eats once
 * Only returns true, when it hasnt already eaten.
 * @author Schweikert
 */
public final class FeedOnceStrategy implements FeedingStrategy {
	int feedOnce = 1;
	/*@
	@ feedOnce is implemented;
	@ ensures returned true when feedOnce = 1
	@ ensures otherwise return false
	@*/
	@Override
	public boolean isFeedingRequired() {
		if ( feedOnce == 1) {
			feedOnce--;
			return true;
		}else {
			feedOnce = 1;
			return false;
		}

	}	
}