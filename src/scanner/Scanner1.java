package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input string: ");
        String str = scanner.nextLine(); //입력을 string 으로 가져온다
        System.out.println("str = " + str);

        System.out.print("input int: ");
        int intValue = scanner.nextInt(); //입력을 string 으로 가져온다
        System.out.println("intValue = " + intValue);

        System.out.println("input double");
        double doubleValue = scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);

    }
}
