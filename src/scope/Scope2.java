package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            //블록 내부
            System.out.println("m = " + m);
            System.out.println("i = " + i);

        }

        System.out.println("m"+m);
    }
}