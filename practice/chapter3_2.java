package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class chapter3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] cond = br.readLine().split(" ");
        String[] number = br.readLine().split(" ");

        int N = Integer.parseInt(cond[0]); // 배열의 크기
        int M = Integer.parseInt(cond[1]); // 숫자가 더해지는 횟수
        int K = Integer.parseInt(cond[2]); // 한 숫자가 최대로 더해질 수 있는 횟수

        int solution = 0; // 결과값

        Arrays.sort(number);
        int first = Integer.parseInt(number[N-1]); // 가장 큰 수
        int second = Integer.parseInt(number[N-2]); // 두번째로 큰 수

        boolean flag = true;

        while(flag) {
            for(int i = 0; i < K; i++) {
                if(M == 0) {
                    break;
                }
                solution += first;
                M -= 1;
            }
            if(M == 0) {
                break;
            }
            solution += second;
            M -= 1;
        }

        bw.write(String.valueOf(solution));
        bw.flush();
    }

}
