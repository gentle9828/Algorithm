package task;

class Cal{
    static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    static double divide(int a, int b) {
        double result = (double) a / b;
        return result;
    }
}
public class week5_1 {
    public static void main(String[] args) {
        Cal c1 = new Cal();
        int a = 7;
        int b = 5;
        System.out.println(c1.add(a, b));
        System.out.println(c1.minus(a, b));
        System.out.println(c1.multiply(a, b));
        System.out.println(c1.divide(a, b));
    }

}
