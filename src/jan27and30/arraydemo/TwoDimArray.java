package jan27and30.arraydemo;

public class TwoDimArray {

    public static void main(String[] args) {

//        int[] num = {12, 23, 45, 54, 324, 423, 433, 54};
//        System.out.println(num[0]);

        int[][] arr = new int[3][3];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;

        for (int[] element : arr) {
            for (int numbers : element) {
                System.out.println(numbers);
            }
        }

    }

}
