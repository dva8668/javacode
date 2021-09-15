package mang;

import java.util.Scanner;

public class J02020 {
    private int i, n, k, a[];

    public void Init() {
        Scanner input = new Scanner(System.in);
        do {
            this.n = input.nextInt();
            this.k = input.nextInt();
        } while (this.n < 0 || this.k > this.n);
        a = new int[n+1];
        for (int j = 1; j <= this.k; j++)
            a[j] = j;
    }

    public void Result() {
        for (int j = 1; j <= k; j++)
            System.out.print(a[j]);
        System.out.print(" ");
    }

    public void sinhToHop() {
        int count = 1;
        do {
            Result();
          this.i = this.k;
          while (this.i > 0 && a[i] == this.n -this.k + i) -- i;
          if (this.i > 0) {
              a[i]++;
              for (int j = i + 1; j <= this.k; j++) {
                  a[j] = a[j-1] + 1;
              }
              count ++;
          }

        } while (this.i != 0);
        System.out.println("\nTong cong co " + count + " to hop");

    }
    public static void main(String[] agrs) {
        J02020 tohop = new J02020();
        tohop.Init();
        tohop.sinhToHop();
        System.gc();
    }
}
