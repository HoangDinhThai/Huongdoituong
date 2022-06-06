public class student {
    public int StudentCode;
    public String name;
    public double GPA;

    public student() {

    }

    public student(int StudentCode, String name, double GPA) {
        this.StudentCode = StudentCode;
        this.name = name;
        this.GPA = GPA;
    }

    public int getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(int StudentCode) {
        this.StudentCode = StudentCode;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String toString() {
        return name;
    }
}
