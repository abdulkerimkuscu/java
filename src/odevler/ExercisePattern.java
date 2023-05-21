package odevler;

import java.util.Scanner;

public class ExercisePattern {

    static void pattern() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int number = input.nextInt();

        int temporary = number; // Burada yeni bir değişken oluşturup gidiğimiz sayıya atadık ki girdiğimiz sayı elimizde kalsın yeni değişken ile geriye doğru sayalım
        for (int i = 0; 0 < temporary; i++) {
            System.out.print(" " + temporary);
            temporary = temporary - 5;

        }
        // Burada 0 veya eksiye inen temporary (geçici) değişkenimiz ile girdiğimiz sayıya ulaşana kadar tekrardan ileri doğru saydık ve deseni oluşturduk
        for (int j = 1; temporary <= number; j++) {
            System.out.print(" " + temporary);
            temporary = temporary + 5;
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
