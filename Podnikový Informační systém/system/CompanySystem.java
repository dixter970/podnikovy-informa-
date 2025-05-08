import java.util.*;

public class CompanySystem {
    private static CompanySystem instance;

    private Map<Integer, Employee> employees = new HashMap<>();
    private Map<Integer, Order> orders = new HashMap<>();
    private Map<Integer, InventoryItem> inventory = new HashMap<>();

    private CompanySystem() {}

    public static CompanySystem getInstance() {
        if (instance == null) {
            instance = new CompanySystem();
        }
        return instance;
    }

    public void addEmployee(Employee e) {
        employees.put(e.getId(), e);
        System.out.println("Zaměstnanec přidán.");
    }

    public void removeEmployee(int id) {
        employees.remove(id);
        System.out.println("Zaměstnanec odstraněn.");
    }

    public Employee findEmployee(int id) {
        return employees.get(id);
    }

    public double calculateTotalSalaries() {
        return employees.values().stream().mapToDouble(Employee::getSalary).sum();
    }

    public void addOrder(Order o) {
        orders.put(o.getOrderId(), o);
        System.out.println("Zakázka přidána.");
    }

    public Order findOrder(int id) {
        return orders.get(id);
    }

    public void printActiveOrders() {
        for (Order o : orders.values()) {
            if (!o.getStatus().equalsIgnoreCase("Dokončena")) {
                o.printInfo();
            }
        }
    }

    public void addInventoryItem(InventoryItem i) {
        inventory.put(i.getId(), i);
        System.out.println("Položka přidána.");
    }

    public void updateInventory(int id, int quantity) {
        if (inventory.containsKey(id)) {
            inventory.get(id).updateQuantity(quantity);
        }
    }

    public void printLowStockItems() {
        for (InventoryItem item : inventory.values()) {
            if (item.isBelowMinimum()) {
                item.printInfo();
            }
        }
    }

    public Map<Integer, InventoryItem> getInventoryMap() {
        return inventory;
    }
}
