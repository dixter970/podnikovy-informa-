import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CompanySystem system = CompanySystem.getInstance();

        system.addEmployee(new Employee("Jan", "Novák", 1, "Manažer", 50000));
        system.addEmployee(new Employee("Eva", "Svobodová", 2, "Účetní", 40000));
        System.out.println("Celkové mzdové náklady: " + system.calculateTotalSalaries());

        system.addOrder(new Order(101, "Web App", "Vývoj firemního webu", "Probíhá", LocalDate.now(), LocalDate.now().plusDays(30)));
        system.printActiveOrders();

        system.addInventoryItem(new InventoryItem("Papír", 201, 100, 50));
        system.addInventoryItem(new InventoryItem("Toner", 202, 2, 5));
        system.printLowStockItems();

        OrderProcessing processor = new OrderProcessing();
        Map<Integer, Integer> objednavka = new HashMap<>();
        objednavka.put(201, 10);
        objednavka.put(202, 3);

        processor.processOrder(objednavka, system.getInventoryMap());
    }
}
