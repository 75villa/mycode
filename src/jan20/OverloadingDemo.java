package jan20;

public class OverloadingDemo {

    public int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        OverloadingDemo old = new OverloadingDemo();
        int new1 = old.sum(10, 20);
        int new2 = old.sum(20, 30, 40);
        int new3 = old.sum(50, 60, 70, 90);

        System.out.println(new1);
        System.out.println(new2);
        System.out.println(new3);
    }
}
