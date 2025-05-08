import java.time.LocalDate;

public class Order {
    private int orderId;
    private String name;
    private String description;
    private String status;
    private LocalDate receivedDate;
    private LocalDate deadline;

    public Order(int orderId, String name, String description, String status, LocalDate receivedDate, LocalDate deadline) {
        this.orderId = orderId;
        this.name = name;
        this.description = description;
        this.status = status;
        this.receivedDate = receivedDate;
        this.deadline = deadline;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void printInfo() {
        System.out.println("Zakázka ID: " + orderId + ", Název: " + name + ", Stav: " + status + ", Termín: " + deadline);
    }
}