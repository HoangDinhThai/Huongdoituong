import java.util.Scanner;

public class mainpoint {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        point a = new point();
        a.nhap(in);
        a.xuat();

        point b = new point();
        b.nhap(in);
        b.xuat();

        point c = new point();
        c.nhap(in);
        c.xuat();
        
        // a.setX();
        // a.setY();
        // a.getX();
        // a.getY();
        
        
        // b.setX();
        // b.setY();
        // b.getX();
        // b.getY();
        
        
        // c.setX();
        // b.setY();
        // c.getX();
        // c.getY();

        double kc1 = a.khoangCach(b);
        System.out.print("\nKhoang cach tu a toi b la: " +kc1);
        double kc2 = a.khoangCach(c);
        System.out.print("\nKhoang cach tu a toi c la: " +kc2);
        double kc3 = b.khoangCach(c);
        System.out.print("\nKhoang cach tu b toi c la: " +kc3);

        int kt;
        kt = point.kiemTra(a,b,c);
        if(kt == 1){
            System.out.println("\nBa diem thang hang theo thu tu b - a - c");
        }
        if(kt == 2){
            System.out.println("\nBa diem thang hang theo thu tu a - b - c");
        }
        if(kt == 3){
            System.out.println("\nBa diem thang hang theo thu tu a - c - b");
        }
        if(kt == 0){
            System.out.println("\nBa diem khong thang hang");
            System.out.println("\nChu vi tam giac abc la: " +point.chuVi(a, b, c));
            System.out.println("\nDien tich tam giac la: " +point.dienTich(a, b, c));
        }
    }
}
