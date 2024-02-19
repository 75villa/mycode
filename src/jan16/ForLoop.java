package jan16;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\"Enter the number of your choice of Table");
//        int table = scanner.nextInt();
//        int result = 0;
//        for(int i=1; i<=10; i++){
//            result = table*i;
//            System.out.println(table +" * "+ i + " = " + result);
//        }
        for (int i=1; i<=100; i++){
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
