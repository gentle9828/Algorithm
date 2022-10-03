package practice;

public class chapter3_1 {
    public static void main(String[] args) {
        int money = 1260; // 주어지는 금액
        int cnt = 0; // 최종적인 동전 개수

        int[] coins = {500, 100, 50, 10}; // 동전의 종류

        for(int i = 0; i < coins.length; i++) {
            cnt += money / coins[i];
            money %= coins[i];
        }

        System.out.println(cnt);

    }
}
