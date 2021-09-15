package coban;
import java.text.DecimalFormat;
import java.util.Scanner;

public class chia_tam_giac {
    public static void main(String[] args){
        DecimalFormat format = new DecimalFormat("0.000000");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0) {
            int n = in.nextInt();
            int h = in.nextInt();
            for(int i = 1; i < n; i ++) {
                double x =  h*(Math.sqrt((double)i/n));
                System.out.print(format.format(x) + " ");
            }
            System.out.println();
        }
    }
}
