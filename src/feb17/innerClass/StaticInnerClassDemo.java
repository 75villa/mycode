package feb17.innerClass;

public class StaticInnerClassDemo {

    static class InnerDemo {

        public void test() {
            System.out.println(" static inner demo class test method");
        }
    }

    public static void main(String[] args) {
        StaticInnerClassDemo.InnerDemo obj = new StaticInnerClassDemo.InnerDemo();
        obj.test();
    }
}
