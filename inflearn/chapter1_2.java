package inflearn;

import java.io.*;

public class chapter1_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        String result = "";

        for(char x : str.toCharArray()) {
            if(Character.isUpperCase(x)) {
                result += Character.toLowerCase(x);
            } else {
                result += Character.toUpperCase(x);
            }
        }

        bw.write(result);
        bw.flush();

        bw.close();
        br.close();
    }
}
