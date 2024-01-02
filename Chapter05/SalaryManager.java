import java.math.BigDecimal;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salary = new SalaryManager();
        System.out.println(salary.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthSalary = yearlySalary / 12.0;

        double totalTax = calculateHealthInsurance(monthSalary) + calculateNationalPension(monthSalary) + calculateTax(monthSalary);
        monthSalary -= totalTax;

        return monthSalary;
    }

    public double calculateTax(double monthSalary) {
        double tax = monthSalary * 0.125;
        System.out.println("Tax : " + tax);
        return tax;
    }

    public double calculateNationalPension(double monthSalary) {
        double nationalPension = monthSalary * 0.081;
        System.out.println("NationalPension : " + nationalPension);

        return nationalPension;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double healthInsurance = monthSalary * 0.135;
        System.out.println("HealthInsurance : " + healthInsurance);
        
        return healthInsurance;
    }
}
