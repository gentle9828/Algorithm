package Advanced_Programming.Week3;

public class Ex_5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // int x = 7;
        // int roundoff = x >= 5 ? 10 : 0;
        // System.out.println("b의 반올림 값은? " + roundoff);

        int x = 7;
        int roundoff;
        if(x >= 5) {
            roundoff = 10;
        } else {
            roundoff = 0;
        }
        System.out.println("b의 반올림 값은? " + roundoff);
    }
}
