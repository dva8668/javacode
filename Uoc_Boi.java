package coban;
import java.util.Scanner;

public class Uoc_Boi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            long a = in.nextLong();
            long b = in.nextLong();
            System.out.println(BCNN(a, b) + " " + UCLN(a, b)  );
        }
    }
    public static long UCLN(long a, long b) {
        if ( b == 0) return a;
        return UCLN(b, a%b);
    }
    public static long BCNN(long a, long b){ 
        return (a*b)/UCLN(a, b);
    }
}
