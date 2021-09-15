package mang;
import java.util.*;

public class J02012 {
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a[] = new int[t];
        int res[] = new int[t];
        for(int i = 0; i < t; i ++) {
            a[i] = in.nextInt();  
        }
        int index, value;
        int count = -1;
        for(int i = 0; i < t; i ++) {
            index = i;
            value = a[i];
            while(index > 0 && a[index-1] > value) {
                a[index] = a[index - 1];
                index--;
            }
            count ++;
            a[index] = value;
            System.out.print("Buoc "+ count + ": ");
            System.out.println(a);
            System.out.println();
        }


    }
}
