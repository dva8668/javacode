package mang;

import java.util.ArrayList;
import java.util.Scanner;

public class J02029 {
   static int [] a = new int [101];
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int test = in.nextInt();
       while(test --> 0) {
           int t = in.nextInt();
           for(int i =0; i < t; i ++) {
               a[i] = in.nextInt();
           }
           ArrayList<ArrayList<Integer>> ds = new ArrayList<>();
           for(int i = 0; i < t-1 ; i++) {
               ArrayList<Integer> tmp = new ArrayList<>();
               for (int j = i + 1; j < t; j++) {
                   if(a[i] > a[j]) {
                       int min = a[i];
                       a[i] = a[j];
                       a[j] = min;
                   }
               }
               for(int j = 0; j < t; j ++) {
                   tmp.add(a[j]);
               }
               ds.add(tmp);
           }
           for(int i = ds.size(); i >0 ; i--) {
               System.out.print("Buoc " + i + ": ");
               for(Integer tmp : ds.get(i - 1)) {
                  System.out.print(tmp+ " ");
               }
               System.out.println();
           }
       }
   } 
}
