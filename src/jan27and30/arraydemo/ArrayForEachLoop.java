package jan27and30.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayForEachLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values...:");

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = -1;
        int sum = 0;
        int min = 9999;
        int avg = 0;
        //==================================================
        int n = arr.length;
        //sort of array
        Arrays.sort(arr);
        System.out.println("Second highest number....:" + arr[n - 2]);

        //=================================================
        int highest = Integer.MIN_VALUE;
        int secondhigh = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > highest) {
                secondhigh = highest;
                highest = arr[i];
                System.out.println(highest);
                System.out.println(secondhigh);
            }
            if (arr[i] < highest && arr[i] > secondhigh) {
                secondhigh = arr[i];
            }
        }
        //==================================================
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " , ");
        }
        for (int element : arr) {
            //System.out.println(element);
            sum = sum + element;
            if (num < element) {
                num = element;
            }
            if (min > element) {
                min = element;
            }
        }

        avg = sum / arr.length;
        System.out.println("Maximum number of element is...:" + num);
        System.out.println("Minimum number of element is...:" + min);
        System.out.println("Sum of element are.............:" + sum);
        System.out.println("Average of elements are........:" + avg);
        System.out.println("Second highest number....:" + secondhigh);
    }
}
