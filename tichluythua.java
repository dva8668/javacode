package coban;
import java.util.*;
import java.text.DecimalFormat;
public class tichluythua {
static int M = (int)(1E9 + 7);
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0");
        Scanner in = new Scanner(System.in);
        double x;
        long a;
        double b;
        int t = 20;
        while(t-->0) {
            a = in.nextLong();
            b = in.nextDouble();
            if( a == 0 && b == 0) {
                break;
            }
            x = Math.pow(a, b);
            if(x > Math.pow(2, 64)-1) {
                x = x % M;
            }
            System.out.println(format.format(x));
            
        
        }
    }
}
