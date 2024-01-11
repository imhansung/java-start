package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int max value
        long maxIntOver = 2147483649L; // int max value + 1

        int intValue = 0;
        intValue = (int) maxIntValue;
        System.out.println("intValue = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("intValue = " + intValue);
        // It looks like go to circle;
    }
}
