public class Stackstudent {
    private int size;
    private student[] students;
    private int top;

    public Stackstudent(int size) {
        students = new student[size];
        top++;
    }

    public void push(student a) {
        students[top++] = a;
    }

    public student pop() {
        return students[top--];
    }

    public student peek() {
        return students[top];
    }
}
