import java.io.*;

public class Student implements Serializable{

    private
        int studentCode;
        String name;
        int n;
    Student(){

    }
    
    Student(int studentCode, String name, int n){
        this.studentCode = studentCode;
        this.name = name;
        this.n = n;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setN(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }

}
