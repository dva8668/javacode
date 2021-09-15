package coban;
import java.util.*;
public class TongUoc {
    public static boolean[] isTrue = new boolean[2000006];
    public static int [] arrTrue = new int[200005];

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
        long Res =0;
        for (int i = 0; i < t; i++) {
            if(isTrue[a[i]]) {
                Res += a[i];
            }
            else {
                int k =0;
                while(a[i] != 1) {
                    while(a[i] % arrTrue[k] ==0) {
                        Res += arrTrue[k];
                        a[i] /= arrTrue[k];
                    }
                    if(isTrue[a[i]]) {
                        Res += a[i];
                        break;
                    }
                    k++;
                }
            }
        }
        System.out.println(Res);
        in.close();
    }
}
