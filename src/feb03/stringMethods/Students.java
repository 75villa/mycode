package feb03.stringMethods;

public class Students {
    int roll;
    String name;

    @Override
    public String toString() {
        return "Students{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
