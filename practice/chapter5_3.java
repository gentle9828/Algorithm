package practice;

public class chapter5_3 {
    public static void recursiveFuction() {
        System.out.println("재귀 함수를 호출");
        recursiveFuction();
    }

    public static void main(String[] args) {
        recursiveFuction();
    }
}
