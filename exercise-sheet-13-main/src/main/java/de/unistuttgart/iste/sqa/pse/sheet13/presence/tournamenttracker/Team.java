package de.unistuttgart.iste.sqa.pse.sheet13.presence.tournamenttracker;

/**
 * Represents a sports team.
 *
 * @author andrevanhoorn
 */
public record Team(String name) {
	/**
	 * Creates a new team with the given name;
	 *
	 * @param name name of the team, must not be null or empty
	 * @throws IllegalArgumentException if name is null or empty
	 */
	public Team {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name must not be null or empty");
		}
	}
}
