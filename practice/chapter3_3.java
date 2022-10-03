package practice;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class chapter3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 카드 행
        int M = Integer.parseInt(st.nextToken()); // 카드 열

        int min = 0;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            int[] arr = new int[M];
            for(int j = 0; j < M; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            if(i == 0) {
                min = arr[i];
            }
            if(min < arr[0]) {
                min = arr[0];
            }

        }

        bw.write(min + " ");
        bw.flush();

        br.close();
        bw.close();



    }
}
