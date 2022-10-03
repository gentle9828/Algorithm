package practice;

import java.io.*;

public class chapter4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] move = br.readLine().split(" ");

        int cnt = Integer.parseInt(str);

        int x = 1, y = 1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] types = {"L", "R", "U", "D"};
        int nx = 0;
        int ny = 0;

        for(int i = 0; i < move.length; i ++) {
            for(int j = 0; j < types.length; j++) {
                if(move[i].equals(types[j])) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
                if (nx < 1 || ny < 1 || nx > cnt || ny > cnt)
                    continue;

                x = nx;
                y = ny;
            }

        }

        bw.write(String.valueOf(x) + " " + String.valueOf(y));
        bw.flush();

        bw.close();
        br.close();
    }
}
