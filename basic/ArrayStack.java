package basic;

public class ArrayStack implements Stack {
        private int top;
        private int stackSize;
        private int stackArr[];

        public ArrayStack(int stackSize) {
            top = -1; // 스택 포인터 초기화
            this.stackSize = stackSize; // 스택 사이즈 설정
            stackArr = new int[this.stackSize]; // 스택 배열 생성
        }

        @Override
        // 스택이 비어있는 상태인지 확인
        public boolean isEmpty() {
            // 스택 포인터가 -1인 경우 데이터가 없는 상태이므로 true 아닌 경우 false를 return
            return (top == -1);
        }

        public boolean isFull() {
            // 스택 포인터가 스택의 마지막 인덱스와 동일한 경우 true 아닌 경우 false를 return
            return (top == this.stackSize - 1);
        }

        @Override
        // 스택에 데이터를 추가
        public void push(int item) {
            if(isFull()) {
                System.out.println("Stack is full");
            } else {
                stackArr[++top] = item; // 다음 스택 포인터가 가리키는 인덱스에 데이터 추가
                System.out.println("Inserted Item : " + item);
            }
        }

        @Override
        public int pop() {
            if(isEmpty()) {
                System.out.println("Deleting fail! Stack is empty!");
                return 0;
            } else {
                System.out.println("Deleted Item : " + stackArr[top]);
                return stackArr[top--];
            }
        }

        @Override
        public int peek() {
            if(isEmpty()) {
                System.out.println("Peeking fail! Stack is empty");
                return 0;
            } else {
                System.out.println("Peeked Item : " + stackArr[top]);
                return stackArr[top];
            }
        }

        @Override
        public void clear() {
            if(isEmpty()) {
                System.out.println("Stack is already empty!");
            } else {
                top = -1;
                stackArr = new int[this.stackSize]; // 새로운 스택 배열 생성
                System.out.println("Stack is clear!");
            }
        }

        public void printStack() {
            if(isEmpty()) {
                System.out.println("Stack is empty!");
            } else {
                System.out.println("Stack elements : ");
                for(int i = 0; i <= top; i++) {
                    System.out.print(stackArr[i] + " ");
                }
                System.out.println();
            }
        }


        public static void main(String[] args) {
            int stackSize = 5;
            basic.ArrayStack arrayStack = new basic.ArrayStack(stackSize);

            arrayStack.push(1);
            arrayStack.push(2);
            arrayStack.push(3);
            arrayStack.push(4);
            arrayStack.push(5);
            arrayStack.printStack();

        }
}

