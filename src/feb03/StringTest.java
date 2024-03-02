package feb03;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "phone"; // String constant pool
        String s2 = "phone"; // scp
        String s3 = "phone"; // scp
        String s4 = new String("phone"); // normal object

        // == compares the literal and reference
        // .equals -- compare the literal value

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s4));
        System.out.println(s1 == s4);


    }
}
