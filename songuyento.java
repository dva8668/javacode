package coban;
import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            if(Ngto(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static Boolean Ngto(int n){
        if(n<2) return false;
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n%i == 0) {
                return false;
            }            
        }
        return true;
    }
}