import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < array.size(); i++) {
            st = new StringTokenizer(br.readLine());
            array.add(Integer.parseInt(st.nextToken()));
        }


        System.out.println(array);
        for(int i = 0; i < array.size(); i++) {
            bw.write(array.get(i));
            bw.flush();
        }

        br.close();
        bw.close();
    }
}