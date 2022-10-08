package task;

import java.util.ArrayList;

class Calculator {
    static ArrayList<Integer> result = new ArrayList<>(10);

    static int pos;

    public Calculator(int size) {
        ArrayList<Integer> result = new ArrayList<>(size);
    }

    public static void prevResult() {
        if(result.size() == 0) {
            System.out.println("저장된 결과값이 없습니다.");
        } else {
            System.out.print("저장된 결과값 : ");
            for(int pos = 0; pos < result.size(); pos++) {
                System.out.print(result.get(pos) + " ");
            }
            System.out.println();
        }
    }

    public static int exec(int firstNumber, int secondNumber, char operator) {
        int answer = 0;
        switch(operator) {
            case '+' -> answer = firstNumber + secondNumber;
            case '-' -> answer = firstNumber - secondNumber;
            case '*' -> answer = firstNumber * secondNumber;
            case '/' -> answer = firstNumber / secondNumber;
        }
        result.add(answer);
        return answer;
    }

    public static int exec(int firstNumber, int secondNumber, String operator) {
        int answer = 0;
        switch(operator) {
            case "+" -> answer = firstNumber + secondNumber;
            case "-" -> answer = firstNumber - secondNumber;
            case "*" -> answer = firstNumber * secondNumber;
            case "/" -> answer = firstNumber / secondNumber;
        }
        result.add(answer);
        return answer;
    }
}

public class week5_2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator(3);
        calc.prevResult();
        System.out.println("5 + 7 = " + calc.exec(5, 7, '+'));
        System.out.println("5 + 7 = " + calc.exec(5, 7, "+"));
        calc.exec(5, 3, '-');
        calc.exec(9, 3, '/');
        calc.prevResult();
        calc.exec(10,5, '*');
        calc.prevResult();

    }
}
