package de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.hamsters;

import de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.Color;

/**
 * A hamster in space.
 */
public interface SpaceHamster {
	/**
	 * Gets the color of the hamster's fur.
	 *
	 * @return color of the hamster's fur.
	 */
	public Color getUniformColor();

	/**
	 * Encourages this hamster.
	 *
	 * Ensures that this hamster is encouraged.
	 */
	public void encourage();

	/**
	 * Uses the hamster's special ability.
	 * If the hamster is encouraged, it uses the special ability more vigorously.
	 */
	public void useSpecialAbility();
}
