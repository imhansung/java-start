package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("input string, exit: exit: ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("exit program");
                break;

            }
            System.out.println("str = " + str);
        }




    }
}
