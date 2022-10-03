package meeting;

import java.util.ArrayList;

// 시현 코테(2022.10.03)
public class meeting2_3 {
    public static ArrayList<Integer> solution(int[] data) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(Integer item : data) {
            if(!answer.contains(item)) {
                answer.add(item);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] input = {10, 5, 6, 7, 10, 2, 5, 8};

        System.out.println(solution(input));
    }
}
