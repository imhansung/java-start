package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        while(num<=10){
            if(num%2==0){
                System.out.println("num = " + num);
            }
            num++;
        }

        /*for (int num1 = 2, count = 1; count <= 10; num1+=2, count++) {
            System.out.println("num1 = " + num1);

        }*/

        int num1 = 2;
        for (int count = 0; count < 10; count++) {
            System.out.println("num1 = " + num1);
            num1 +=2 ;
        }
    }
}