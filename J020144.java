package mang;

import java.util.Scanner;

public class J020144 {
    public static long[] a = new long[100001];
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long sum = 0;
        while(t-->0) {
            int n = in.nextInt();
            for(int i = 0; i < n; i ++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
                System.out.println(diemcanbang(n, sum));
        }
    }
    public static int diemcanbang(int n, long sum) {
        long sum_cur = 0;
        for(int i = 0; i < n; i ++) {
            if(sum_cur*2 == sum - a[i]) {
                return i+1;
            }
            else {
                sum_cur += a[i];
            }
        }
        return -1;
    }
}
