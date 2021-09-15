package mang;
import java.util.*;

public class J02104 {
    public static int[][] a = new int[1001][1001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n][n];
        for(int i =0; i <n; i ++) {
            for(int j =0; j < n; j ++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j] == 1 && a[j][i] == 1) {
                    System.out.println("(" + (i+1) +"," +(j+1) +")");
                }
                a[i][j] = a[j][i] =0;
            }
        }
    }
    
}
