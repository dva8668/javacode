package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class J030044 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0) {
            String n = in.nextLine();
            System.out.println(chuanHoa(n));
        }
    }
    public static String chuanHoa(String n) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(n);
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i ++) {
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString();
    }
}
