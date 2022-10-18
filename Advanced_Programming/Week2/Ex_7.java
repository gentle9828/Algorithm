package Advanced_Programming.Week2;

public class Ex_7 {
    public static void main(String[] args) {
        // Boxing
        int year = 2021;
        double pi = 3.14;
        Integer obj_year = new Integer(year);

        // unboxing
        int year2 = obj_year.intValue();

        System.out.printf("언박싱 결과 : %d\n", year2);

        // Autoboxing
        obj_year = year; // 같은 타입이라서 가능.
        // obj_year = pi; // 다른 타입을 오토박싱 하려고 하면 에러 발생.

        short s = 40;
    }
}
