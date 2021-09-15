package string;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            String n = in.next();
            long sum1 = 0;
            long sum2 = 0;
            for(int i = 0; i < n.length() ; i +=2) {
                sum1 += n.charAt(i) - 48;
            }
            for(int j = 1; j < n.length(); j +=2) {
                sum2 += n.charAt(j) - 48;
            }
            if((sum1-sum2) % 11 == 0) {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
    }
}
