package coban;
import java.util.Scanner;

public class checkfibo {
    static long a[]= new long[100];
    public static long fibo(int n) {
        a[0] = 0 ; a[1] = 1;
        for(int i = 2 ; i <= 92; i ++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
            while(t-->0) {
            long n = in.nextLong();
            if(check(n))
            System.out.println("YES");
            else System.out.println("NO");
        }   
    }

     public static boolean check(long n) {
     for(int i = 0; fibo(i) <= n; i ++) {
        if(fibo(i) == n) 
            return true;
        }
        return false;
    }
}