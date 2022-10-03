package meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// 시현 코테(2022.10.03)
public class meeting2_2 {
    public static void main(String[] args) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('a', 'a', 'a', 'b', 'b', 'a', 'a', 'a'));
        int cnt = 1;
        if(input.get(0) == input.get(input.size() - 1)) {
            for(int i = 0; i < input.size(); i++) {
                if(input.get(i) == input.get(input.size() - 1)) {
                    input.add(input.get(i));
                } else {
                    break;
                }
            }
        }

        System.out.println(input);
        for(int i = input.size() -1 ; i > 0; i--) {
            if(input.get(i) == input.get(i-1)) {
                cnt += 1;
            } else {
                answer.add(cnt);
                cnt = 1;
            }
        }


        answer.sort(Comparator.naturalOrder());
        System.out.println(answer);
    }

}
