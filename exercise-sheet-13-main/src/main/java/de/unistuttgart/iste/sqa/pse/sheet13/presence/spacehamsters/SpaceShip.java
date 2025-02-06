package de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters;

import de.unistuttgart.iste.sqa.pse.sheet13.presence.spacehamsters.hamsters.SpaceHamster;
import java.util.HashSet;
import java.util.Set;

/**
 * A spaceship with a crew of space hamsters.
 */
public class SpaceShip {

	/*
	 * Classinvariant: The crew must never be null.
	 */

	private final Set<SpaceHamster> crew;

	/**
	 * Create a new space ship with an empty crew.
	 *
	 * Ensures that {@code this.crew != null} and that {@code this.crew} is empty.
	 */
	public SpaceShip() {
		this.crew = new HashSet<SpaceHamster>();
	}

	/**
	 * Add a new member to the crew.
	 *
	 * Ensures, that the new member is part of the crew.
	 *
	 * @param hamster member to be added to the crew. Must not be {@code null}.
	 */
	public void addCrewMember(final SpaceHamster hamster) {
		if (hamster == null) {
			throw new IllegalArgumentException("New crew member must not be null!");
		}
		crew.add(hamster);
	}

	/**
	 * Gets the crew of the spaceship.
	 *
	 * @return the ships's crew
	 */
	public Set<SpaceHamster> getCrew() {
		return this.crew;
	}

	/**
	 * Repairs the spaceship.
	 */
	public void repair() {
		System.out.println("This ship is being repaired.");
	}
}
