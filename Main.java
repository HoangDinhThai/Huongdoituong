public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");

        System.out.println("Array:");
        ArrayStack St1 = new ArrayStack(100);
        int[] St1_nguoc = new int[100];
        for (int i = 0; i < 10; i++)
            St1.push(i);
        int n = St1.top + 1;
        for (int i = 0; i < n; i++) {
            St1_nguoc[i] = St1.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(St1_nguoc[i] + " ");
        }

        System.out.println();

        System.out.println("LinkedList: ");
        LinkedListStack St2 = new LinkedListStack(100);
        int[] St2_nguoc = new int[100];
        for (int i = 0; i < 10; i++)
            St2.push(i);
        n = St2.size() + 1;
        for (int i = 0; i < n; i++) {
            St2_nguoc[i] = St2.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(St2_nguoc[i] + " ");
        }
    }
}
