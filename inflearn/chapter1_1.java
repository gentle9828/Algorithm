package inflearn;

import java.io.*;

public class chapter1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String find = br.readLine();

        String search = str.toLowerCase();
        int result = 0;

        for(int i = 0; i < search.length(); i++) {
            if(search.charAt(i) == find.charAt(0)) {
                result ++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();

        bw.close();
        br.close();
    }

}
