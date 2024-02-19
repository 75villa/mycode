package jan14;

import java.util.Scanner;

public class CalculatorDemo{

    public static void main(String[] args) {
        System.out.println("**********My Calculator World**********");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Modulus");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice.....:");
        int choice = scanner.nextInt();

        System.out.println("Enter your first number.....:");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number.....:");
        int num2 = scanner.nextInt();

        if (choice == 1){
            int sum = num1=num2;
            System.out.println("Sum of your numbers are.....:"+ sum);
        }
        if (choice == 2){
            int sub = num1-num2;
            System.out.println("Substraction  of your numbers are.....:"+sub);
        }
        if (choice == 3){
            int div = num1/num2;
            System.out.println("Division  of your numbers are.....:"+div);
        }
        if (choice == 4){
            int multi = num1*num2;
            System.out.println("Multiplication  of your numbers are.....:"+multi);
        }
        if (choice == 5){
            int mod = num1%num2;
            System.out.println("Modulus  of your numbers are.....:"+mod);
        }
        if (choice <1 || choice >5 ){
            System.out.println("Your choice selections must between 1 and 5");

        }


    }
}
