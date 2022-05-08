import java.io.*;

public class Subject {
    private
        int subjectCode;
        String subjectName;
        double x;
        double y;

    Subject(){

    }

    Subject(int subjectCode, String subjectName, double x, double y){
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.x = x;
        this.y = y;
    }

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
