package mang;
import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int x = 1; x <= t; x ++) {
            System.out.println("Test " + x +":");
            int n = in.nextInt();
            int arr[] = new int[101];
            int res[] = new int[101];
            int count;
            for(int i = 0; i < n; i ++) {
                arr[i] = in.nextInt();
                res[i] = -1;
            }
            for(int i = 0; i < n; i ++) {
                count = 1;
                for(int j = i +1; j <n; j ++) {
                    if(res[j] != 0 && arr[i] == arr[j]) {
                        count++;
                        res[j] = 0;
                    }
    
                }
                if(res[i] == 0) {
                    continue;
                }
                System.out.println(arr[i] + " xuat hien " + count + " lan");
            }   
        }
    }
    
}
