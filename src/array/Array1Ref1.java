package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students;// 배열 변수 선언
        students = new int[5];//길이가 5인 배열

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;


        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        System.out.println("student0 = " + students[0]);
        System.out.println("student1 = " + students[1]);
        System.out.println("student2 = " + students[2]);
        System.out.println("student3 = " + students[3]);
        System.out.println("student4 = " + students[4]);

        //변수명은 어떻게 반복문으로 할 수 있는게 아니다


    }
}
