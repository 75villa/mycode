package feb03.stringMethods;

import java.util.Locale;

public class CountVowels {
    public static void main(String[] args) {

        String str = "My name is Manish";

        int cnt = 0;
        str = str.toLowerCase(Locale.ROOT);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt = cnt + 1;
            }
        }
        System.out.println("Total vowels are in your string are...:" + cnt);
    }
}
