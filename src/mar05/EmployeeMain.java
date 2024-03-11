package mar05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Manish");
        Employee employee2 = new Employee(101, "Manish");

        Map<Employee, Double> map = new HashMap<>();

        map.put(employee1, 100000.00);
        map.put(employee2, 100000.00);

        Set<Map.Entry<Employee, Double>> entries = map.entrySet();
        for (Map.Entry<Employee, Double> entry : map.entrySet()) {
            System.out.println("Emp ID..:" + entry.getKey().empId);
            System.out.println("Emp Name..:" + entry.getKey().empName);
        }

    }

}
