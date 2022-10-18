class Calculator {
    static int[] result;
    static int pos = 0;

    public Calculator() {
        result = new int[10];
    }

    public Calculator(int size) {
        result = new int[size];
    }

    public static int[] Add(int[] originArray, int Val) {
        int[] newArray = new int[originArray.length + 1];
        for(int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }
        newArray[originArray.length] = Val;
        return newArray;
    }

    public static void prevResult() {
        if(pos == 0) {
            System.out.println("저장된 결과값이 없습니다.");
        } else {
            System.out.print("저장된 결과값 : ");
            for(int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
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
        result[pos] = answer;
        pos += 1;
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
        result[pos] = answer;
        pos += 1;
        return answer;
    }
}

public class test {
    public static void main(String[] args) {
        Calculator calc = new Calculator(3);
        calc.prevResult();
        System.out.println("5 + 7 = " + calc.exec(5, 7, '+'));
        calc.exec(5, 3, '-');
        calc.exec(9, 3, '/');
        calc.prevResult();
        calc.exec(10,5, '*');
        calc.prevResult();

    }
}
