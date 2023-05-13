package odevler;

import java.util.Scanner;

public class MinMaxSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Girilecek Sayı Adedi: ");
        int n = input.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            number = input.nextInt();

            //Burada veya min değer 0 a eşittiri koymadığımızda en küçük sayı her zaman yukarıda tanımladığımız gibi 0 oluyor.
            if (number < min) {
                min = number;
            }
            //Girilen sayı tanımlanan max değerden büyükse max değişkenine girilen sayı atanıyor.
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Girilen Sayılardan En Küçük Değer: " + min);
        System.out.println("Girilen Sayılardan En Büyük Değer: " + max);

    }
}
