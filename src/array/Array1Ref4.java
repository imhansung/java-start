package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50, 40,70};// 라인을 나누면 안된다. 선언과 동시에만 가능


        for (int i = 0; i < students.length; i++) {
            System.out.println("student "+ (i + 1) + " score: " + students[i]);
        }


        /*리팩토링은 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고,
        유지보수를 용이하게 하는 과정을 뜻한다.*/


    }
}
