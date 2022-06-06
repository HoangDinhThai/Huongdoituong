public class LinkedListStack implements interfaceStack {
    StackNode root;
    int maxSize = 0;
    int size = 0;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    LinkedListStack(int maxSize) {
        this.maxSize = maxSize;
    }

    //
    public int size() {
        return size;
    }

    public boolean isFull() {
        if (size == maxSize) {
            return true;
        } else
            return false;
    }

    //
    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
            size++;
        }
    }

    public int pop() {
        int popped = 0;
        if (root == null) {
            System.out.println("Stack rong !");
        } else {
            popped = root.data;
            root = root.next;
            size--;
        }
        return popped;
    }

    public int top() {
        if (root == null) {
            System.out.println("Stack rong");
            return 0;
        } else {
            return root.data;
        }
    }
}
