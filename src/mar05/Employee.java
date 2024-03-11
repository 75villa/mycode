package mar05;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    int empId;
    String empName;

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName);
    }
}
