package coban;
import java.util.*;
public class nguyentolonnhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            long n = in.nextLong();
            long x = 0;
            for(int i =2; i <= n; i ++) {
                while(n % i == 0) {
                    x = i;
                    n /=i;
                }
            }
            System.out.println(x);

        }
    }
}
