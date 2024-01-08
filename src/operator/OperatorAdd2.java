package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; //a 먼저 증가시키고 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        //후위
        a = 1;
        b = 0;

        b = a++;
        System.out.println("a = " + a + ", b = " + b);
        //a를 먼저 b에 넣고 그 후 a 값을 증가시킴
    }
}
