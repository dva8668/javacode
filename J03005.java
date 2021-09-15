package string;

import java.util.Scanner;

public class J03005 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0) {
            String n = in.nextLine();
            n = n.replaceAll("\\s+", " ");
            n = n.trim().toLowerCase();
            String[] temp = n.split(" ");
            String m ="";
            for(int i = 1; i < temp.length; i ++) {
                m += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                if(i < temp.length - 1) {
                    m += " ";
                }
            }
            m += ", ";
            m += String.valueOf(temp[0].toUpperCase());
            System.out.println(m);
        }
    }
}
