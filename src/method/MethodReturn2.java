package method;

public class MethodReturn2 {
    public static void main(String[] args) {

        checkAge(18);

    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age+ "살, 미성년자는 출입 불가");
            return;
        }
        System.out.println(age + "살, 입장하세요");
    }
}
