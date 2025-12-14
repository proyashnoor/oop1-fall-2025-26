package Lab;

public class FinTask2 {

    // -------- Position Class --------
    static class Position {
        String title;
        double salary;

        Position(String title, double salary) {
            this.title = title;
            this.salary = salary;
        }

        void showPosition() {
            System.out.println("Position: " + title);
            System.out.println("Salary: $" + salary);
        }
    }

    // -------- Employee Class --------
    static class Employee {
        String name;
        Position position;

        Employee(String name, Position position) {
            this.name = name;
            this.position = position;
        }

        void showEmployee() {
            System.out.println("Employee Name: " + name);
            position.showPosition();
        }
    }

    // -------- Company Class --------
    static class Company {
        String companyName;
        Employee[] employees;
        int count = 0;

        Company(String companyName, int size) {
            this.companyName = companyName;
            employees = new Employee[size];   // fixed-size array
        }

        void addEmployee(Employee e) {
            if (count < employees.length) {
                employees[count] = e;
                count++;
            }
        }

        void showEmployees() {
            System.out.println("Company: " + companyName);
            System.out.println("Employee List:");

            for (int i = 0; i < count; i++) {
                System.out.println("------------------");
                employees[i].showEmployee();
            }
        }
    }

    // -------- Main Method --------
    public static void main(String[] args) {

        Company c = new Company("Apple", 3);

        c.addEmployee(new Employee(
                "Antony",
                new Position("Manager", 50000)));

        c.addEmployee(new Employee(
                "Goldberg",
                new Position("Developer", 40000)));

        c.addEmployee(new Employee(
                "Clair",
                new Position("Designer", 35000)));

        c.showEmployees();
    }
}

