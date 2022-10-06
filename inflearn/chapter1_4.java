package inflearn;

import java.io.*;

public class chapter1_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        String[] answer = new String[N];
        for(int i = 0; i < N; i++) {
            answer[i] = br.readLine();
        }
        for(String x : answer) {
            String tmp = new StringBuilder(x).reverse().toString();
            bw.write(tmp + "\n");

        }

        bw.close();
        br.close();

    }
}
