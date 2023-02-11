public class Employee {
  private String firstName, surname;
  private int age, monthlyRate, sss, pagibig;
  private double grossSalary, netSalary;

  public Employee(String firstName, String surname, int age, int monthlyRate, int sss, int pagibig) {
    this.firstName = firstName;
    this.surname = surname;
    this.age = age;
    this.monthlyRate = monthlyRate;
    this.sss = sss;
    this.pagibig = pagibig;
  }

  public String getSurname() {
    return surname;
  }

  public String getFullName() {
    return firstName + " " + surname;
  }

  public int getAge() {
    return age;
  }

  public double getGrossSalary(int numberOfDaysWorked) {

    // Assuming that there are 24 days of work normally
    this.grossSalary = monthlyRate / 24d * numberOfDaysWorked;

    return this.grossSalary;
  }

  public double getNetSalary() {
    this.netSalary = grossSalary - (sss + pagibig);
    return netSalary;
  }
}
