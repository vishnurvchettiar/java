package inheritance;

public class Employ_detail {
        int employee_id;
        String employee_name;


        private double employee_salary;


        public int getEmployeeId() {
            return employee_id;
        }

        public void setEmployeeId(int id) {
            this.employee_id = id;
        }

        public String getEmployeeName() {
            return employee_name;
        }

        public void setEmployeeName(String name) {
            this.employee_name = name;
        }


        public void setEmployeeSalary(double salary) {
            this.employee_salary = salary;
        }


        public String getFormattedSalary() {
            return String.format("₹%.2f", employee_salary);
        }
    }

