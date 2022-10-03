package meeting;

import java.io.*;

// 시현 코테(2022.10.03)
public class meeting2_1 {
    public static int cnt = 0;
    public static int solution(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            if(i == 0) {
                if((data[0][1] / data[0][0]) > 60) {
                    cnt += 1;
                }
            } else if(((data[i][1] - data[i - 1][1]) / (data[i][0] - data[i - 1][0])) > 60) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] result = {{1, 60}, {3, 180}, {5, 350}, {8, 470}, {11, 700}};
        bw.write(String.valueOf(solution(result)));
        bw.flush();

        bw.close();
        br.close();
    }
}
