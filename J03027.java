package string;

import java.util.Scanner;

public class J03027 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        StringBuffer tmp = new StringBuffer(n);
        for (int j = 0; j < n.length(); j++) {
            int check = 0;
            for(int i = 0; i < tmp.length() - 1; i ++) {
                if(tmp.charAt(i) == tmp.charAt(i+1)) {
                    check ++;
                    tmp.delete(i, i+2);
                } 
            }
            if(check == 0) {
                break;
            }
        }
        if(tmp.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(tmp);
        }
    }
}
