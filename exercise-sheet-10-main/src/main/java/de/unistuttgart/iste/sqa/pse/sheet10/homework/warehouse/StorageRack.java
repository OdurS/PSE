package de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse.items.StationeryItem;

/**
 * Represents a warehouse that can hold a fixed number of items.
 * The number of holdable items is defined by the capacity of the storage rack.
 *
 * @author  Schweikert
 */
public final class StorageRack {
    // class invariants:
    // capacity > 0;
    // numberOfItems >= 0;
    // numberOfItems <= capacity;
    private List<Optional<StationeryItem>> shelves;
    private final int capacity;
    private int numberOfItems;
    
    // Map zur Zuordnung von Identifier zu Fachnummern
    private final Map<Identifier, Integer> itemLocationMap;

    /**
     * Creates a new storage rack with the given capacity.
     *
     * Ensures that the new rack is empty and has the given capacity.
     *
     * @param capacity capacity of the storage rack. Must be > 0.
     * @throws IllegalArgumentException If capacity is less than 1.
     */
    public StorageRack(final int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("A warehouse must have a minimum capacity of 1.");
        }
        this.capacity = capacity;
        this.numberOfItems = 0;
        this.shelves = new ArrayList<>(capacity);
        this.itemLocationMap = new HashMap<>();

        // Initialize the storage rack with empty Optional objects
        for (int i = 0; i < capacity; i++) {
            shelves.add(Optional.empty());
        }
    }

    /**
     * Adds a StationeryItem to the first available compartment.
     * Updates the mapping from the item's identifier to its compartment number.
     *
     * @param stationeryItem The item to be added to the rack.
     * @throws IllegalStateException If there is no available compartment.
     */
    public void addItem(final StationeryItem stationeryItem) {
        for (int i = 0; i < capacity; i++) {
            if (shelves.get(i).isEmpty()) {
                shelves.set(i, Optional.of(stationeryItem));
                itemLocationMap.put(stationeryItem.getIdentifier(), i);
                numberOfItems++;
                return;
            }
        }
        throw new IllegalStateException("No free compartment available.");
    }

    /**
     * Removes the item from the specified compartment.
     * Removes the mapping of the item's identifier if present.
     *
     * @param compartmentNumber The compartment number to remove the item from.
     */
    public void removeItem(final int compartmentNumber) {
        if (compartmentNumber >= 0 && compartmentNumber < capacity) {
            Optional<StationeryItem> item = shelves.get(compartmentNumber);
            item.ifPresent(stationeryItem -> itemLocationMap.remove(stationeryItem.getIdentifier()));
            shelves.set(compartmentNumber, Optional.empty());
            numberOfItems--;
        }
    }

    /**
     * Retrieves the item from the specified compartment.
     *
     * @param compartmentNumber The compartment number to retrieve the item from.
     * @return The item in the specified compartment, wrapped in an Optional.
     */
    public Optional<StationeryItem> getItem(final int compartmentNumber) {
        if (compartmentNumber >= 0 && compartmentNumber < capacity) {
            return shelves.get(compartmentNumber);
        }
        return Optional.empty();
    }

    /**
     * Retrieves the compartment number of the item with the specified identifier.
     *
     * @param identifier The identifier of the item to locate.
     * @return The compartment number where the item is located, wrapped in an Optional.
     */
    public Optional<Integer> getCompartmentNumberOf(final Identifier identifier) {
        return Optional.ofNullable(itemLocationMap.get(identifier));
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
