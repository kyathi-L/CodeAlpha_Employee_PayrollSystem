public class Employee {
    private String name;
    private int id;
    private double hourlyRate;

    public Employee(String name, int id, double hourlyRate) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
