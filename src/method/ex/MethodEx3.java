package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {

    }

    public static int deposit(int balance, int deposit) {
        return balance + deposit;
    }

    public static int withdraw(int balance, int withdraw) {

        if (balance >= withdraw) {
            balance -= withdraw;

        }else{
            System.out.println("no janaek");
        }
        return balance;
    }
}
