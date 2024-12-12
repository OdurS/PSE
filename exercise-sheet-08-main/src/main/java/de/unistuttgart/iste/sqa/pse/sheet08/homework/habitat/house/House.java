package de.unistuttgart.iste.sqa.pse.sheet08.homework.habitat.house;

import java.util.Set;
import java.util.HashSet;

/**
 * A house in the habitat game.
 *
 * A house consists of a least one wall and up to one door per wall.
 *
 * @author Schweikert
 *
 */
public final class House {

	private final Set<HouseWall> walls;

	/**
	 * Get all the walls of the house.
	 * @return walls of the house.
	 */
	public Set<HouseWall> getWalls() {
		return walls;
	}

	/**
	 * Get all the doors of the house.
	 *
	 * @return doors of the house.
	 */



    private Set<Door> doors; // Set to store all the doors in the house

    public House() {
        this.doors = new HashSet<>(); // Initialize the set of doors
    }

    // Method to add a door to the house
    public void addDoor(Door door) {
        doors.add(door);
    }

    // Implementing the getDoors() method
    public Set<Door> getDoors() {
        return new HashSet<>(doors); // Return a copy of the set to avoid external modifications
    }



	/**
	 * Creates a new house with the specified walls.
	 *
	 * @param walls walls of the new house.
	 */
	public House(final Set<HouseWall> walls) {
		if (walls == null || walls.isEmpty()) {
			throw new IllegalArgumentException("A house must have at least one wall, but there are none.");
		}
		this.walls = walls;
	}
}
