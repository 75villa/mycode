package feb03.stringMethods;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdedcba";
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            System.out.println(str.charAt(i) + "---" + str.charAt(j));
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Noa Palindrome.......!");
                System.exit(0);
            }
            i++;
            j--;

        }
        System.out.println("Palindrome..........");
    }
}
