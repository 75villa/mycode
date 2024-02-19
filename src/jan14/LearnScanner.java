package jan14;

import java.util.Locale;
import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the value of X :");
        int x = scanner.nextInt();
        System.out.println("Enter the value of Y :");
        int y = scanner.nextInt();
        System.out.println("Enter the day to purchase a ticket : ");
        String day = scanner.next();


        int sum = x+y;
        int div = x/y;
        int multi = x*y;

        System.out.println("Sum of the X and Y are :" + sum );
        System.out.println("Division of the X and Y are :" + div );
        System.out.println("Multiplication of the X and Y are :" + multi );

        if (x <12){
            System.out.println("Entered value/age of x is infant ");
        }
        else if (x >12 && x <=60){
            System.out.println("Entered value/age of x is Adult ");
        }
        else {
            System.out.println("Entered value/age of X is Senior");
        }

        if(x >=90){
            System.out.println("Entered mark is above 90 and students are in Grade A ");
        }
        else if (x>=80 && x<90){
            System.out.println("Entered mark is between 80 and 90 , So students are in Grade B ");
        }
        else if (x>=70 && x<80){
            System.out.println("Entered mark is between 70 and 80 , So students are in Grade C ");
        }
        else if (x>=60 && x<70){
            System.out.println("Entered mark is between 60 and 70 , So students are in Grade D ");
        }
        else {
            System.out.println("Entered mark is below 60 , So students are in Grade F ");
        }


        if (day.equalsIgnoreCase("saturday")){
            System.out.println("Ticket price for Saturday is $20");
        }
        else if (day.equalsIgnoreCase("sunday")){
            System.out.println("Ticket price for Saturday is $18");
        }
        else{
            System.out.println("Ticket price for Monday to Friday are $15");
        }
    }
}
