import java.util.Arrays;
import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        int mang[] = new int[5];

        try (Scanner s = new Scanner(System.in)) {
			for (int i = 0; i < mang.length; i++) {
			    // Yeu cau nhap vao phan tu
			    System.out.printf("Nhap phan tu thu %d: ", (i + 1));
			    mang[i] = s.nextInt();
			}
		}
        // in ra gia tri phan tu cua mang
        System.out.println("Phan tu mang: " + Arrays.toString(mang));

        // sap xep cac phan tu trong mang
        Arrays.sort(mang);
        System.out.println("Phan tu mang sau khi sap xep: " + Arrays.toString(mang));
    }
}

