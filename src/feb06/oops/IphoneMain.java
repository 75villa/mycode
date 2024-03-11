package feb06.oops;

class Iphone14 {
    int size;
    String color;
    int ram;

    Iphone14() {
    }

    public Iphone14(int size, String color, int ram) {
        this.size = size;
        this.color = color;
        this.ram = ram;
    }

    public void showSpec() {
        System.out.println(size);
        System.out.println(color);
        System.out.println(ram);
    }
}

class Iphone15 extends Iphone14 {
    public void showNewSpec() {
        System.out.println(size);
        System.out.println(color);
        System.out.println(ram);
    }
}

public class IphoneMain {
    public static void main(String[] args) {
        Iphone15 iphone15 = new Iphone15();
        iphone15.showNewSpec();
    }
}