
import java.util.Map;

public class OrderProcessing {
    public void processOrder(Map<Integer, Integer> requestedItems, Map<Integer, InventoryItem> inventory) {
        boolean canProcess = true;

        for (Map.Entry<Integer, Integer> entry : requestedItems.entrySet()) {
            int id = entry.getKey();
            int needed = entry.getValue();
            InventoryItem item = inventory.get(id);

            if (item == null || item.getQuantity() < needed) {
                System.out.println("Nedostatek položky ID: " + id + ", požadováno: " + needed);
                canProcess = false;
            }
        }

        if (canProcess) {
            for (Map.Entry<Integer, Integer> entry : requestedItems.entrySet()) {
                inventory.get(entry.getKey()).updateQuantity(-entry.getValue());
            }
            System.out.println("Objednávka byla úspěšně zpracována.");
        } else {
            System.out.println("Objednávku nelze zpracovat kvůli nedostatku zásob.");
        }
    }
}