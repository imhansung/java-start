package method;

public class Overloading3 {
    public static void main(String[] args) {

        System.out.println("1: "+ add(1,2));
        System.out.println("2: "+ add(1.2, 2.2));

        /*본인 타입에 맞는 메서드를 찾아서 실행하고 없으면 형 변환 가능한 메서드를 찾아 실행한다.*/
    }

    /*public static int add(int a, int b) {
        System.out.println("call number 1");
        return a+ b;

    }*/

    public static double add(double a, double b) {
        System.out.println("call 2");
        return a+ b;
    }
}
