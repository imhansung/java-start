package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students;// 배열 변수 선언
        students = new int[5];//길이가 5인 배열



        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("student "+ (i + 1) + " score: " + students[i]);
        }

/*        System.out.println("student0 = " + students[0]);
        System.out.println("student1 = " + students[1]);
        System.out.println("student2 = " + students[2]);
        System.out.println("student3 = " + students[3]);
        System.out.println("student4 = " + students[4]);*/

        //변수명은 어떻게 반복문으로 할 수 있는게 아니다

        /*리팩토링은 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고,
        유지보수를 용이하게 하는 과정을 뜻한다.*/


    }
}
