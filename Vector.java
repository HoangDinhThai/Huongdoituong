import java.util.*;

public class Vector {
    private int n;
    private double[] a;

    Vector() {

    }

    Vector(int n) {
        this.n = n;
        this.a = new double[n];
    }

    Vector(double[] b) {
        this.n = b.length;
        a = new double[n];
        this.a = b;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double dodai() {
        double res = 0;
        for (int i = 0; i < n; i++)
            res += this.a[i] * this.a[i];
        return Math.sqrt(res);
    }

    public Vector congVector(Vector y) {
        Vector res = new Vector(n);
        for (int i = 0; i < n; i++) {
            res.a[i] = y.a[i] + this.a[i];
        }
        return res;
    }

    public Vector truVector(Vector y) {
        Vector res = new Vector(n);
        for (int i = 0; i < n; i++) {
            res.a[i] = this.a[i] - y.a[i];
        }
        return res;
    }

    public Vector nhanVectorVoiSo(double y) {
        Vector res = new Vector(n);
        for (int i = 0; i < n; i++)
            res.a[i] = y * this.a[i];
        return res;
    }

    public Vector vectorDonVi() {
        Vector res = new Vector(n);
        for (int i = 0; i < n; i++) {
            res.a[i] = this.a[i] / this.dodai();
        }
        return res;
    }

    public String toString() {
        String s = "(";
        for (int i = 0; i < n; i++) {
            if (i < n - 1)
                s += Double.toString(this.a[i]) + ",";
            else
                s += Double.toString(this.a[i]) + ")";
        }
        return s;
    }

    public static void main(String[] args) {
        double dim[] = {1.1, 2.1, 1.3, 2.3, 1.32};
        double dim1[] = {1, 2, 3, 4, 5, 6};
        double test = 5.64;
        Vector a = new Vector(6);
        Vector b = new Vector(dim);
        Vector c = new Vector(dim1);
        System.out.println("Do dai cua vector b voi " + b.n + " chieu la: " + b.dodai());
        System.out.println("Tong 2 vector b va c la: " + b.congVector(c).toString());
        System.out.println("Hieu 2 vector b va c la: " + b.truVector(c).toString());
        System.out.println("Tich vector b va " + test + " la:" + b.nhanVectorVoiSo(test).toString());
        System.out.println("Vector don vi cua b la:" + b.vectorDonVi().toString());

    }
}
