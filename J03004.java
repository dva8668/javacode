package string;

import java.util.Scanner;

public class J03004 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0) {
            String n = in.nextLine();
            n = n.replaceAll("\\s+", " ");
            n = n.trim().toLowerCase();
            String[] temp = n.split(" ");
            n = "";
            for(int i = 0; i < temp.length; i ++) {
                n += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                if(i < temp.length - 1) {
                    n += " ";
                }
            }
            System.out.println(n);
        }
        
    }
}
