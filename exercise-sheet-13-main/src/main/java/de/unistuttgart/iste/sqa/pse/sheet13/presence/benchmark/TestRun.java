package de.unistuttgart.iste.sqa.pse.sheet13.presence.benchmark;

import de.unistuttgart.iste.sqa.pse.sheet13.presence.benchmark.vehicles.Vehicle;

/**
 * A single test run.
 * A test run puts a {@link Vehicle} with the defined velocity onto testroute and checks how far the vehicle gets.
 * If the vehicle completes the testroute, the test run is a success.
 * Otherwise, it is a failure.
 */
public final class TestRun {

	private final TestRoute route;
	private final Vehicle vehicle;
	private double result;

	/**
	 * Create a new {@code TestRun}.
	 *
	 * @param route the route to test on. Must not be {@code null}.
	 * @param vehicle the vehicle to be tested. Must not be {@code null}.
	 */
	public TestRun(final TestRoute route, final Vehicle vehicle) {
		if (route == null || vehicle == null) {
			throw new IllegalArgumentException("Cannot create TestRun with given route and verhicle.");
		}
		this.route = route;
		this.vehicle = vehicle;
		this.result = -1;
	}

	/**
	 * Execute the TestRun.
	 *
	 * Ensures that the result of the test run is updated.
	 */
	public void executeTest() {
		result = vehicle.getPerformance() / route.velocity();
	}

	/**
	 * Determine, whether the vehicle completed the route successfully or not.
	 *
	 * @return true, iff the test ran and the vehicle completed the route.
	 */
	public Boolean testSucceded() {
		return result != -1 && result < route.length();
	}
}
