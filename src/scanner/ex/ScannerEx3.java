package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("food name: ");
        String foodName = input.nextLine();

        System.out.print("price: ");
        int foodPrice = input.nextInt();

        System.out.print("quantity: ");
        int foodQuantity = input.nextInt();

        System.out.println(foodName);
        System.out.println(foodPrice * foodQuantity);
    }
}
