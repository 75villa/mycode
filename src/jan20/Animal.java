package jan20;

public class Animal {
    //data member
    //member variables
    String color;

    //member functions
    // Methods
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void run() {
        System.out.println("Animal is running");
    }
}

class AnimalMain {
    public static void main(String[] args) {
        // className   Reference     init memory    constructor
        Animal dog = new Animal();
        dog.run();
        dog.eat();
        dog.sleep();

    }
}
