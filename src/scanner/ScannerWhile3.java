package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while(true){
            System.out.print("input num : ");
            int num1 = scanner.nextInt();
            if(num1 == 0){
                System.out.println("exit program");
                break;
            }
            sum = sum + num1;

        }
        System.out.println("sum = " + sum);
    }
}
