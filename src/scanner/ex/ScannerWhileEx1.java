package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("name(exit): ");
            String name = scanner.nextLine();

            if(name.equals("exit")){
                System.out.println("exit");
                break;
            }

            System.out.print("age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            /*입력시 10 엔터 를 누르면
            10\n이 입력되는데
            * nextInt 는 10까지만 가져가고 \n은 남는다
            그래서 nextLine에서 \n을 읽어버린다
            해결은 라인을 한번 읽어서 버린다.
            */

            System.out.println("name : " + name + " age : "+ age);

        }


    }
}
