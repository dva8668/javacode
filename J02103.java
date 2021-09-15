package mang;

import java.util.Scanner;

public class J02103 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int x = 1; x <= t; x ++){
            System.out.println("Test " + x + ":");
            int n = in.nextInt();
            int m = in.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            int c[][] = new int[n][n];
            for(int i =0; i < n; i ++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[j][i] = a[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = 0;
                    for (int j2 = 0; j2 < m; j2++) {
                        c[i][j] = c[i][j] + a[i][j2]*b[j2][j];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
