package coban;
import java.util.Scanner;

public class fibonaci {
    static long a[]= new long[100];
    public static void Fibo() {
        a[1] = a[2] = 1;
        for(int i = 3 ; i <= 92; i ++) {
            a[i] = a[i-1] + a[i-2];
        }
    }
    public static void main(String[] args) {
        Fibo();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0) {
            int t = in.nextInt();
            System.out.println(a[t]);
        }
    }
}
