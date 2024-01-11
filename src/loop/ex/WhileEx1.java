package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;
        while(count<11){
            System.out.println("count = " + count);
            count++;
        }

        count = 0;
        for (int i = 0; i < 10; i++) {
            count ++;
            System.out.println("count = " + count);


        }
    }
}
