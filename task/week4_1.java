package task;

public class week4_1 {
    public static void main(String[] args) {
        int[][] number = new int[3][3];

        // 배열 초기화
        for(int i = 0; i < number[0].length; i++) {
            number[0][i] = (int) Math.pow(2, i+1);
        }

        for(int i = 0; i < number[1].length; i++) {
            number[1][i] = (int) Math.pow(3, i+1);
        }

        for(int i = 0; i < number[2].length; i++) {
            number[2][i] = (int) Math.pow(4, i+1);
        }

        // 출력
        for(int i = 0; i < number.length; i++) {
            for(int j = 0; j < number[i].length; j++) {
                System.out.printf("%d ", number[i][j]);
            }
            System.out.println();
        }


    }
}
