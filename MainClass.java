import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Complex sp1 = new Complex();
        Complex sp2 = new Complex();

        // Nhap
        System.out.println("Nhap vao so phuc 1: \n");
        sp1.nhap(sc);
        System.out.println("\nNhap vao so phuc 2: \n");
        sp2.nhap(sc);

        // Hien thi
        System.out.println("\nSo phuc 1 la: ");
        System.out.println(sp1.toString()); 
        System.out.println("\nSo phuc 2 la: ");
        System.out.println(sp2.toString());

        // Hien thi
        System.out.println("\nKet qua cua phep modun la: ");
        System.out.println(sp1.modun());
        
        sp1.Compare(sp2);
        
        System.out.println("\nKet qua cua phep so thuc nhan voi so phuc la: ");
        Complex stnhansp = new Complex();
        stnhansp = sp1.stnhansp(1.2);
        System.out.println(stnhansp.toString());

        System.out.println("\nSo phuc lien hop la: ");
        Complex splienhop = new Complex();
        splienhop = sp1.Conjugate();
        System.out.println(splienhop.toString());

        sc.close();
    }
}