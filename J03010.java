package string;

import java.util.Scanner;

public class J03010 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        String [] ds = new String[10];
        for (int j = 0; j < t; j++) {
            String n = in.nextLine().trim().toLowerCase();
            String mail[] = n.split("\\s+");
            StringBuilder tmp = new StringBuilder();
            tmp.append(mail[mail.length - 1]);
            for(int i = 0; i < mail.length - 1; i ++) {
                tmp.append(mail[i].charAt(0));
            }
            ds[j] = tmp.toString();
        }
            for(int j = 0; j < t; j ++) {
                int d = 1;
                for (int i =  j - 1 ; i >= 0; i--) {
                    if(ds[j].equals(ds[i])) {
                        d+=1;
                    }
                }
                if(d==1) System.out.println(ds[j] + "@ptit.edu.vn");
                else System.out.println(ds[j] + d + "@ptit.edu.vn");
            }
    }
}
