package feb17.innerClass;

public class OuterInnerClass {

    public void outerClassMethod() {
        System.out.println("msg from Outer Class Method");
    }

    class InnerClass {

        public void innerClassMethod() {
            System.out.println("msg from inner class method");
        }

    }

    public static void main(String[] args) {
        OuterInnerClass outer = new OuterInnerClass();
        outer.outerClassMethod();

        OuterInnerClass.InnerClass innerClass = outer.new InnerClass();

        innerClass.innerClassMethod();
    }

}