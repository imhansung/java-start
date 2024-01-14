package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("price: ");
            int price = input.nextInt();

            if (price == -1) {
                System.out.println("exit");
                break;
            }

            System.out.print("quantity: ");
            int quantity = input.nextInt();

            System.out.println("total : "+ price*quantity);
        }
    }
}
