package feb03.stringMethods;

public class MutableStringExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Manish");
        sb.append(" Mehta");

        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());

        // String   vs StringBuffer
        // immutable    Mutable

        StringBuilder sb1 = new StringBuilder("Remote");
        sb1.append(" Control");
        System.out.println(sb1);
        // StringBuffer      vs       StringBuilder
        // Thread safe                not thread safe
        // Synchronized                 not Synchronized

        // String       =  thread safe , immutable
        // StringBuffer = thread safe , mutable
        // StringBuilder = not thread safe , mutable
    }
}
