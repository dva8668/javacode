package mang;
import java.util.*;
import java.text.DecimalFormat;

public class J02008 {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            double n = in.nextInt();
            double temp = 1;
            for(double i = 1; i <=n; i++) {
                temp = LCM(temp, i);
            }
                System.out.println(format.format(temp));
        }
    }
    public static double LCM(double a, double b) {
        return(a*b)/GCD(a, b);
    }

    public static double GCD(double a, double b) {
        double tmp;
        while( b!= 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
