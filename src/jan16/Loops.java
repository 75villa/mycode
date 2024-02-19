package jan16;

public class Loops {
    public static void main(String[] args) {

        int cnt = 1;
        int sum = 0;
        while(cnt <=100){
            System.out.println(cnt);
            sum = sum+cnt;
            if (cnt <=20) {
                System.out.println(sum);
            }
            cnt++;
        }
    }
}
