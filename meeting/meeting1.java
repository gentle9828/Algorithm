package meeting;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

// 2022.09.26
public class meeting1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int N = Integer.parseInt(str);


        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        long result = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] - i <= 0) {
                break;
            }

            result += arr[i] - i;
        }

        bw.write(String.valueOf(result));
        bw.flush();

        bw.close();
        br.close();

    }
}
