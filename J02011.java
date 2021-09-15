package mang;
import java.util.*;

public class J02011 {
    static int a[] = new int[101];
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i ++) {
            a[i] = in.nextInt();
        }
        ArrayList<ArrayList<Integer>> ds = new ArrayList<>();
        for(int i = 0; i < t-1 ; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
             int min = i;
                for(int j = i + 1; j < t; j++) {
                    if(a[j] < a[min]) {
                        min = j;
                    }

                }
                if(a[i] > a[min]){
                    int change = a[i];
                    a[i]= a[min];
                    a[min]= change;
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
