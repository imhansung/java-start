package scanner.ex;


import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int num2 = 0;
/*        while (true) {
            System.out.print("input num: ");
            int num = input.nextInt();
            if (num == -1) {
                System.out.println("exit");
                break;
            }
            System.out.println("num = " + num);
            sum += num;
            count++;

        }*/

        while ((num2 = input.nextInt()) != -1) {

            System.out.print("input num");
            //do while 써야함? 뭐임?

        }
        System.out.println("sum = " + sum);
        double average = (double) sum / (double) count;
        System.out.println("average = " + average);



    }
}
