package de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse;

import java.util.LinkedList;
import java.util.Queue;

import de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse.items.StationeryItem;

/**
 * Represents a buffer for temporary storage of items.
 *
 * This buffer uses a queue to manage items in a first-in, first-out (FIFO) order.
 * Items are added to the back of the queue and removed from the front.
 *
 * @author Schweikert
 */
public final class Buffer {

    // Using a Queue to manage items in FIFO order
    private final Queue<StationeryItem> itemQueue;

    /**
     * Initializes the buffer with an empty queue.
     */
    public Buffer() {
        itemQueue = new LinkedList<>();
    }

    /**
     * Adds an item to the buffer.
     *
     * @param stationeryItem the item to add to the buffer
     */
    public void bufferItem(final StationeryItem stationeryItem) {
        itemQueue.offer(stationeryItem);
    }

    /**
     * Releases the next item from the buffer.
     *
     * @return the next item, or null if the buffer is empty
     */
    public StationeryItem releaseItem() {
        return itemQueue.poll();
    }

    /**
     * Checks if the buffer is empty.
     *
     * @return true if the buffer is empty, false otherwise
     */
    public /*@ pure @*/ boolean isEmpty() {
        return itemQueue.isEmpty();
    }
}
