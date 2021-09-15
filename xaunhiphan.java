package coban;
import java.util.Scanner;

public class xaunhiphan {
    static long a[] = new long[100];
    public static void createFibo() {
        a[0] = 0 ; a[1] = 1;
        for (int i = 2; i <=92 ; i ++) {
            a[i] = a[i - 1] + a[i - 2]; 
        }
    }
    public static void main(String[] args) {
        createFibo();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0) {
            int t = in.nextInt();
            long k = in.nextLong();
            System.out.println(fibo(t, k));
        }
    }
        public static int fibo(int t, long k) {
            if(t == 1) return 0;
            if(t == 2) return 1;
            if(k > a[t-2]) return fibo(t-1, k - a[t-2]) ;
            return fibo(t-2, k);
    }
}
