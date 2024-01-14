package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input count: ");
//        int count = scanner.nextInt();

        int[] arr = new int[scanner.nextInt()];
        int sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("input num: ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        average = (double) sum / arr.length;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
