package string;

import java.util.Scanner;

public class J03025 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while(t-->0) {
                String n = in.next();
                String tmp[] = n.split("");
                int check = 0;
                for(int i = 0; i < n.length()/2; i++) {
                    if(tmp[i].equals(tmp[tmp.length -i - 1])) {
                        check ++;
                    }
                }
                if(tmp.length %2 == 0)  {
                    if(check == tmp.length/2 - 1) {
                        System.out.println("YES");
                    }
                    else System.out.println("NO");
                }
                else {
                    if(check == tmp.length/2 || check == tmp.length/2 -1) {
                        System.out.println("YES");
                    }
                    else
                    {
                        System.out.println("NO");
                    }
                }
                
            }
    }
}
