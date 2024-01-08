package variable.ex;

import java.util.Arrays;

public class VarEx3 {
    public static void main(String[] args) {
        long a;
        a = 10000000000L;
        System.out.println(a);
        System.out.println("a = " + a);

        System.out.println("VarEx3.main");
        System.out.println("args = " + Arrays.toString(args));

        boolean b = true;

        System.out.println(b);
    }
}
