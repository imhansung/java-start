package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while (true) {
            System.out.print("1.상품등록 | 2.상품목록 | 3.종료\n메뉴를 선택하세요: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                if (productCount >= maxProducts) {
                    System.out.println("더이상 등록할 수 없습니다");
                    continue;
                }
                System.out.print("input product name: ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("input product price: ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (option == 2) {
                if(productCount == 0){
                    System.out.println("등록된 상품이 없습니다");
                    continue;
                }
                for (int j = 0; j < productCount; j++) {
                    System.out.println(productNames[j]+ ": " + productPrices[j]+ " won");

                }

            } else if (option == 3) {
                break;

            }else {
                System.out.println("wrong input");
            }
        }
    }
}
