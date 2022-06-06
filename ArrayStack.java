class ArrayStack implements interfaceStack {
    int st[];
    public int top;

    ArrayStack(int size) {
        st = new int[size];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        if (top < 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (top == st.length - 1)
            return true;
        else
            return false;
    }

    public void push(int item) {
        if (top == st.length - 1)
            System.out.println("Stack da day!");
        else
            st[++top] = item;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack rong!");
            return 0;
        } else
            return st[top--];
    }

    public int top() {
        if (top < 0) {
            System.out.println("Stack rong!");
            return 0;
        } else
            return st[top];
    }
}
