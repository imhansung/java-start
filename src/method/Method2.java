package method;

public class Method2 {
    public static void main(String[] args) {

        printHeader();

        printFooter();
    }

    public static void printHeader() {
        System.out.println("start program");
        return;//void의 경우 생략 가능
    }

    public static void printFooter() {
        System.out.println("end program");
    }
}
