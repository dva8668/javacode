package string;
import java.math.BigInteger;
import java.util.*;

public class J03011 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {

            BigInteger a = in.nextBigInteger();
            int n1 = a.toString().length();
            BigInteger b = in.nextBigInteger();
            int n2 = b.toString().length();
            BigInteger sub = b.subtract(a).abs();
            int n3 = sub.toString().length();
            if(n1 < n2) {
                for(int i =0; i < n2 - n3; i++) {
                    System.out.print("0");
            }
        }
        else {
            for (int i = 0; i < n1-n3; i++) {
                System.out.print("0");
            }

        }
            System.out.println(sub);
        }
    }
    
    
}
