public class Stack implements interfaceStack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public void push(int j) {
        stackArray[++top] = j;
    }

    @Override
    public int pop() {
        return stackArray[top--];
    }

    @Override
    public int top() {
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == (maxSize - 1));
    }
}