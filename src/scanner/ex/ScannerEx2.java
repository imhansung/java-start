package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input num1: ");
        int num1 = scanner.nextInt();

        if(num1 % 2 == 0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }

    }
}
