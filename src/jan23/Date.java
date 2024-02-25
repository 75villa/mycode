package jan23;

public class Date {
    int day;
    int month;
    int year;

    // default constructor
    public Date() {
        day = 23;
        month = 01;
        year = 2024;
    }

    // parameterized constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public void printDate() {
        System.out.println("Date..:" + day + " / " + month + " / " + year);
    }
}
