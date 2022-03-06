import java.util.Scanner;

public class matran 
{

    public static void main(String[] args) 
    {
        int m1, n1;
        int m2, n2; 
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số dòng của ma trận A: ");
        m1 = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận A: ");
         n1 = scanner.nextInt();
         
        System.out.println("Nhập vào số dòng của ma trận B: ");
        m2 = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận B: ");
        n2 = scanner.nextInt();
         
        int[][] A = new int[m1][n1];
        int[][] B = new int[m2][n2];
        int C[][] = new int[m1][n2];
            if (n1 != m2) {
                System.out.println("Để nhân hai ma trận thì "
                    + "số cột của ma trận A phải bằng số dòng của ma trận B");
                System.out.println("Nhập lại số cột của ma trận A: ");
                n1 = scanner.nextInt();
                System.out.println("Nhập vào số dòng của ma trận B: ");
                m2 = scanner.nextInt();
            } else {
                System.out.println("Nhập vào các phần tử của ma trận A: ");
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n1; j++) {
                        System.out.print("A[" + i + "]["+ j + "] = ");
                        A[i][j] = scanner.nextInt();
                    }
                }
                 
                System.out.println("Nhập vào các phần tử của ma trận A: ");
                for (int i = 0; i < m2; i++) {
                    for (int j = 0; j < n2; j++) {
                        System.out.print("B[" + i + "]["+ j + "] = ");
                        B[i][j] = scanner.nextInt();
                    }
                }
                 
                System.out.println("Ma trận A: ");
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n1; j++) {
                        System.out.print(A[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
             
                System.out.println("Ma trận B: ");
                for (int i = 0; i < m2; i++) {
                    for (int j = 0; j < n2; j++) {
                        System.out.print(B[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n2; j++) {
                        C[i][j] = 0;
                        for (int k = 0; k < n1; k++) {
                            C[i][j] = C[i][j] + A[i][k] * B[k][j];
                        }
                    }
            }
                System.out.println("Ma trận tích C: ");
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n2; j++) {
                        System.out.print(C[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
                int D[][] = new int[n2][m1];
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n2; j++) {
                        D[j][i] = C[i][j];
                    }
                }
                System.out.println("Ma trận chuyển vị của ma trận C là: ");
                for (int i = 0; i < n2; i++) {
                    for (int j = 0; j < m1; j++) {
                        System.out.print(D[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
            }
    }
}