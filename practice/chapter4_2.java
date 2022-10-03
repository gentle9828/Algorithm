package practice;

import java.io.*;

public class chapter4_2 {
    public static boolean check(int h, int m, int s) {
        if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int hour = Integer.parseInt(str);
        int cnt = 0;

        for(int i = 0; i <= hour; i++) {
            for(int j = 0; j < 60; j++) {
                for(int k = 0; k < 60; k++) {
                    if(check(i, j, k)) {
                        cnt++;
                    }

                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();

        bw.close();
        br.close();
    }

}
