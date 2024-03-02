package feb03.stringMethods;

public class StringReverse {
    public static void main(String[] args) {

        String s1 = "Pragra";
        String newstr = "";
        String concat = s1.concat(" Inc.");
        System.out.println(concat);

        int count = concat.length();
        System.out.println(count);

        for (int i = count - 1; i >= 0; i--) {
            newstr += concat.charAt(i);
        }
        System.out.println(newstr);
//        char[] newchar = concat.toCharArray();
//
//        for (char revnm : newchar) {
//            System.out.println(revnm);
//        }

        //System.out.println(s1);
    }
}
