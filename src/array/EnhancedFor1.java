package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number = " + number);

        }

        //향샹된 for, for-each
        for (int number : numbers) {
            System.out.println("number = " + number);
        }

        //iter 단축키 향상된 포문

        // for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number "+ i+ "="+ numbers[i]);
            //향상된 포문은 i가 없어서 못 쓴다.

        }


    }
}
