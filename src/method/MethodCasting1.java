package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;

        //printNumber(number); //컴파일오류 타입이 달라서.
        printNumber(1);
    }

    public static void printNumber(int n) {
        System.out.println("nummber : "+ n);
    }
}
