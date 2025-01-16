package de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse;

import java.util.HashSet;
import java.util.Optional;
import java.util.Random;

import de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse.items.Compass;
import de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse.items.Pen;
import de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse.items.Ruler;
import de.unistuttgart.iste.sqa.pse.sheet10.homework.warehouse.items.StationeryItem;

/**
 * Represents a company.
 *
 * A company stores items and processes orders.
 *
 * @author Schweikert
 */
public final class Company {

    private final StorageRack itemStorageRack;
    private final Buffer orderBuffer;
    private final HashSet<Customer> knownCustomers;  

    /**
     * Creates a new Company with a StorageRack that can hold up to 75 items.
     */
    public Company() {
        orderBuffer = new Buffer();
        itemStorageRack = new StorageRack(75);
        knownCustomers = new HashSet<>();  
    }

    /**
     * Stores the given stationery item in the storage rack.
     *
     * If the storage rack is full, the item will be ignored.
     *
     * @param stationeryItem The stationery item to store.
     */
    public void storeInStorageRack(final StationeryItem stationeryItem) {
        try {
            itemStorageRack.addItem(stationeryItem);
        } catch (IllegalStateException e) {
            System.out.println("Storage rack is full. Item cannot be added: " + stationeryItem);
        }
    }

     /**
     * Processes an incoming order by moving the item to the order buffer.
     *
     * @param identifier The identifier of the item to process.
     * @param customer   The customer placing the order.
     */
    public void processIncomingOrder(final Identifier identifier, final Customer customer) {
		Optional<Integer> compartmentNumber = itemStorageRack.getCompartmentNumberOf(identifier);

        if (compartmentNumber.isPresent()) {
            Optional<StationeryItem> item = itemStorageRack.getItem(compartmentNumber.get());               

       	 if (item.isPresent()) {
            orderBuffer.bufferItem(item.get());

            if (!knownCustomers.contains(customer)) {
                StationeryItem bonusItem = getBonusItem();
                orderBuffer.bufferItem(bonusItem);  
                knownCustomers.add(customer);       
            }
       	 } 
		}else {
            System.out.println("Artikel mit der Kennzeichnung " + identifier + " nicht im Lager.");
        }
    }

    /**
     * Generates a bonus item for marketing reasons.
     *
     * @return A non-null marketing bonus item.
     */
    private StationeryItem getBonusItem() {
        switch ((new Random().nextInt(3))) {
            case 1:
                return new Compass(new Identifier(), "A marketing bonus item.");
            case 2:
                return new Ruler(new Identifier(), "A marketing bonus item.");
            default:
                return new Pen(new Identifier(), "A marketing bonus item.");
        }
    }

    /**
     * If items are waiting for packaging, takes the next available item from the buffer and returns it.
     *
     * @return The next available item for packaging, or an empty Optional if there is none.
     */
    public Optional<StationeryItem> takeItemForPackaging() {
        if (orderBuffer.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(orderBuffer.releaseItem());
        }
    }
}
