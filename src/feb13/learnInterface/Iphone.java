package feb13.learnInterface;

public class Iphone implements MusicPlayer, Camera, Calculator {


    @Override
    public void calculator() {
        System.out.println("Calculator");
    }

    @Override
    public void camera() {
        System.out.println("Camara");
    }

    @Override
    public void playMusic() {
        System.out.println("play music");
    }
}
