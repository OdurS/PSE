package de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters;

/**
 * Functional interface for special abilities of space hamsters.
 */
@FunctionalInterface
public interface SpecialAbility {
	/**
	 * Applies a hamster's special ability to the given spaceship.
	 *
	 * @param ship the ship to apply the special ability to. Must not be {@code null}.
	 */
	public void applySpecialAbility(final SpaceShip ship);
}
