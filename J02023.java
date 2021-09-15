package mang;
import java.util.*;

public class J02023 {
    static int a[] = new int[101];
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test -->0) {
        int t = in.nextInt();
        for(int i = 0; i < t; i ++) {
            a[i] = in.nextInt();
        }
        ArrayList<ArrayList<Integer>> ds = new ArrayList<>();
        for(int i = 0; i < t - 1 ; i++) {
            boolean check = false;
            ArrayList<Integer> tmp = new ArrayList<>();
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
                for(int j = 0; j < t; j ++) {
                    tmp.add(a[j]);
                    
                }
                ds.add(tmp);  
            }
            for (int index = ds.size() ; index > 0; index--)  {
                System.out.print("Buoc " + index + ": ");
                for (Integer tmp : ds.get(index - 1)) {
                    System.out.print(tmp + " ");
                }
                System.out.println();  
            }
        }
    }
}
