package feb06;

public class AccessModifiers {

    private int rollno;

    public void show() {
        System.out.println("Show details");
    }
}

class Test {
    public static void main(String[] args) {

        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.show();
    }

}
