package mang;
import java.util.*;

public class J02010 {
    static int a[] = new int[101];
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i ++) {
            a[i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i < t-1 ; i++) {
                for(int j = i + 1; j < t; j++) {
                    if(a[i] > a[j]) {
                        int min = a[i];
                        a[i] = a[j];
                        a[j] = min;
                    }
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
