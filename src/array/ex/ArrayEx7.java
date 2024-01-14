package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("student number: ");

        int row = scanner.nextInt();
        int column = 3;
        int[][] scores= new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};


        for (int i = 0; i < 4; i++) {
            System.out.println("student "+ i);
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] +": ");
                scores[i][j] = scanner.nextInt();
            }

        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            double average = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            average = (double) total/3.0;
            System.out.println("average = " + average);
            System.out.println("sum = " + total);
        }
    }
}
