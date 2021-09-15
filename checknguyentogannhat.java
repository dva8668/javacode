package mang;
import java.util.*;

public class checknguyentogannhat {
    public static void main(String[] args) {
        int x, n, index = -1, min = Integer.MAX_VALUE;
        int a[];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        x = in.nextInt();
        a = new int[n];
        for(int i = 0; i <n; i ++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i <n; i ++) {
            if(nguyento(a[i]) && getMin(a[i], x) < min) {
                min = getMin(a[i], x);
                index = i;
            }
        }
        if(index != -1) {
            System.out.println(index + "gia tri = " + a[index]);
        }
    }
    public static int getMin(int a, int x) {
        return Math.abs(a-x);
    }
    public static boolean nguyento(int n) {
        int a = (int)Math.sqrt(n);
        for(int i = 2; i <= a; i ++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
