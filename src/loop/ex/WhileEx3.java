package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        //1부터 max까지의 합을 계산, sum에 누적합 표현

        int max = 100;
        int sum = 0;
        int i = 1;
        while (i<=max){
            sum = sum + i;
            i++;
        }

        System.out.println(sum);

        max = 100;
        sum = 0;
        i = 1;
        for (int j = 1; j <= max; j++) {
            sum = sum + j;

        }
        System.out.println("sum = " + sum);
    }





}
