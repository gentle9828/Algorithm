package basic;

import java.io.*;
import java.util.ArrayList;

public class mergeSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] array = br.readLine().split(" ");
        ArrayList<Integer> input = new ArrayList<>();

        int n = Integer.parseInt(str);
        for(int i = 0; i < array.length; i++) {
            input.add(Integer.parseInt(array[i]));
        }

        if(n <= 1) {
            return ;
        }

        int mid = (int)n / 2;

        // 수업 끝나고 ㄱ





    }
}
