package feb13.learnabstract;

public class AIPhone extends SmartPhone {

    public void generateImages() {
        System.out.println("generate Image from AIPhone class");
    }

    @Override
    public void cordlessFeature() {
        System.out.println("msg from cordless feature from mobile class");

    }

    @Override
    public void call() {
        System.out.println("msg from call feature from phone class");
    }

    @Override
    public void internetFeature() {
        System.out.println("msg from internet feature from smartphone class");
    }


    public void text() {
        System.out.println("This msg from text method in AIPhone class");
    }

}

