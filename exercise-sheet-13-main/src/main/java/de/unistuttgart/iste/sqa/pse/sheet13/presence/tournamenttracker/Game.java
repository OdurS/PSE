package de.unistuttgart.iste.sqa.pse.sheet13.presence.tournamenttracker;

import java.util.Objects;

/**
 * Represents a game between a home team and a visiting team, including the resulting score if set.
 *
 * @author andrevanhoorn
 *
 */
public class Game {
	private static final int SCORE_NOT_STORED = Integer.MIN_VALUE;

	/*
	 * Classinvariant: {@code scoreHome} and {@code scoreVisiting} must not be {@code null}.
	 */

	private final Team homeTeam;
	private final Team visitingTeam;
	private int scoreHome = SCORE_NOT_STORED;
	private int scoreVisiting = SCORE_NOT_STORED;

	/**
	 * Creates a new game between the given home team and visiting team.
	 *
	 * @param homeTeam the home team, must not be null
	 * @param vistingTeam the visiting team, must not be null
	 * @throws IllegalArgumentException if homeTeam or visitingTeam is null
	 */
	public Game(final Team homeTeam, final Team vistingTeam) {
		if (homeTeam == null) {
			throw new IllegalArgumentException("Home team must not be null");
		}
		if (vistingTeam == null) {
			throw new IllegalArgumentException("Visiting team must not be null");
		}
		this.homeTeam = homeTeam;
		this.visitingTeam = vistingTeam;
	}

	/**
	 * Stores the result of this game if not set before.
	 *
	 * Requires that the scores are not yet set.
	 * Ensures that the scores are set.
	 *
	 * @param scoreHome	score of the home team
	 * @param scoreVisiting score of the visiting team
	 * @throws IllegalStateException if the score has already been stored
	 */
	public void storeResult(final int scoreHome, final int scoreVisiting) {
		if (this.scoreHome != SCORE_NOT_STORED || this.scoreVisiting != SCORE_NOT_STORED) {
			throw new IllegalStateException("Score for this game already stored");
		}

		this.scoreHome = scoreHome;
		this.scoreVisiting = scoreVisiting;
	}

	/**
	 * Get the home team.
	 *
	 * @return the home team
	 */
	public Team getHomeTeam() {
		return homeTeam;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
		result = prime * result + scoreHome;
		result = prime * result + scoreVisiting;
		result = prime * result + ((visitingTeam == null) ? 0 : visitingTeam.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Game other = (Game) obj;
		if (!Objects.equals(homeTeam, other.homeTeam)) {
			return false;
		}
		if (scoreHome != other.scoreHome) {
			return false;
		}
		if (scoreVisiting != other.scoreVisiting) {
			return false;
		}
		if (!Objects.equals(visitingTeam, other.visitingTeam)) {
			return false;
		}
		return true;
	}

	/**
	 * Get the visiting team.
	 *
	 * @return the visiting team
	 */
	public Team getVisitingTeam() {
		return visitingTeam;
	}

	/**
	 * Get the score of the home team.
	 *
	 * @return the score of the home team
	 */
	public int getScoreHome() {
		return scoreHome;
	}

	/**
	 * Get the score of the visiting team.
	 *
	 * @return the score of the visiting team
	 */
	public int getScoreVisiting() {
		return scoreVisiting;
	}

	@Override
	public String toString() {
		return "Game [homeTeam=" + homeTeam + ", visitingTeam=" + visitingTeam + ", scoreHome=" + scoreHome
				+ ", scoreVisiting=" + scoreVisiting + "]";
	}
}
