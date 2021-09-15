package string;

import java.util.Scanner;

public class J03026 {
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String a = in.next();
            String b = in.next();
            int check =0;
            if(a.length() < b.length()) {
                System.out.println(b.length());
            }
            else if(b.length() < a.length()) {
                System.out.println(a.length());
            }
            if(a.length() == b.length()) {
                for(int i = 0; i < a.length(); i++) {
                    if(a.charAt(i) == b.charAt(i)) {
                        check++;
                    }
                }
                if(check == a.length()) {
                    System.out.println("-1");
                }
                else {
                    System.out.println(a.length());
                }
            }
        }
    }
}
