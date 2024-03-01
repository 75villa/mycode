package jan27and30.arraydemo;

public class Test {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 25;
        arr[3] = 35;
        arr[4] = 45;
        for (int j = 0; j < arr.length; j++) {

            System.out.println(arr[j]);

        }


        int[] num = {10, 20, 30, 40, 50, 60, 70};

//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);
        System.out.println(num.length);


        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);

        }

    }
}
