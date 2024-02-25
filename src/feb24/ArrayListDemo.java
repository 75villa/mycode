package feb24;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5};

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        al1.add(60);

        for (int i = 1; i < 5; i++) {
            System.out.println(al1.indexOf(i));

        }
    }
}
