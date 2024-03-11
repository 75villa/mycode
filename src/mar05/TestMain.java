package mar05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(10);
        list.add(1300);
        list.add(500);

        Collections.sort(list);
        System.out.println(list);

//        Collections.binarySearch()

        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(101, "Manish Mehta"));
        list1.add(new Employee(102, "Manish1 Mehta"));
        list1.add(new Employee(103, "Manish2 Mehta"));
        list1.add(new Employee(104, "Manish3 Mehta"));

        
    }
}
