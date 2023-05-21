package odevler;

import java.util.Scanner;

public class PrimeNumber {
    // boolean bir fonksiyon tanımladım
    static boolean isPrime() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int num = scan.nextInt();
        int result = 0;
        boolean prime = true;

        // sayının asal olması için kendisine kadar olan sayılara bölümünden kalanı bulmaya çalıştık
        // eğer hiç yoksa result tanımladığımız gibi 0 oluyor varsa bir arttırıyoruz

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result++;
            }
        }

        // resulta göre asal olup olmadığınız koşullu ifade ile yazdık

        if (result != 0) {
            prime = false;
            System.out.println(num + " Asal Sayı Değildir");
        } else {

            System.out.println(num + " Asal Sayıdır");
        }

        return prime;

    }

    public static void main(String[] args) {
        System.out.println(isPrime());
    }
}
