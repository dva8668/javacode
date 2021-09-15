package coban;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ptbac1 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a == 0) {
            if(b == 0) {
            System.out.println("VSN");
        }
        else {
            System.out.println("VN");
        }
    }
        else {
            
            double c = (double) -b/a;
            System.out.println(format.format(c));
        }
    }
}