package string;

import java.util.Scanner;

public class J03008 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            String n = in.next();
            int a = n.length();
            int check = 0;
            for(int i = 0; i < a/2; i++) {
                if(n.charAt(i) == n.charAt(a-i-1) && songuyento(n.charAt(i))) {
                    check ++;
                } else {
                    System.out.println("NO");
                    break;
                }
            }
            
            if(check == a/2) {
                System.out.println("YES");
            }
        }
    }
    public static boolean songuyento(char n) {
        if(n == '2' || n == '3' || n == '5' || n == '7') {
            return true;
        }
        return false;
    }
}