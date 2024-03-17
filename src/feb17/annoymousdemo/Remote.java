package feb17.annoymousdemo;

public interface Remote {

    void click();
}

class Main {

    public static void main(String[] args) {

        Remote remote = new Remote() {
            @Override
            public void click() {
                System.out.println("Remote.........");
            }
        };

        remote.click();
    }
}