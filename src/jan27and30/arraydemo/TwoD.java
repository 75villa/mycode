package jan27and30.arraydemo;

public class TwoD {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];

        arr[0][0] = 11;
        arr[0][1] = 22;
        arr[1][0] = 33;
        arr[1][1] = 44;
        arr[2][0] = 55;
        arr[2][1] = 66;

        for (int[] element : arr) {
            for (int numbers : element) {
                System.out.println(numbers);
            }
        }

    }
}
