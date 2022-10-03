package practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class charSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        ArrayList<Character> result = new ArrayList<Character>();
        int value = 0;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                result.add(str.charAt(i));
            } else {
                value += str.charAt(i) - '0';
            }
        }

        Collections.sort(result);

        for(int j = 0; j < result.size(); j++) {
            bw.write(result.get(j));
        }

        bw.write(String.valueOf(value));
        bw.flush();
        bw.close();
        br.close();


    }
}
