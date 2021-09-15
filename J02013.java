package mang;
import java.util.*;

public class J02013 {
    static int a[] = new int[101];
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i ++) {
            a[i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i < t - 1 ; i++) {
            boolean check = false;
                for(int j = 0; j < t-i-1; j++) {
                    if(a[j] > a[j+1]) {
                        int min = a[j];
                        a[j] = a[j+1];
                        a[j+1] = min;
                        check = true;
                    }
                }
                if(check == false) {
                    break;
                }
                count ++;
                System.out.print("Buoc "+ count + ": " );
                for(int j = 0; j < t; j ++) {
                    System.out.print(a[j] + " ");
                    
            }
                System.out.println();
        }
    }
}
