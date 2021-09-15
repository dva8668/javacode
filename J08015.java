package string;

import java.util.Scanner;

public class J08015 {
    public static long a[] = new long[100001];
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            long sum = in.nextLong();
            int check = 0;
            for(int x = 0; x < n; x ++) {
                a[x] = in.nextLong();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i+1; j < n; j++) {
                    if(a[i] + a[j] == sum) {
                        check ++;
                    }
                }
            }
            System.out.println(check);
            
        }
    }
}
