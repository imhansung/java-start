package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "hello, world";

       far(3,message);

    }

    public static void far(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);

        }
    }
}
