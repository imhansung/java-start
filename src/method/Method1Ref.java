package method;

public class Method1Ref {
    public static void main(String[] args) {

        int sum1 = add(5, 10);
        System.out.println("sum1 = " + sum1);


        int sum2 = add(15, 20);
        System.out.println("sum2 = " + sum2);
    }

    public static int add(int a, int b) {
        System.out.println(a + "+"+b+"연산");
        int sum = a + b;

        return sum;
    }


}
