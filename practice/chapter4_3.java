package practice;

import java.io.*;

public class chapter4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int row = str.charAt(1) - '0';
        int column = str.charAt(0) - 'a' + 1;

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int result = 0;

        for(int i = 0; i < 8; i++) {
            int nx = row + dx[i];
            int ny = column + dy[i];

            if(nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8) {
                result += 1;
            }
        }


        bw.write(String.valueOf(result));
        bw.flush();

        bw.close();
        br.close();

    }
}
