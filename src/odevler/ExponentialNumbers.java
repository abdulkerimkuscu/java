package odevler;

import java.util.Scanner;

public class ExponentialNumbers {
    // Üs Alma Metodunu Buraya yazdık
    // Void Fonksiyonu Tercih Etmedim Return Fonksiyonu Kullandım
    static int power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayısını Giriniz: ");
        int x = input.nextInt();
        System.out.print("Üs Sayısını Giriniz: ");
        int y = input.nextInt();
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        // Metodu Main Metodu İçinde Çağırdık
        System.out.println("Sonuç: " + power());
    }
}
