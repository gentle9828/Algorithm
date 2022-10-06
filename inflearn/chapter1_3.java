package inflearn;

import java.io.*;
import java.util.ArrayList;

public class chapter1_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        String result = "";

        result = str[0];
        for(int i = 0; i < str.length; i++) {
            if(result.length() < str[i].length()) {
                result = str[i];
            }
        }

        bw.write(result);
        bw.flush();

        bw.close();
        br.close();
    }
}
