package coban;
import java.util.Scanner;

public class tinhtong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), j;
        long a[] = new long[n];
        for(j = 0; j < n; j ++) {
            long s = 0;
            a[j] = in.nextInt();
            s = (a[j]*(1 + a[j]))/2;
            System.out.println(s);
        }
    }
}
