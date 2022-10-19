package Advanced_Programming.Week3;

public class Ex_7 {
    public static void main(String[] args) {
        // 중첩 if 문
        int math = 95;
        if(math >= 90) {
            // A 등급
            if(math >= 97) {
                System.out.println("A+ 등급");
            } else if(math >= 94) {
                System.out.println("A0 등급");
            } else {
                System.out.println("A- 등급");
            }
        } // ... B 등급도 동일

        // switch 문
        int cardKey = 2;
        boolean b201_chairman = false, b201 = false, bfront_gate = false;

        switch(cardKey) {
            case 3 -> b201_chairman = true;
            case 2 -> b201 = true;
            case 1 -> bfront_gate = true;
            default -> bfront_gate = true;
        }

        System.out.println("정문 입장 권한 : " + bfront_gate);
        System.out.println("201호 입장 권한 : " + b201);
        System.out.println("201호 사장실 입장 권한 : " + b201_chairman);
    }
}
