import java.util.Scanner;
import java.lang.Math;

public class Complex{
    private double a;
    private double b;

    public Complex(){
        a = 0;
        b = 0;
    }

    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    // Ham nhap so phuc
    public void nhap(Scanner sc){
        System.out.println("Nhap vao phan thuc: ");
        a = sc.nextDouble();
        System.out.println("Nhap vao phan ao: ");
        b = sc.nextDouble();
    }

    // Ham hien thi so phuc

    public String toString(){
        String chuoi = " ";
        if (a != 0 || b != 0){
            if (b < 0) {
                chuoi += Double.toString(a) + " - " + Math.abs(b) + "*i";
            } else {
                chuoi += Double.toString(a) + " + " + Math.abs(b) + "*i";
            }
        }
        if(a == 0){
            chuoi += Double.toString(b) + "i";
        }
        else if (b == 0){
             chuoi += Double.toString(a);
        }

        return chuoi;
    }

    // Ham tinh modun
    public Double modun(){
        return (Math.sqrt((a * a) + (b * b)));
    }

    // Phuong thuc so sanh 2 so phuc bang nhau
    public void Compare(Complex sp){
        if(a == sp.a || b == sp.b){
            System.out.println("\nHai so phuc bang nhau");
        }
        else{
            System.out.println("\nHai so phuc khong bang nhau");
        }
    }

    // Ham cong 2 so phuc
    public Complex congSP(Complex sp2){
        double thuc = a + sp2.a;
        double ao = b + sp2.b;
        return new Complex(thuc, ao);
    }

    // Ham tru 2 so phuc
    public Complex truSP(Complex sp2) {
        double thuc = a - sp2.a;
        double ao = b - sp2.b;
        return new Complex(thuc, ao);
    }

    // Ham nhan 2 so phuc
    public Complex nhanSP(Complex sp2) {
        double thuc = a * sp2.a - b * sp2.b;
        double ao = a * sp2.b + sp2.a * b;
        return new Complex(thuc, ao);
    }

    // Ham chia 2 so phuc
    public Complex chiaSP(Complex sp2) {
        double thuc = (a * sp2.a + b * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        double ao = (sp2.a * b - a * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        return new Complex(thuc, ao);
    }

    // Ham nhan so thuc voi so phuc
    public Complex stnhansp(Double n){
        return new Complex((a * n), (b * n));
    }

    // Tra ve so phuc lien hop
    public Complex Conjugate(){
        return new Complex(a , -b);
    }
}     