package mang;
import java.util.*;

public class mangrandom {
    public static void main(String[] args) 
    {
        int []a;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Random random = new Random();
        a = new int[n];
        int count = 0;
        while(count < n) {
            a[count++] = random.nextInt();//sinh random mang;

        }
        int [] b = new int[n];
        int bSize = 0;
        boolean isExist;
        for (int i = 0; i < n; i++) {
            isExist = false;
            for (int j = 0; j < count; j++) {
                if(a[i] == b[j]) {
                    isExist = true;
                    break;
                }
            }
            if(!isExist) {
                b[bSize++] = a[i];
            }
        }
        System.out.println("Truoc khi sap xep : ");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("Sau khi sap xep: ");
        System.out.println(Arrays.toString(a));

        Arrays.sort(b);
        System.out.println("Mang chua cac phan tu duy nhat: ");
        System.out.println(Arrays.toString(b));
    }
}
