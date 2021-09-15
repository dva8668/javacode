package coban;
import java.util.Scanner;

public class testnguyento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 1; j <= t; j ++) {
            Long n = in.nextLong();
            System.out.printf("Test " + j + ": ");
            for(int i = 2; i <= n; i++) {
                int dem = 0;
                while(n % i == 0) {
                    dem++;
                    n /=i;
                }
                if(dem==0) continue;
                System.out.printf(i + "(" + dem + ") ");
            }
            System.out.println();
        }
    }
}
