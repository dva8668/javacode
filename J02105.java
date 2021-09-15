package mang;
import java.util.*;

public class J02105 {
    public static int[][] a = new int[1001][1001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }  
        }
        for (int i = 0; i < n; i++) {
            System.out.print("List" + "(" + (i+1) +")" + " = ");
            for (int j = 0; j < n; j++) {
                if(a[i][j] == 1) {
                    System.out.print(j+1 + " ");
                }
            }
            System.out.println();
        }
        
    }
}
