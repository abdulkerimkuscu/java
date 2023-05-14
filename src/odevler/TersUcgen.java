package odevler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Satır Olsun: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            //Boşlukları burada oluşturuyoruz
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            //Yıldızları burada oluşturuyoruz
            int starCount = (number + 1) - i; // hangi satırda kaç yıldız varsa burada hesaplıyoruz.
            for (int k = 1; k <= 2 * starCount - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
