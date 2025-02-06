package de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.hamsters;

import de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.Color;
import de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.SpaceShip;
import de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.SpecialAbility;

/**
 * A normal space hamster that is part of a spaceship's crew.
 */
public class OrdinarySpaceHamster implements SpaceHamster {
	protected boolean isEncouraged = false;
	private final SpecialAbility ability;
	private final SpaceShip ship;

	/**
	 * Creates a new ordinary space hamster.
	 *
	 * The new hamster has the given ability and is part of the given ship.
	 *
	 * Ensures that the new hamster is part of the crew of the {@link SpaceShip} {@code ship}.
	 *
	 * @param ship the ship the space hamster is on. Must not be {@code null}.
	 * @param ability the hamster's special ability. Must not be {@code null}.
	 */
	public OrdinarySpaceHamster(final SpaceShip ship, final SpecialAbility ability) {
		super();
		if (ship == null || ability == null) {
			throw new IllegalArgumentException("Parameters must not be null, but at least one of them is.");
		}
		this.ability = ability;
		this.ship = ship;
		this.ship.getCrew().add(this);
	}

	@Override
	public Color getUniformColor() {
		return Color.GRAY;
	}

	@Override
	public void encourage() {
		this.isEncouraged = true;
	}

	@Override
	public void useSpecialAbility() {
		ability.applySpecialAbility(ship);
		if (isEncouraged) {
			ability.applySpecialAbility(ship);
		}
	}
}
