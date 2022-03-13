import java.util.Scanner;
class point {
    private double x;
    private double y;
    point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public point() {
        x=0;
        y=0;
    }
    public void nhap(Scanner in){
            System.out.println("Nhap toa do x: ");
            x = in.nextDouble();
            System.out.println("Nhap toa do y: ");
            y = in.nextDouble();
    }

    public void xuat(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "x="+x+";y="+y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public double khoangCach(point a){
        return Math.sqrt((x-a.x)*(x-a.x) + (y-a.y)*(y-a.y));
    }

    public static int kiemTra(point a, point b, point c){
    if(a.khoangCach(b) + a.khoangCach(c) == b.khoangCach(c)){
        //System.out.println("\nBa diem thang hang theo thu tu b - a - c");
        return 1;
    }
    if(a.khoangCach(b) + b.khoangCach(c) == a.khoangCach(c)){
        //System.out.println("\nBa diem thang hang theo thu tu a - b - c");
        return 2;
    }
    if(a.khoangCach(c) + c.khoangCach(b) == a.khoangCach(b)){
        //System.out.println("\nBa diem thang hang theo thu tu a - c - b");
        return 3;
    }
    else{
       //System.out.println("\nBa diem khong thang hang");
       return 0;
    }
    }

    public static double chuVi(point a, point b, point c){
        return (a.khoangCach(b) + b.khoangCach(c) + c.khoangCach(a));
    }

    public static double dienTich(point a, point b, point c){
        return Math.sqrt(point.chuVi(a, b, c) * (point.chuVi(a, b, c)-a.khoangCach(b)) * (point.chuVi(a, b, c)-a.khoangCach(c)) * (point.chuVi(a, b, c)-b.khoangCach(c)));
    }
    
}

