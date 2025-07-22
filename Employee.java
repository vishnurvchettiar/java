package inheritance;

import java.util.Scanner;

    public class Employee extends inheritance.Employ_detail {

        Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            Employee obj = new Employee();
            obj.inputDetails();
            obj.displayDetails();
        }

        public void inputDetails() {
            System.out.println("Enter Employee ID:");
            setEmployeeId(sc.nextInt());
            sc.nextLine(); // consume newline

            System.out.println("Enter Employee Name:");
            setEmployeeName(sc.nextLine());

            System.out.println("Enter Employee Salary:");
            setEmployeeSalary(sc.nextDouble());
        }

        public void displayDetails() {
            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + getEmployeeId());
            System.out.println("Name: " + getEmployeeName());
            System.out.println("Salary: " + getFormattedSalary());
        }
    }

