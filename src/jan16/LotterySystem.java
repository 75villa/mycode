package jan16;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User to enter numbers");
        int points = 0;
        for (int i = 1 ; i<=100; i++){
//            System.out.print("Enter number..:");
            int num1 = scanner.nextInt();
            if (num1 % 7 == 0){
                System.out.println("You won 7 points");
                points = points + 7;
                continue;
            }
            else if (num1 % 5 == 0){
                System.out.println("You won 5 points");
                points = points + 5;
                continue;
            }
            else if (num1 == 6 ){
                System.out.println("You won 100m Lottery");
                break;
            }
            System.out.println("Your total points..:" + points);
        }


    }
}
