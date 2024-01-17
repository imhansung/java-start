package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
       int a = 1;
       int b = 2;
       int c = 3;
       double d = avg(a,b,c);
       double e =avg(15,20,30);
        System.out.println(d);
        System.out.println(e);

    }

    public static double avg(int a, int b, int c){
        double avg = (a + b + c )/3.0;
                return avg;
    }
}
