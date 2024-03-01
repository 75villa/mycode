package jan27and30.arraydemo;

import java.util.Scanner;

public class ArrayWithScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entaer your values....:");

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the Fruit name....:");
        String[] fruit = new String[5];
        for (int j = 0; j < fruit.length; j++) {
            fruit[j] = scanner.nextLine();
        }
        for (int j = 0; j < fruit.length; j++) {
            System.out.println(fruit[j]);
        }

    }

}
