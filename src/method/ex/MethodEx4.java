package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("입금액: ");
                balance += scanner.nextInt();
                scanner.nextLine();
                continue;
            } else if (option == 2) {
                System.out.print("출금액: ");
                int withdraw = scanner.nextInt();
                scanner.nextLine();
                if (balance >= withdraw) {
                    balance -= withdraw;
                }else {
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }

            } else if (option == 3) {
                System.out.println("잔액: " + balance);
                continue;

            } else if (option == 4) {
                System.out.println("종료합니다");
                break;
            }else {
                System.out.println("다시 선택해주세요");
                continue;
            }
        }
    }
}
