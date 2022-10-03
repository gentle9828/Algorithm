package practice;

import java.io.*;

public class chapter3_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        int result = 0;

        while(N != 1) {
            if (N % K == 0) {
                N /= K;
                result++;
            } else {
                N -= 1;
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();

        bw.close();
        br.close();

    }
}
