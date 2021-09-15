package string;

import java.util.Scanner;

public class J03007 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean check = true;
        int t = in.nextInt();
        while(t-->0) {
            String n = in.next();
            int a = n.length();
            int sum = 0;
            for(int i = 0; i < a; i ++) {
                    sum += n.charAt(i) - 48;
            }
            for(int i =0; i <=a/2; i ++) {
                check = false;
                if(sum % 10 != 0 || n.charAt(i) != n.charAt(a - i - 1)) {
                    check = false;
                    break;
                }
                else check = true;
            }
            if(check == true) {
                System.out.println("YES");
            }
            else System.out.println("NO");
            
    
            }
    }
}
