package coban;
import java.util.*;
public class uocchia2 {
    public static boolean[] isTrue = new boolean[1000000009];
    public static long [] arrTrue = new long[100000009];

    public static void nguyenTo() {
        Arrays.fill(isTrue, true);
        isTrue[0] =false;
        isTrue[1] = false;
        int k =0;
        for (int i = 0; i*i < isTrue.length; i++) {
            if(isTrue[i]) {
                arrTrue[k] = i;
                k ++;
                for (int j = i*i; j < isTrue.length; j+=i) {
                    isTrue[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int [] a = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = in.nextInt();
        }
        nguyenTo();
        int count =0;
        for (int i = 0; i < t; i++) {
            if(isTrue[a[i]] && a[i]%2 == 0) {
                count ++;
            }
           
        }
        
    }
}
