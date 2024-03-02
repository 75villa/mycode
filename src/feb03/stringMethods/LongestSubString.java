package feb03.stringMethods;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

    public static void main(String[] args) {

        String str = "abcdefbcbb";
        int start = 0;
        int end = 0;
        int maxLength = 0;
        List<Character> List = new ArrayList<Character>();

        while (end < str.length()) {

            System.out.println(List.contains(str.charAt(end)));

            if (!List.contains(str.charAt(end))) {
                List.add(str.charAt(end));
                end++;
                maxLength = Math.max(maxLength, List.size());
            } else {
                List.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        System.out.println("Maximum length is..." + maxLength);
    }
}
