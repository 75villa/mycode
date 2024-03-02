package jan27and30.arraydemo;

import java.util.Scanner;

public class AlphaArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] ch = new char[6];
        System.out.println("Enter your Character...:");

        for (int i = 0; i < ch.length; i++) {
            ch[i] = scanner.next().charAt(0);
        }

        for (char e : ch) {
            System.out.print(e);
        }
    }

}
