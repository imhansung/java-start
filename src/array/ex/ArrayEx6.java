package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input count: ");
        int count = scanner.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("input num: ");
            arr[i] = scanner.nextInt();

        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
