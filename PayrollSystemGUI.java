import javax.swing.*;
import java.awt.event.*;

public class PayrollSystemGUI {
    private JFrame frame;
    private JTextField nameField, idField, rateField, hoursField;
    private JTextArea outputArea;
    private PayrollSystem payrollSystem;

    public PayrollSystemGUI() {
        frame = new JFrame("Employee Payroll System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 80, 25);
        frame.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(100, 20, 200, 25);
        frame.add(nameField);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 50, 80, 25);
        frame.add(idLabel);

        idField = new JTextField();
        idField.setBounds(100, 50, 100, 25);
        frame.add(idField);

        JLabel rateLabel = new JLabel("Hourly Rate:");
        rateLabel.setBounds(20, 80, 80, 25);
        frame.add(rateLabel);

        rateField = new JTextField();
        rateField.setBounds(100, 80, 100, 25);
        frame.add(rateField);

        JLabel hoursLabel = new JLabel("Hours Worked:");
        hoursLabel.setBounds(20, 110, 100, 25);
        frame.add(hoursLabel);

        hoursField = new JTextField();
        hoursField.setBounds(130, 110, 100, 25);
        frame.add(hoursField);

        JButton calculateButton = new JButton("Calculate Salary");
        calculateButton.setBounds(20, 140, 150, 25);
        frame.add(calculateButton);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateSalary();
            }
        });

        outputArea = new JTextArea();
        outputArea.setBounds(20, 180, 350, 80);
        frame.add(outputArea);

        payrollSystem = new PayrollSystem();

        frame.setVisible(true);
    }

    private void calculateSalary() {
        String name = nameField.getText();
        int id = Integer.parseInt(idField.getText());
        double rate = Double.parseDouble(rateField.getText());
        int hoursWorked = Integer.parseInt(hoursField.getText());

        Employee employee = new Employee(name, id, rate);
        double salary = payrollSystem.calculateSalary(employee, hoursWorked);

        outputArea.setText("Employee: " + name + "\nID: " + id + "\nSalary: $" + salary);
    }
}
