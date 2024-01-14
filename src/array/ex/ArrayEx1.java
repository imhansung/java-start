package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        double[] arr = {90, 80, 70, 60, 50};

        double total = 0;
        for (double i : arr) {
            total += i;

        }
        double average = total/arr.length;
        System.out.println("total = " + total);
        System.out.println("average = " + average);

    }
}
