package mang;
import java.util.*;


public class J02014 {
    static int[] a = new int[100001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean check;
            while(t-->0) {
                int n = in.nextInt();
                for(int x = 0; x < n; x ++) {
                    a[x] = in.nextInt();
                }  
                int sum = 0;
                int sum_left =0;
                for(int i =0; i <n; ++i) {
                    sum +=  a[i];
                }
                check = false;
                for(int i = 0; i <n; ++i) {
                    sum -= a[i];
                    int sum_right = sum;
                    if(sum_left == sum_right) {
                        System.out.println(i+1);
                        check = true;
                        break;
                    }
                    sum_left += a[i];
                }
                if(!check) {
                    System.out.println("-1");
                }
        }
    }
}  

