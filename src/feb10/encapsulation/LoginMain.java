package feb10.encapsulation;

public class LoginMain {
    public static void main(String[] args) {

        LogIn logIn = new LogIn("Manish", "Manish123");

        // user entered correct value and will get msg that user is authorized
        //logIn.login("Manish", "Manish123");

        // hacker
//        logIn.userName = "hacker";
//        logIn.password = "hacker";

        String userName = logIn.getUserName();
        System.out.println("This is your user name...:" + userName);
        logIn.setPassword("MyPassword");
        logIn.login("Manish", "Manish123");

        // logIn.login("hacker", "hacker");

    }
}
