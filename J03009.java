package string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class J03009 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0) {
            String n = in.nextLine();
            String m = in.nextLine();
            String[] temp1 = n.split(" ");
            String[] temp2 = m.split(" ");
            ArrayList <String> tmp = new ArrayList<>();
            for (int i = 0; i < temp1.length; i++) {
                int check = 0;
                for (int j = 0; j < temp2.length; j++) {
                    if(temp2[j].equals(temp1[i]) == false) {
                        check ++;
                    }
                }
                if(check == temp2.length) {
                    tmp.add(temp1[i]);
                }
            }
            HashSet <String> set = new HashSet<String>(tmp);
            for(String element : set) {
                System.out.print(element + " ");
            }
            System.out.println();
            
        }
    }
    
}
