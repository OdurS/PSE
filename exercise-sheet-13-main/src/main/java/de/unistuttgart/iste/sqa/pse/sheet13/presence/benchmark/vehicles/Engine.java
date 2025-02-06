package de.unistuttgart.iste.sqa.pse.sheet13.presence.benchmark.vehicles;

/**
 * An Engine that is built into a {@link Vehicle}
 *
 * Each engine has a power value and an ID.
 */
public class Engine {

	/*
	 * Classinvariants: The power value must be greater than 0. The ID must not be
	 * null or blank.
	 */

	private final double power;
	private final String engineId;

	/**
	 * Create a new engine.
	 *
	 * @param power    the engine's power. Must be >= 0.
	 * @param engineId the engine's id. Must not be {@code null} or blank.
	 */
	public Engine(final double power, final String engineId) {
		if (power <= 0 || engineId == null || engineId.isBlank()) {
			throw new IllegalArgumentException("Cannot create Enging with given power value and ID.");
		}
		this.power = power;
		this.engineId = engineId;
	}

	/**
	 * Get the power of the engine.
	 *
	 * @return the power of the engine.
	 */
	public double getPower() {
		return this.power;
	}

	@Override
	public String toString() {
		return engineId;
	}
}
