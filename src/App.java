import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String surname = "";
        int numberOfDaysWorked = 0;

        System.out.print("Enter a Surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter the number of days worked: ");
        numberOfDaysWorked = scanner.nextInt();
        System.out.println(getNetAndGrossSalary(surname, numberOfDaysWorked));
        scanner.close();
    }
    
    public static String getNetAndGrossSalary(String surname, int numberOfDaysWorked) {
        TextFileParser textFileParser = new TextFileParser("res/data.txt");
        double netSalary = 0, grossSalary = 0;
        String fullName = "";
        
        Employee employee = textFileParser.getEmployee(surname);
        grossSalary = employee.getGrossSalary(numberOfDaysWorked);
        netSalary = employee.getNetSalary();
        fullName = employee.getFullName();

        DecimalFormat dFormat = new DecimalFormat("#,##0.00");

        return String.format("Name: %s; Gross Salary: Php%s; Net Salary: Php%s", fullName, dFormat.format(grossSalary), dFormat.format(netSalary));
    }
}

