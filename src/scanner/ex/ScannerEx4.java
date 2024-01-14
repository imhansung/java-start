package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("gugudan: ");
        int gugudan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(gugudan + " x " + i + " = " + gugudan*i);

        }
    }
}
