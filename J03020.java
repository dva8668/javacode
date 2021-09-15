package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class J03020 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        String st [] = n.split(" ");
        for(int i =0; i < st.length; i ++) {
            if(doiXung(st[i])){
                list.add(st[i]);
            } else {
                continue;
            }
        }
        ArrayList<String> list2 = new ArrayList<>();
        int max = list.get(0).length();
        int size = list.size();
        int check = 0;
        for(int i = 0; i < size; i ++) {
            if(max < list.get(i).length()) {
                max = list.get(i).length();
            }
        }
        for(int i = 0; i < size; i ++) {
            if(max == list.get(i).length()) {
                check ++;
                list2.add(list.get(i));
            }
        }
        
        Set <String> set = new HashSet<String>(list2);
        for(String element : set) {
            System.out.print(element + " " + Collections.frequency(list2, element));
            System.out.println();
        }
        


    }
    public static Boolean doiXung(String tmp) {
        int check = 0;
        for (int i = 0; i < tmp.length()/2; i++) {
            if(tmp.charAt(i) == tmp.charAt(tmp.length() - i -1)) {
                check ++;
            }
        }
        if(tmp.length() % 2 == 0) {
            if(check == tmp.length()/2) {
                return true;
            } else {
                return false;
            }
        } else {
            if(check == tmp.length()/2 || check == tmp.length()/2 +1) {
                return true;
            } else {
                return false;
            }
        }
    }
}

