package de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse.items.StationeryItem;

/**
 * Represents a warehouse that can hold a fixed number of items.
 * The number of holdable items is defined by the capacity of the storage rack.
 *
 * @author Schweikert
 */
public final class StorageRack {
	// classinvariants:
	// capacity > 0;
	// numberOfItems >= 0;
	// numberOfItems <= capacity;
	private List<StationeryItem> shelves;
	private final int capacity;
	private int numberOfItems;
	// TODO: Add data structures for exercises part (a) and (c) here.

	/**
	 * Creates a new storage rack with the given capacity.
	 *
	 * Ensures that the new rack is empty and has the given capacity.
	 *
	 * TODO add missing pre- and postconditions here.
	 *
	 * @param capacity capacity of the storage rack. Must be > 0.
	 *
	 * @throws IllegalArgumentException If capacity is less than 1.
	 */
	public StorageRack(final int capacity) {
		
		if (capacity <= 0) {
			throw new IllegalArgumentException("A warehouse must have a minimum capacity of 1.");
		}
		this.capacity = capacity;
		numberOfItems = 0;
		// TODO initialize data structures for exercises part (a) and (c) here.
		this.shelves = new ArrayList<>(capacity);

		for (int i = 0; i < capacity; i++) {
			Optional<Object> a = Optional.empty();
            //shelves.add(a);  geht nicht
        }
	}

	// TODO add documentation here.
	public void addItem(StationeryItem stationeryItem) {
        for (int i = 0; i < capacity; i++) {
            if (shelves.get(i).isEmpty()) {
                shelves.set(i, Optional.of(stationeryItem));
                System.out.println("Item hinzugefügt an Platz " + i);
                return; // Beenden, sobald das Item hinzugefügt wurde
            }
        }
        throw new IllegalStateException("Kein freies Fach verfügbar."); // Ausnahme werfen, wenn kein freier Platz vorhanden
		//d)
    }

	// TODO add documentation here.
	public void removeItem(final int compartmentNumber) {
		// TODO implement exercises part (b) and (d) here.
	}

	// TODO add documentation here.
	public Optional<StationeryItem> getItem(final int compartmentNumber) {
		// TODO implement exercise part (b) here.
		return Optional.empty(); // TODO delete this line if necessary.
	}

	// TODO add documentation here.
	public Optional<Integer> getCompartmentNumberOf(final Identifier identifier) {
		// TODO implement exercise part (d) here.
		return Optional.empty(); // TODO delete this line if necessary.
	}

	/**
	 * Get the capacity of this warehouse.
	 *
	 * @return The capacity of this warehouse.
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Get the number of items in this warehouse.
	 *
	 * @return The number of items in this warehouse.
	 */
	public int getNumberOfItems() {
		return this.numberOfItems;
	}
}
