package jan14;

import java.util.Scanner;

public class SwitchCaseDemo {
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
        int number1 = scanner.nextInt();
        System.out.println("Enter your second number.....:");
        int number2 = scanner.nextInt();

        System.out.println(number1);
        System.out.println(number2);


        switch(choice){

            case 1:
                int sum = number1+number2;
                System.out.println("Sum of your numbers are.....:"+ sum);
                break;
            case 2:
                int sub = number1-number2;
                System.out.println("Substraction  of your numbers are.....:"+sub);
                break;
            case 3:
                int multi = number1*number2;
                System.out.println("Multiplication  of your numbers are.....:"+multi);
                break;
            case 4:
                int div = number1/number2;
                System.out.println("Division  of your numbers are.....:"+div);
                break;
            case 5:
                int mod = number1%number2;
                System.out.println("Modulus  of your numbers are.....:"+mod);
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
    }
}
