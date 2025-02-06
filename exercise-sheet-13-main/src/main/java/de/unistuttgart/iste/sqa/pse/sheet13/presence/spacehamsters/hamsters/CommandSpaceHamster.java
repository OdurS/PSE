package de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.hamsters;

import de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.Color;
import de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.SpaceShip;
import de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.SpecialAbility;

/**
 * A space hamster in a commanding position.
 * Commanding space hamsters wear red uniforms.
 */
public class CommandSpaceHamster extends OrdinarySpaceHamster {
	/**
	 * Creates a new {@link CommandSpaceHamster}.
	 *
	 * The new commander has the given ability and is part of the given ship.
	 *
	 * Ensures that the newly created hamster is part of the crew of the {@link SpaceShip} {@code ship}.
	 *
	 * @param ship the ship the space hamster is on. Must not be {@code null}.
	 * @param ability the hamster's special ability. Must not be {@code null}.
	 */
	public CommandSpaceHamster(final SpaceShip ship, final SpecialAbility ability) {
		super(ship, ability);
	}

	@Override
	public Color getUniformColor() {
		return Color.RED;
	}
}
