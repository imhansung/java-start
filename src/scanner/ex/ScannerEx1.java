package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input your name: ");
        String name = scanner.nextLine();

        System.out.print("input your age: ");
        int age = scanner.nextInt();

        System.out.println("Your name is "+name+ " and you're "+ age + " years old");
    }
}
