package pratikler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, cikarma, kombinasyon, nfac = 1, rfac = 1, cikarmafac = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısını Giriniz: ");
        n = input.nextInt();

        System.out.print("R Sayısını Giriniz: ");
        r = input.nextInt();

        cikarma = n - r;

        for (int i = 1; i <= n; i++) {
            nfac *= i;
        }
        for (int i = 1; i <= r; i++) {
            rfac *= i;
        }
        for (int i = 1; i <= cikarma; i++) {
            cikarmafac *= i;
        }

        kombinasyon = nfac / (rfac * cikarmafac);

        System.out.println("Kombinasyon :" + kombinasyon);
    }
}




