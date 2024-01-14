package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while(true){
            System.out.println("1: buy, 2: checkout, 3: exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("product: ");
                String product = scanner.nextLine();

                System.out.print("price: ");
                int price = scanner.nextInt();

                System.out.print("quantity: ");
                int quantity = scanner.nextInt();

                total += price * quantity;
            } else if (option == 2) {
                System.out.println("total: " + total);
                total = 0;

            } else if (option == 3) {
                System.out.println("exit");
                break;

            }else{
                System.out.println("wrong option");
            }
        }

    }
}
