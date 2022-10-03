package inflearn;

import java.io.*;

public class chapter1_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        String result = "";

        for(int i = 0; i < str.length; i++) {
            result = str[0];
            if(result.length() < str[i].length()) {
                result = str[i];
            }

            if(str[i].length() == result.length()) {
                result = str[i];
            }
        }

        bw.write(result);
        bw.flush();

        bw.close();
        br.close();

    }
}
