package framework.Events;

public class InventoryChangeEvent {
    private final int itemId;
    private final int quantityChange;
    private final int newQuantity;
    private final String itemName;

    public InventoryChangeEvent(int itemId, int quantityChange, int newQuantity, String itemName) {
        this.itemId = itemId;
        this.quantityChange = quantityChange;
        this.newQuantity = newQuantity;
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQuantityChange() {
        return quantityChange;
    }

    public int getNewQuantity() {
        return newQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "InventoryChangeEvent{" +
                "itemId=" + itemId +
                ", quantityChange=" + quantityChange +
                ", newQuantity=" + newQuantity +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}