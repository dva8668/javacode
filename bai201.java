package mang;
import java.util.*;

public class bai201 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i ++) {
            arr[i] = in.nextInt();
        }
        boolean kiemtra = true;
        int x;
        for(int i = 0; i <= n/2; i++){
            x = n - 1 - i;
            if(arr[i] != arr[x])
            kiemtra = false;
            break;
        }
        if(kiemtra == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
