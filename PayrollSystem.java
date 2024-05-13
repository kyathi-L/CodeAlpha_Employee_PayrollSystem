import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
    }

    public double calculateSalary(Employee employee, int hoursWorked) {
        return employee.getHourlyRate() * hoursWorked;
    }
}
