package jan16;

import java.util.Scanner;

public class TableOfAnyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of your choice of Table");
        int table = scanner.nextInt();
        int cnt = 1;
        int result = 0;
        while (cnt <=10){
            result = table*cnt;
            System.out.println(table +" * "+ cnt + " = " + result);
            cnt++;
        }
    }
}
