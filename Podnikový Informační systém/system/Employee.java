public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private String position;
    private double salary;

    public Employee(String firstName, String lastName, int id, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Zaměstnanec ID: " + id + ", Jméno: " + firstName + " " + lastName + ", Pozice: " + position + ", Plat: " + salary);
    }
}
