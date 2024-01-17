package Chapter18_Midterm.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary sample = new CalculateSalary();
        sample.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        long salary = employee.getSalary();
        long increaseSalary = 0;
        switch (employee.getType()) {
            case 1:
                increaseSalary = (long) (salary * 0.05);
                break;
            case 2:
                increaseSalary = (long) (salary * 1.1);
                break;
            case 3:
                increaseSalary = (long) (salary * 1.2);
                break;
            case 4:
                increaseSalary = (long) (salary * 1.3);
                break;
            case 5:
                increaseSalary =  (salary * 2);
        }
        return increaseSalary;
    }

    public void calculateSalaries() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("LeeDaeRi", 1, 1000000000);
        employees[1] = new Employee("KimManager", 2, 100000000);
        employees[2] = new Employee("WhangDesign", 3, 700000000);
        employees[3] = new Employee("ParkArchi", 4, 800000000);
        employees[4] = new Employee("LeeDevelop", 5, 60000000);

        for (Employee employee : employees) {
            long salary = getSalaryIncrease(employee);
            System.out.println(employee.getName() + "=" + salary);
        }
    }
}
