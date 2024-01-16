package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: "+ add(1, 2));
        System.out.println("2: "+ add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("call number 1");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("call number 2");
        return a + b + c;
    }
}
